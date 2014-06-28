package com.c06;

public class Extends1 extends BaseClass {
	public void test() { 
		super.test1();
		System.out.println("Extends test");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Extends1 ext = new Extends1();
		ext.test();
	}

}

class BaseClass {
    public void test1() {System.out.println("BaseClass test1"); }
    public void test2() {System.out.println("BaseClass test2"); }
	public static void main(String[] args) {
		BaseClass base = new BaseClass();
		base.test1();
		base.test2();
	}
}