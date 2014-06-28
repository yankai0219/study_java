package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Aim: this program is used to test the difference
// between for and iterator
public class TestForAndIterator {
	public static void main(String[] args) {
		String[] array = {"abc", "def", "gkl"};
		Set<String> words = new HashSet<String>();
		long totalTime = 0;
		
		for (String a : array) {
			String word = a;
			long callTime = System.currentTimeMillis();
			words.add(word);
			callTime = System.currentTimeMillis() - callTime;
			totalTime += callTime;
		}
		
		Iterator iter = words.iterator(); // Iteraotr<String>
		while (iter.hasNext()) {
			System.out.println("iter:" + iter.next());
			// iter.remove(); // legal
		}
		
		for (String a : words) {
			System.out.println("for:" + a);
		//	words.remove(a); // illegal
		}
		System.out.println("...");
		System.out.println(words.size() + "distinct words." + totalTime + "milliseconds.");
	}
}
