package com.c09;

public class Rethrowing {
	public static void f() throws Exception {
		System.out.println("originating the exception in f()");
		throw new Exception("thrown from f()");
	}
	
	public static void g() {
		try {
			f();
		} catch(Exception e) {
			System.out.println("Inside g(), e.printStackTrace()");
			e.printStackTrace();
			
			// throw e; // 17
		}
	}
	
	public static void main(String[] args)  {
		try {
			g();
		} catch (Exception e) {
			System.out.println("Caught in main");
		//	e.printStackTrace();
		}
	}
	
}
