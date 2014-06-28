package com.test.modifier;

public class TestOne {
	protected static String protectedStr = "Protected";
	static String friendlyStr = "Friendly";
	
	protected static void protectedFunc() {
		System.out.println("TestOne proctectedFunc");
		return;
	}
	
	  protected static void friendlyFunc() {
		System.out.println("TestOne friendlyFunc");
		return;
	}
	
	public static void publicFunc() {
		System.out.println("TestOne publicFunc");
		return;
	}

}
