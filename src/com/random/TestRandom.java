package com.random;
/*
 * 创建随机数的两种方式：
 * 1.利用java.lang.Math.Random()静态方法
 * 2.创建java.util.Random对象
 */


import java.util.Random;
import java.lang.Math;

public class TestRandom {	
	
	public static void main(String[] args) {
		// method1
		double i = Math.random();
		System.out.println(i);
		
		// method2
		Random random = new Random();// create random object
		int intNumber = random.nextInt(); // get an integer
		float floatNumber = random.nextFloat(); // get an float 
		
		System.out.println("int:" + intNumber);
		System.out.println("float:" + floatNumber);

	}
}
