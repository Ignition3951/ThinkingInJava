package com.utk.ctci.chp1;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		
		String str1 = "Utkarsh";
		String str2 = "sUkar";
		
		//check the length of string
		String subset = getSmallString(str1, str2).get(0);
		String superset = getSmallString(str1, str2).get(1);
		
		//search each char in other string
		System.out.println(subset+" is permutation of "+superset+" ? "+isPermutationOfString(subset, superset));
	}
	
	public static ArrayList<String> getSmallString(String str1,String str2) {
		ArrayList<String> strings = new ArrayList<String>();
		if(str1.length()<str2.length()) {
			strings.add(0, str1);
			strings.add(1, str2);
		}else {
			strings.add(0, str2);
			strings.add(1, str1);
		}
		return strings;
	}
	
	public static boolean isPermutationOfString(String subset,String superset) {
		int count = 0;
		for(int i=0;i<subset.length();i++) {
			for(int j=0;j<superset.length();j++) {
				if(subset.charAt(i)==superset.charAt(j)) {
					count++;
					break;
				}
			}
		}
		if(count==subset.length())
			return true;
		return false;
	}
	
}
