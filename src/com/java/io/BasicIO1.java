package com.java.io;

import java.io.*;

public class BasicIO1 {

	public static void main(String[] args) 
		throws IOException {
		InputStream is = null;
		try {
			is = new FileInputStream("c:\\data\\input.txt");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally");
		}
		
		int data = is.read();
		while(data != -1) {
			System.out.println("data:" + (char)data);
			data = is.read();
		}
		
		is.close();
		
		
		OutputStream os = new FileOutputStream("c:\\data\\output.txt");
		os.write('y');
		os.write('k');
		
		os.close();
	}
	
	
}
