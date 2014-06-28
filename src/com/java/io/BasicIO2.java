package com.java.io;

import java.io.*;

public class BasicIO2 {
	public static void main(String[] args) {
		File file = new File("c:\\data\\input.txt");
		boolean isExist = file.exists();
		boolean isDir = file.isDirectory();
		long length = file.length();
		
		File dir = new File("c:\\data");
		String[] fileNames = dir.list();
		File[] fds = dir.listFiles();

		for (String each : fileNames) {
			System.out.println("fileName:" + each);
		}
		
		for (File fd : fds) {
			System.out.println("fileLen:" + fd.length());
		}
	}
	
}
