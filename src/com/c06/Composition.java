package com.c06;

class WaterSource {
	private String s;
	WaterSource() {
		System.out.println("Water Source");
		s = new String("Constructed");
	}
	
	public String toString() { 
		System.out.println("toString function is called");
		return s; 
	}
}

public class Composition {
	private String val1, val2, val3, val4;
	WaterSource source;
	int i;
	float f;
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
		Composition x = new Composition();
		
		if (x.source == null) {
			System.out.println("x.source is NULL");
		}
	}

}
