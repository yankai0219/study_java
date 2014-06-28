package com.c09;

public class TestException1 {
	public static void main(String[] args) {
		/*
		// one 
		Test t = new Test();
		// Test t = null;
		if (t == null) {
			throw new NullPointerException("t = null");
		} else {
			System.out.println("t is NOT null");
		}
		
		// two
		try {
			throw new Exception("here is my Exception");
		} catch(Exception e) {
			System.out.println("Caught Exception");
			System.out.println("e.getMessage()" + e.getMessage());
			System.out.println("e.toString()" + e.toString());
			System.out.println("e.printStackTrace()" );
			e.printStackTrace();

		}
		*/
		// three
		try {
			testFunc();
		} catch(TasteException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
	
	public static void testFunc() throws TasteException { //static is essential. why?
		System.out.println("This is testFunc TasteException");
		throw new TasteException(); // 不管有木有throw，finally都会执行
	}
}

class Test {
	public Test() {}
}


/** 
 * 这种怎么使用呢？？需要学习
 * */
class TasteException extends Exception {
	public TasteException() {}
	
	public TasteException(String message) {
		super(message);
	}
	
}
