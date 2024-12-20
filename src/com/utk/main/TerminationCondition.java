
//:object/TerminationCondition.java
package com.utk.main;

import com.utk.model.Book;

/**
 * 
 * Implementing terminal condition for finalize() method
 * 
 * @author Utkarsh Srivastava
 * 
 * @author com.utk.org
 * 
 * @version 1.0
 * 
 */
public class TerminationCondition {

	/**
	 * The main method.
	 *
	 * @param args String array argument is passed
	 */
	public static void main(String[] args) {
		
		Book novel = new Book(true);
		
		novel.checkIn();
		
		new Book(true);
		
		System.gc();

	}

}
