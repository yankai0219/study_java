package com.test.modifier;

public class TestOne {
	protected  String protectedStr = "Protected";
	String friendlyStr = "Friendly";
	
	protected  void protectedFunc() {
		System.out.println("TestOne proctectedFunc");
		return;
	}
	
	protected  void friendlyFunc() {
		System.out.println("TestOne friendlyFunc");
		return;
	}
	
	public  void publicFunc() {
		System.out.println("TestOne publicFunc");
		return;
	}

}
