package com.keything.basic1;

public class TestMain {
	// friendly member can be accessed from package, 
	// and cannot be accessed from outside package
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessIndicator access_indi = new AccessIndicator();
		access_indi.acess_indi1();
		access_indi.acess_indi3();
		access_indi.friend_indi();
		
		AccessExtend accExt = new AccessExtend();
		accExt.acess_indi1();
		accExt.acess_indi3();
		accExt.friend_indi();
		accExt.testAccessExtend();
	}

	
}
