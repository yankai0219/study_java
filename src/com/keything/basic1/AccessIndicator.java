package com.keything.basic1;

public class AccessIndicator {
	void friend_indi() { System.out.println("this is friendly void friend_indi"); }
	
    public
    	void acess_indi1() { System.out.println("this is public void access_indicator"); }
    
    private 
    	void acess_indi2() { System.out.println("this is private void access_indicator"); }
    
    protected
		void acess_indi3() { 
    	    System.out.println("this is protected void access_indicator"); 
    	    InTest test = new InTest();
    	    System.out.println("will print Intest.test()"); 
    	    test.test();
        }

}

// ��һ�����У�д������Ļ���ֻ�ܲ�дprotected��public privated��ֻ�ܲ���Ĭ�ϵ�ô
 class InTest {
	public 
	    void test() {System.out.println("InTest.test()"); }
	
}