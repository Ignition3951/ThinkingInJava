package com.utk.model;

/**
 * The Class Cupboard.
 */
public class Cupboard {

	/** The bowl 3. */
	Bowl bowl3 = new Bowl(3);

	/** The bowl 4. */
	public static Bowl bowl4 = new Bowl(4);

	/**
	 * Instantiates a new cupboard.
	 */
	public Cupboard() {

		System.out.println("Cupboard()");

		bowl4.f1(2);

	}

	/**
	 * F 3.
	 *
	 * @param marker the marker
	 */
	public void f3(int marker) {

		System.out.println("f3(" + marker + ")");

	}

	/** The bowl 5. */
	public static Bowl bowl5 = new Bowl(5);

}
