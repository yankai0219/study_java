package com.collection;

import java.awt.List;
import java.util.*;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>();
		a.add("Amy");
		a.add("Carl");
		a.add("Erica");

		LinkedList<String> b = new LinkedList<String>();
		b.add("Bob");
		b.add("Doug");
		b.add("Gloria");
		
		ListIterator<String> aIter = a.listIterator();
		Iterator<String> bIter = b.iterator();
		
		while (bIter.hasNext()) {
			if (aIter.hasNext()) {
				aIter.next();
			}
			
			aIter.add(bIter.next());
		}
		System.out.print("after merge:");
		System.out.println(a);
		
		// remove every second word from b
		
		bIter = b.iterator();
		while (bIter.hasNext()) {
			bIter.next();
			if (bIter.hasNext()) {
				String tmp = bIter.next();
				System.out.println("tmp:" + tmp);
				bIter.remove();
			}
		}
		
		System.out.println(b);
		
		a.removeAll(b);
		System.out.println(a);
		
	}
}
