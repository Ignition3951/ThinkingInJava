package com.utk.ctci.chp1;

public class Example1 {
	
	public static void main(String[] args) {
		String str = "Utkarsh Srivastava";
		System.out.println("Is the string unique ? "+isUnique(str));
	}
	
	public static boolean isUnique(String str) {
		if(str.length()>128)
			return false;
		boolean[] ascii = new boolean[128];
		boolean result = true;
		for(int i=0;i<str.length();i++) {
			int indexValue = (int) str.charAt(i);
			if(ascii[indexValue]==true) {
				return false;
			}else {
				ascii[indexValue]=true;
			}
		}
		return result;
	}

}
