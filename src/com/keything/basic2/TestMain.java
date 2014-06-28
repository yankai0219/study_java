package com.keything.basic2;

import com.keything.basic1.*;

// protected: 包内其他类可以访问，其他包的类则不能访问
// 继承类不能访问
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessIndicator acc = new AccessIndicator();
		acc.acess_indi1();
		
		
		AccessExtend accExt = new AccessExtend();
		accExt.acess_indi1();
	}

}
