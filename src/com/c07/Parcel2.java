package com.c07;

public class Parcel2 {
	class Contents {
		private int i = 11;
		public int value() {return i;}
	}
	
	class Destination {
		private String label;
		Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel() {return label;}
	}
	
	public Destination to(String s) {
		return new Destination(s);
	}
	
	public Contents cont() {
		return new Contents();
	}
	
	public void ship(String dest) {
		Contents c = cont();
		Destination d = to(dest);
	}
	
	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.ship("Tanzania");
		Parcel2 q = new Parcel2();
		
		Parcel2.Contents c = q.cont(); // 去掉前面的Parcel2也是可以的
		Parcel2.Destination d = q.to("Borneo");
		
		System.out.println("value:" + c.value());
		System.out.println("dst:" + d.readLabel());
	}
}
