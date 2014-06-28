package com.collection;

import java.util.SortedSet;
import java.util.*;

public class TreeSetTest2 {

	public static void main(String[] args) {
		SortedSet<String> sorter = new TreeSet<String>(); // TreeSet implements SortedSet
		
		sorter.add("Bob");
		sorter.add("Amy");
		sorter.add("Carl");
		
		for (String s : sorter) System.out.println(s);

	}

}
