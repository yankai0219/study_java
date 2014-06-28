package com.c09;

public class NeverCaught {
	static void f() {
		throw new RuntimeException("From f()");
	}
	
	static void g() {
		f();
	}
	
	public static void main(String[] args) throws InterruptedException {
		/*
		 try {	
			g();
		} catch(Exception e) {
			System.out.println("BEGIN sleep");
			//Thread.sleep(4000);
			System.out.println("END sleep");
		}
		 */
		

	}
}
