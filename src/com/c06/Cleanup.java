package com.c06;

// Date: 2014/5/11
// ��������6.3 ����������
// 1. ���ʱ������������࣬������̳���
// 2. Ҫ����finally�Ӿ��У�finally�Ӿ����˼�ǡ��ܻ�ȥ����cleanup()��


class Base1 {
	
	Base1() {
		System.out.println("Base no parameter constructor:" );
	}
	Base1(int i) {
		System.out.println("Base constructor:" + i);
	}
	
	void cleanup() {
		System.out.println("Base CleanUp");
	}
	
}

class Test1 extends Base1 {
	Test1() {
		System.out.println("Extends no parameter constructor:" );
	}
	Test1(int i) {
		// super(i);
		System.out.println("extends constructor:" + i);
	}
	void cleanup() {
		super.cleanup();
		System.out.println("Test CleanUp");
	}

	
}

public class Cleanup {
	Cleanup() {
		t = new Test1();
		b = new Base1();
	}
	void cleanup() {
		System.out.println("Cleanup clean");
		t.cleanup();
		b.cleanup();
	}
	public static void main(String[] argv) {
		Cleanup c = new Cleanup();
        try {
        	System.out.println("cleanup main try");
        } finally {
        	c.cleanup();
        }
	}
	private Test1 t;
	private Base1 b;
}