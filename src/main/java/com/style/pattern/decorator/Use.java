package com.style.pattern.decorator;


import java.io.*;

/**
 * @author leon
 * @date 2021-04-08 21:28:27
 */
public class Use {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("");
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(""));

			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			BufferedReader br2 = new BufferedReader(new StringReader(""));
			BufferedReader br3 = new BufferedReader(new PipedReader(1024));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
