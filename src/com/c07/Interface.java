package com.c07;

interface Test11 {
	void test11();
	void test12();
	int i = 5;
}

// 必须将接口内的所有函数实现
class Test111 implements Test11 {
	public void test11() {
		System.out.println("Test111 --> Test11");
	}
	
	public void test12() {
		System.out.println("Test111 --> Test12");
	}
}

public class Interface {	
	public static void main(String[] args) {
		Test111 test = new Test111();
		test.test11();
		test.test12();
	}
}