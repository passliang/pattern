package com.style.pattern.singleton.seriable;

import java.io.*;

/**
 * 序列化 形式
 *
 * @author leon
 * @date 2021-04-27 10:20:51
 */
public class SerialSingleton implements Serializable {
	//序列化
	//将对象状态转化为 字节码数据
	//将字节码通过输入流 写到磁盘上
	//永久保存下来 持久化

	//反序列化
	//将字节码文件 通过IO输入流 读到内存
	//再将内存中的字节码数据 转化为对象

	private static final SerialSingleton SERIAL_SINGLETON = new SerialSingleton();

	public static SerialSingleton getInstance() {
		return SERIAL_SINGLETON;
	}


	public Object readResolve() {
		//java.io.ObjectInputStream.readOrdinaryObject
		//java.io.ObjectStreamClass.hasReadResolveMethod
		return SERIAL_SINGLETON;
	}

	private SerialSingleton() {
	}


	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			SerialSingleton instance = SerialSingleton.getInstance();

			fos = new FileOutputStream("SerialSingleton");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(instance);
			oos.flush();

			fis = new FileInputStream("SerialSingleton");
			ois = new ObjectInputStream(fis);

			SerialSingleton serialSingleton = (SerialSingleton) ois.readObject();
			System.out.println("instance: " + instance);
			System.out.println("serialSingleton: " + serialSingleton);
			System.out.println("instance and serialSingleton "+ (instance == serialSingleton));
			//instance: com.style.pattern.singleton.seriable.SerialSingleton@4c203ea1
			//serialSingleton: com.style.pattern.singleton.seriable.SerialSingleton@5d5eef3d
			//instance and serialSingleton false
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
