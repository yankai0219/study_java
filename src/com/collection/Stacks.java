package com.collection;

import java.util.Stack;

public class Stacks {
	static String[] months = {
		"January", "February", "March", "April",
		"May", "June", "July", "August", "September",
		"October", "November", "December" };
	
	public static void main(String[] args) {
		Stack stk = new Stack();
		for (int i = 0; i < months.length; i++) {
			stk.push(months[i] + " ");
		}
		
		String last = (String)stk.pop();
		
		System.out.println("last=" + last);
		
	}

}
