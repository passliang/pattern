package com.style.pattern.prototype;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author leon
 * @date 2021-04-26 21:30:26
 */
public class A {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://blog.csdn.net/a15835774652/article/details/116226372");
			HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
			InputStream inputStream = urlConnection.getInputStream();
			BufferedInputStream bis = new BufferedInputStream(inputStream);
			FileOutputStream fos = new FileOutputStream(new File("blog.html"));
			byte[] bys = new byte[1024];
			int len;
			while ((len = bis.read(bys)) != -1) {
				fos.write(bys, 0, len);
			}
			fos.flush();
			String responseMessage = urlConnection.getResponseMessage();
			int responseCode = urlConnection.getResponseCode();
			System.out.println("responseCode: " + responseCode);
			System.out.println("responseMessage: " + responseMessage);
			fos.close();
			bis.close();
			inputStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
