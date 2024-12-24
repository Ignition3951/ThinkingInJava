package com.utk.inheritance;

public class Cleanser {

	private String s = "Cleanser";

	public static void main(String[] args) {

		Cleanser x = new Cleanser();

		x.dilute();
		x.apply();
		x.scrub();

		System.out.println(x);

	}

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	@Override
	public String toString() {
		return s;
	}

}
