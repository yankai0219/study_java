package com.collection;
import java.util.*;

public class TestArray {
	public static void main(String[] args) 
	{
		String[] arr = {"abc", "def", "gfi"};
		
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		
		ArrayYk[] arr_yk = new ArrayYk[3]; // arr_yk points to an array
		
		System.out.println("arr_yk length:" + arr_yk.length);
		for (int i = 0; i < arr_yk.length; i++) {
			arr_yk[i] = new ArrayYk();
		}
		
		for(int i = 0; i < arr_yk.length; i++) {
			arr_yk[i].print(i);
		}
	}
}

class ArrayYk {
	public void print(int i) 
	{
		System.out.printf("This is %d ArrayYk\n", i);
	}
}