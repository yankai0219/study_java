package com.c06;

// Date: 2014/5/11
// 程序：用于6.2.1 构造器相关内容

class Base {
	
	Base() {
		System.out.println("Base no parameter constructor:" );
	}
	Base(int i) {
		System.out.println("Base constructor:" + i);
	}
	
}

class Test extends Base {
	Test() {
		System.out.println("Extends no parameter constructor:" );
	}
	Test(int i) {
		// super(i);
		System.out.println("extends constructor:" + i);
	}

	
}

public class InitialBase {
	public static void main(String[] argv) {
		Test test = new Test(1);
	}
}