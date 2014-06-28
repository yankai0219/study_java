package com.test.modifier;

import  com.test.modifier.*;

public class TestOneSon extends TestOne implements InterfaceOne {
	
	public static void main(String[] args) {
		System.out.println(protectedStr);
		System.out.println(friendlyStr);
		protectedFunc();
		publicFunc();
		friendlyFunc();
	}

	@Override
	public void testInter() {
		System.out.println("testInter");
	}
	
	

}