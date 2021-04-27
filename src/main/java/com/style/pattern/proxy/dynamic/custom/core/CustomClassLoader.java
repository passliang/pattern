package com.style.pattern.proxy.dynamic.custom.core;

import org.apache.commons.lang3.StringUtils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author leon
 * @date 2021-04-26 20:23:17
 */
public class CustomClassLoader extends ClassLoader {

	private final File classPathFile;

	public CustomClassLoader() {
		String classPath = CustomClassLoader.class.getResource("").getPath();
		classPathFile = new File(classPath);
	}

	@Override
	public Class<?> findClass(String name) throws ClassNotFoundException {
		if (StringUtils.isEmpty(name)) {
			throw new RuntimeException("类名不能为空");
		}
		if (classPathFile.exists()) {
			//.getPackage().getName()
			String className = CustomClassLoader.class.getPackage().getName() + "." + name;

			name = name.replaceAll("\\.", "/") + ".class";
			File classFile = new File(classPathFile, name);

			FileInputStream fis = null;
			ByteArrayOutputStream baos = null;
			try {
				fis = new FileInputStream(classFile);
				baos = new ByteArrayOutputStream();
				int len;
				byte[] bys = new byte[1024];
				while ((len = fis.read(bys)) != -1) {
					baos.write(bys, 0, len);
				}

				byte[] bytes = baos.toByteArray();
				return defineClass(className, bytes, 0, baos.size());
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (baos != null) {
					try {
						baos.close();
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
			}
		}
		return null;
	}
}
