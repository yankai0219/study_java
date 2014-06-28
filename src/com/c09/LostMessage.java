package com.c09;
/**
 * 
 * Exception in thread "main" A trivial exception
	at com.c09.LostMessage.dispose(LostMessage.java:20)
	at com.c09.LostMessage.main(LostMessage.java:29)
 * 被finally里面的HoHumException违例替换了VeryImportantException
 * 这是一项相当严重的编程错误处理
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




