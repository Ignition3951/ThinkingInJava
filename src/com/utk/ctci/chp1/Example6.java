package com.utk.ctci.chp1;

public class Example6 {

	public static void main(String[] args) {
		String str="abcdeeeeeeeeeee"; //aabcccccaaa abcdee
		System.out.println(compressString(str));
	}
	
	public static StringBuilder compressString(String str) {
		int count=1;
		StringBuilder compressedString = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if((i+1)>=str.length() || str.charAt(i+1)!=str.charAt(i)) {
				String tmp = ""+str.charAt(i)+count;
				compressedString=compressedString.append(tmp);
				count=1;
			}else {
				count++;
			}
		}
		return compressedString.length()<str.length() ? compressedString : new StringBuilder(str);
	}

}
