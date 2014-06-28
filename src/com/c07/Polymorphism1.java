package com.c07;

public class Polymorphism1 {

	public static void tune(Instrument i) {
		i.play(Note.middec);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind flute = new Wind();
		tune(flute);
	}

}

class Note {
	private int value;
	private Note(int val) { value = val; }
	public static final Note
		middec = new Note(0),
		csharp = new Note(1),
		cflat  = new Note(2);
	
}// ETC

class Instrument {
	public void play(Note n) {
		System.out.println("Instrument.play()");
	}
}

class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind.play()");
	}
}


