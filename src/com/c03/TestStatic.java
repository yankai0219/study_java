package com.c03;

//4.4.1. æ≤Ã¨”Ú

public class TestStatic {
	public static int test = 12;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestStatic test1 = new TestStatic();
		TestStatic test2 = new TestStatic();
		System.out.printf("test1.test:%d\n", TestStatic.test);
		System.out.printf("test2.test:%d\n", TestStatic.test);
		
		TestStatic.test = 23;
		System.out.printf("After test1.test:%d\n", TestStatic.test);
		System.out.printf("After test2.test:%d\n", TestStatic.test);

	}

}
