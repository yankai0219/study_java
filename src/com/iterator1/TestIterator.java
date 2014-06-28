package com.iterator1;

import com.iterator1.KeyIterator;
import com.iterator1.LongPrimitiveIterator;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyIterator ki = new KeyIterator(5);
		LongPrimitiveIterator it = ki.iterator();
		
		while(it.hasNext()) {
			System.out.println("ele:" + it.next());
		}
		
	}
	

}
