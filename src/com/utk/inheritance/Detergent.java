package com.utk.inheritance;

public class Detergent extends Cleanser {

	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub();
	}

	public void foam() {
		append(" foam()");
	}

	public static void main(String[] args) {
		Detergent detergent = new Detergent();
		detergent.dilute();
		detergent.apply();
		detergent.scrub();
		detergent.foam();
		System.out.println(detergent);
		System.out.println("Testing base class:");
		Cleanser.main(args);
	}

}
