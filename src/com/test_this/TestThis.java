package com.test_this;

import java.util.*;

public class TestThis {
	private int hour;
	private int minute;
	private int second;
	
	public TestThis() {
		this(0, 0, 0);
	}
	
	public TestThis(int h) {
		this(h, 0, 0);
	}
	
	public TestThis(int h, int m, int s) {
		setTime(h, m, s);
	}
	
	public void setTime(int h, int m, int s) {
		this.hour = h;
		this.minute = m;
		this.second = s;
	}
    
	public String toString() {
	    StringBuilder sb = new StringBuilder("hour:minute:second--");
	    sb.append(hour + ":" + minute + ":" + second);
	    return sb.toString();
	}
	
	public static void main(String[] args) {
        TestThis test1 = new TestThis();
        TestThis test2 = new TestThis(1);
        TestThis test3 = new TestThis(1, 2, 3);
        
        System.out.println("test1:" + test1);
        System.out.println("test2:" + test2);
        System.out.println("test3:" + test3);
	}

}
