package com.c07;

// 7.4 ������ͷ���
abstract class Abstract {
	abstract void test1();
	abstract void test2();
	void test3() {System.out.println("test3");}
}
public  class TestAbstract extends Abstract {
	void test1() {
		System.out.println("TestAbstract test1");
	}
	void test2() {
		System.out.println("TestAbstract test2");
	}
	
	public static void main(String[] args) {
		TestAbstract ta = new TestAbstract();
		ta.test1();
		ta.test2();
		ta.test3();
	}
	
	
}
