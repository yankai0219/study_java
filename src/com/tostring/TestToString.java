package com.tostring;

import java.lang.*;
public class TestToString {
	
	public String toString() {
		// StringBuilder result = new StringBuilder(100);
		// result.append("Generic+hello");
		// return result.toString();
		return "Generic+hello";
	}

	static public void main(String[] args) {
		TestToString aa = new TestToString();
		
		System.out.println("test to string:" + aa);
	}
}
