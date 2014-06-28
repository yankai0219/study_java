package com.collection;
import java.util.*;

public class SetTest {

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
		
		Iterator<String> iter = words.iterator();
		for (String a : words) {
			System.out.println(a);
		}
		System.out.println("...");
		System.out.println(words.size() + "distinct words." + totalTime + "milliseconds.");
	}

}
