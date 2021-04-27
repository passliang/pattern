package com.style.pattern.prototype.deep;

import java.io.*;
import java.util.ArrayList;


/**
 * @author leon
 * @date 2021-04-26 21:32:22
 */
public class Member implements Cloneable,Serializable {
	private String name;
	private Integer sex;

	private ArrayList<String> hobbies;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public ArrayList<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Object deepHobbiesClone() throws CloneNotSupportedException {
		Member member = (Member) super.clone();
		ArrayList<String> hobbies = member.getHobbies();
		this.hobbies = (ArrayList<String>) hobbies.clone();
		return member;
	}

	public Object deepClone() {

		try {
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream);
			oos.writeObject(this);

			ByteArrayInputStream be = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(be);
			return ois.readObject();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String toString() {
		return "Member{" +
				"name='" + name + '\'' +
				", sex=" + sex +
				", hobbies=" + hobbies +
				'}';
	}
}
