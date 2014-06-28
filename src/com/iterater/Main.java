package com.iterater;

import java.util.*;

import com.iterater.*;

public class Main {
	public static void main(String[] args) {
		Squares sq= new Squares(10);
		for (Iterator<Integer> iqq = sq; iqq.hasNext(); ) {
			System.out.println(iqq.next());
		}
	}
}
