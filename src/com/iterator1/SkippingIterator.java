package com.iterator1;

import java.util.Iterator;

public interface SkippingIterator<V> extends Iterator<V>{
	void skip(int n);
}
