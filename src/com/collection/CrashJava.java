package com.collection;
import java.util.*;

public class CrashJava {
	public String toString() {
		return "CrashJava address:"   + "\n";
	}
	
	public static void main(String[] args) {
		Vector v = new Vector();
		for (int i = 0; i < 3; i++) {
			v.addElement(new CrashJava());
		}
		
		System.out.println(v);
	}

}
