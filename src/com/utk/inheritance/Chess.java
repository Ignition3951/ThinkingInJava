package com.utk.inheritance;

public class Chess extends BoardGame {
	
	Chess(){
		super(11);
		System.out.println("Chess constructor");
		
	}
	
	public static void main(String[] args) {
		Chess x= new Chess();
	}

}
