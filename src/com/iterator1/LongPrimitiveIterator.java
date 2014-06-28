package com.iterator1;

public interface LongPrimitiveIterator extends SkippingIterator<Long> {
	long nextLong();
	long peek();
}
