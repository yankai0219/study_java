package com.c06;


// Thinking in Java Edition 4 Chapter 6.8
class Value {
	int i = 2;
}
class Test12 {
    void test() {
    	System.out.println("Test Test");
    }
}

public class Final extends Test12 {
	final int i1 = 19;
	final static int I2 = 29;
	final int i3 = (int)(Math.random()*20);
	 final static int i4 = (int)(Math.random()*20);
	final Value v1 = new Value();
	int i5 = 2;
    final int i6;
    Final() {
    	i6 = 3;
    }
    
    void test() {
    	System.out.println("Final Test");
    }
	public static void main(String[] args) {
		Final fi = new Final();
		fi.test();

	}
}

