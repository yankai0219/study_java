package com.test.modifier.ts;

import com.test.modifier.TestOne;

public class TestOneSon extends TestOne {
	//@Override
	public  void publicFunc() {
		System.out.println("TestOneSon publicFunc");
		return;
	}
	
	public static void main(String[] args) {
		TestOneSon tos = new TestOneSon();

		System.out.println(tos.protectedStr);
		// System.out.println(tos.friendlyStr);
		tos.protectedFunc();
		tos.publicFunc();
		tos.friendlyFunc();
	}

}
