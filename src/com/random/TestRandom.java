package com.random;
/*
 * ��������������ַ�ʽ��
 * 1.����java.lang.Math.Random()��̬����
 * 2.����java.util.Random����
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
