package com.utk.main;

import com.utk.model.Cupboard;
import com.utk.model.Table;

/**
 * The Class StaticInitialization.
 * 
 * @author UTKARSH
 */
public class StaticInitialization {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		System.out.println("Creating new Cupboard() in main");

		new Cupboard();

		System.out.println("Creating new Cupboard() in main");

		new Cupboard();

		table.f2(1);

		cupboard.f3(1);
		
	}

		/** The table. */
		static Table table = new Table();
		
		/** The cupboard. */
		static Cupboard cupboard = new Cupboard();

}
