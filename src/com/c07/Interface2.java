package com.c07;

interface Test1111 {
	void test11();
	void test12();
}

interface Test211 {
	void test21();
	void test22();
}

interface Test311 {
	void test31();
	void test32();
}

class Test411 {
	void test33() {System.out.println("Test411->test33");}
}
public class Interface2 extends Test411
	implements Test1111, Test211, Test311 {
	public void test11(){System.out.println("Interface2->test11");}
	public void test12(){System.out.println("Interface2->test12");}
	public void test21(){System.out.println("Interface2->test21");}
	public void test22(){System.out.println("Interface2->test122");}
	public void test31(){System.out.println("Interface2->test31");}
	public void test32(){System.out.println("Interface2->test32");}
	
	public static void main(String[] args) {
		Interface2 ins = new Interface2();
		ins.test11();
		ins.test12();
	}
}
