package com.c06;

class WaterSource2 {
	private String s;
	WaterSource2() {
		System.out.println("Water Source");
		s = new String("Constructed");
	}
	
	public String toString() { 
		System.out.println("toString function is called");
		return s; 
	}
}

public class Composition2 {
	private String val1 = "1", 
			val2 = "2", 
			val3 = "3", 
			val4 = "4";
	WaterSource2 source = new WaterSource2();
	int i = 20;
	float f = 20;
	void print() {
		System.out.println("val1=" + val1);
		System.out.println("val2=" + val2);
		System.out.println("val3=" + val3);
		System.out.println("val4=" + val4);
		System.out.println("i=" + i);
		System.out.println("f=" + f);
		System.out.println("source=" + source);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Composition2 x = new Composition2();
		x.print();
		
		if (x.source == null) {
			System.out.println("x.source is NULL");
		}
	}

}
