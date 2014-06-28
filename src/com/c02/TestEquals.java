package com.c02;


/** 
 * 1）如果想比较两个对象的实际内容是否相同，必须使用所有对象都适用的特殊方法equals().
 * 2）对于主类型，直接使用==和!=即可。
 * 3）equals默认比较句柄。除非在自己的新类中改变了equals()。
 * */
class Value {
	int i;
	
	public boolean equals(Value v) {
		return this.i == v.i;
	}
}
public class TestEquals {
	public static void main(String[] args) {
		Value v1 = new Value();
		Value v2 = new Value();
		
		v1.i = v2.i = 100;
		
		System.out.println(v1.equals(v2));
		
	}
}
