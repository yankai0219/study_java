package com.keything.basic1;


public class AccessExtend extends AccessIndicator {
    public 
        void testAccessExtend() {
    	    System.out.println("testAccessExtend");
    	    this.acess_indi3();
    	    InTest test = new InTest();
    	    System.out.println("test AccessExtend will print Intest.test()"); 
    	    test.test();
        }
    
}
