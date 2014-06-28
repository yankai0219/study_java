package com.c03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class ContentNumber {
	private static int number = 12;
	private final static String name = "yankai";
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.printf("hello, %s, this is your %d program", name, number);
		Scanner in = new Scanner(new File("C:\\Users\\keything\\workspace\\study_java\\src\\com\\c03\\hello.txt"));
		String a = in.nextLine();
		while(!a.equals("end")) {
			System.out.println(a);
			a = in.nextLine();
		} 
		System.out.println("end all");
	}
}
