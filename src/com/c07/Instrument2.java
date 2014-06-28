package com.c07;

import java.util.*;

abstract class AbstractIns {
	int i;
	public abstract void play();
	public String what() {
		return "AbstractIns";
	}
}

class Wind4 extends AbstractIns {
	public void play() {
		System.out.println("Wind4.play()");
	}
	
	public String what() { return "Wind4"; }
	public void adjust() {}
}


class Percussion4 extends AbstractIns {
	public void play() {
		System.out.println("Percussion4.play()");
	}
	
	public String what() { return "Percussion4"; }
	public void adjust() {}
}


class Stringed4 extends AbstractIns {
	public void play() {
		System.out.println("Stringed4.play()");
	}
	
	public String what() { return "Stringed4"; }
	public void adjust() {}
}


public class Instrument2 {
	static void tune(AbstractIns abs) {
		abs.play();
	}
	
	static void tuneAll(AbstractIns[] abs) {
		for (int i = 0; i < abs.length; i++) {
			tune(abs[i]);
		}
	} 
	
	public static void main(String[] args) {
		AbstractIns[] ins = new AbstractIns[3];
		int i = 0;
		ins[i++] = new Wind4();
		ins[i++] = new Percussion4();
		ins[i++] = new Stringed4();
		tuneAll(ins);
	}
}
