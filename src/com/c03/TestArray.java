package com.c03;

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 43, 89, 56, 4};
	
		for (int i = 0; i <a.length; i++) {
			System.out.println(a[i]);
		}
		
		Arrays.sort(a);
		System.out.println("for int i:a");
		for (int i:a) {
			System.out.println(i);
		}
	}
}
