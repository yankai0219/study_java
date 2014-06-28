package com.iterater;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Squares implements Iterator{

	private int current;
	private int leftToGen;
	
	public Squares(int numToGen) {
		this(0, numToGen - 1);
	}
	
	public Squares(int start, int stop) {
		current = start;
		leftToGen = stop - start + 1;
	}
	

	@Override
	public boolean hasNext() {
		return leftToGen != 0;
	}

	
	@Override
	public Object next() 
		throws NoSuchElementException {
		if (!hasNext()) {
			throw new NoSuchElementException("Squares:next");
		}
		leftToGen--;
		
		Integer answer = new Integer(current * current);
		current++;
		return answer;
	}

	@Override
	public void remove() 
		throws UnsupportedOperationException, IllegalStateException {
		throw new UnsupportedOperationException("Squares:remove");
	}

	public Iterator<Integer> iterator() {
		return new Squares(10);
	}
}
