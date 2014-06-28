package com.c09;
/**
 * 
 * Exception in thread "main" A trivial exception
	at com.c09.LostMessage.dispose(LostMessage.java:20)
	at com.c09.LostMessage.main(LostMessage.java:29)
 * ��finally�����HoHumExceptionΥ���滻��VeryImportantException
 * ����һ���൱���صı�̴�����
 */
 
class VeryImportantException extends Exception {
	public String toString() {
		return "A very important exception!";
	}
}

class HoHumException extends Exception {
	public String toString() {
		return "A trivial exception";
	}
}

public class LostMessage {
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	
	void dispose() throws HoHumException {
		throw new HoHumException();
	}
	
	public static void main(String[] args)
		throws Exception {
		LostMessage lm = new LostMessage();
		try {
			lm.f();
		} finally {
			lm.dispose();
		}
		
	}
}




