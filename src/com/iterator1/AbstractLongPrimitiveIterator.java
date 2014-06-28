package com.iterator1;

public abstract class AbstractLongPrimitiveIterator
	implements LongPrimitiveIterator {

	@Override
	public Long next() {
		return nextLong();
	}
}
