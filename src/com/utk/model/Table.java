/*
 * 
 */
package com.utk.model;

/**
 * The Class Table.
 * 
 * @author UTKARSH
 */
public class Table {

	/** The bowl 1. */
	public static Bowl bowl1 = new Bowl(1);

	/**
	 * Instantiates a new table.
	 */
	public Table() {
		System.out.println("Table()");

		bowl2.f1(1);
	}

	/**
	 * F 2.
	 *
	 * @param marker the marker
	 */
	public void f2(int marker) {

		System.out.println("f2(" + marker + ")");

	}

	/** The bowl 2. */
	public static Bowl bowl2 = new Bowl(2);

}
