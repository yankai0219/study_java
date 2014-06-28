package com.test.modifier.ts;

import com.test.modifier.TestOne;
public class TestOneSon extends TestOne {
	//@Override
	public static void publicFunc() {
		System.out.println("TestOneSon publicFunc");
		return;
	}
	
	public static void main(String[] args) {
		System.out.println(protectedStr);
		// System.out.println(friendlyStr);
		protectedFunc();
		publicFunc();
		friendlyFunc();
	}

}
