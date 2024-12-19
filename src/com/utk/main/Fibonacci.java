
//:object/Fibonacci.java
/**
 * 
 */
package com.utk.main;

/**
 * Print a fibonacci series in java
 * 
 * @author Utkarsh Srivastava
 * 
 * @author com.utk.org
 * 
 * @version 1.0
 * 
 */
public class Fibonacci {

	/**
	 * Entry point to class and application.
	 * 
	 * @param args array of string arguments
	 * 
	 * @throws exceptions No exceptions thrown
	 * 
	 */
	public static void main(String[] args) {
		
		int limit = 5;
		for (int i = 1; i <= limit; i++) {
			System.out.print(fib(i)+" ");
		}

	}

	/**
	 * method to implement fibonacci series
	 * 
	 * @param int argument to set the limit till which series is required
	 * 
	 * @throws exceptions No exceptions thrown
	 * 
	 */
	public static int fib(int limit) {
		if (limit == 1 || limit == 2) {
			return 1;
		} else {
			int result = fib(limit - 1) + fib(limit - 2);
			return result;
		}
	}

}
