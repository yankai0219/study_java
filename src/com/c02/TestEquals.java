package com.c02;


/** 
 * 1�������Ƚ����������ʵ�������Ƿ���ͬ������ʹ�����ж������õ����ⷽ��equals().
 * 2�����������ͣ�ֱ��ʹ��==��!=���ɡ�
 * 3��equalsĬ�ϱȽϾ�����������Լ��������иı���equals()��
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
