package com.iterator1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class KeyIterator implements Iterable<Long>{
	private long[] keys;
	private static final int NULL = 0x8000000;
	private static final int REMOVED=0x7fffffff;
	
	
	public KeyIterator(int size) {
		keys = new long[size];
		for (int i = 0; i < size; i++) {
			keys[i] = i;
		}
	}
	@Override
	public LongPrimitiveIterator iterator() {
		return new MyIterator();
	}
	
	private class MyIterator extends AbstractLongPrimitiveIterator{
		private int position;
		private int lastNext = -1;
		
		@Override
		public long nextLong() {
			goToNext();
			lastNext = position;
			if (position >= keys.length) {
				throw new NoSuchElementException();
			}
			return keys[position++];
		}
	
		@Override
		public long peek() {
			goToNext();
			if (position >= keys.length) {
				throw new NoSuchElementException();
			}
			 return keys[position];

		}
	
		@Override
		public void skip(int n) {
			position += n;
			
		}
	
		@Override
		public boolean hasNext() {
			 goToNext();
			 return position < keys.length;
		}
	
		private void goToNext() {
			int length = keys.length;
			while(position < length && (keys[position] == NULL || keys[position] == REMOVED)) {
				
			}
		} 
		
		@Override
		public void remove()
			throws UnsupportedOperationException, IllegalStateException {
			throw new UnsupportedOperationException("MyIterator: remove");
		}
		
		public Iterator<Long> iterator() {
			return new MyIterator();
		}
	}
	
}
