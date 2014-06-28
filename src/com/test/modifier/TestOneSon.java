package com.test.modifier;

import  com.test.modifier.*;

public class TestOneSon extends TestOne implements InterfaceOne {
	
	public static void main(String[] args) {
		TestOneSon tos = new TestOneSon();
		System.out.println(tos.protectedStr);
		System.out.println(tos.friendlyStr);
		tos.protectedFunc();
		tos.publicFunc();
		tos.friendlyFunc();
		tos.testInter();
	}

	@Override
	public void testInter() {
		System.out.println("testInter");
	}
	
	

}