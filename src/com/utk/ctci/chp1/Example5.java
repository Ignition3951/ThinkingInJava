package com.utk.ctci.chp1;

public class Example5 {

	public static void main(String[] args) {

		String str1="pale";//pale, ple -) true pales pale -->true pale bale --> true pale bae --> false
		String str2="bae";
		
		//check the length difference of the string
		System.out.println("Are the strings one away ?  "+checkLengthCondition(str1, str2));
		//check for one away condition based on difference in length
	}
	
	public static boolean checkLengthCondition(String str1,String str2) {
		if(str1.length()==str2.length())
			return oneEditReplace(str1.toCharArray(),str2.toCharArray());
		if(str1.length()+1==str2.length())
			return oneEditInsert(str2.toCharArray(), str1.toCharArray());
		if(str1.length()==str2.length()+1)
			return oneEditInsert(str1.toCharArray(), str2.toCharArray());
		return false;
	}
	
	public static boolean oneEditInsert(char[] str1,char[] str2) {
		int index1=0,index2=0;
		while(index1<str1.length && index2<str2.length) {
			if(str1[index1]!=str2[index2]) {
				if(index1!=index2) {
					return false;
				}
				index1++;
			}else {
				index1++;
				index2++;
			}
		}
		return true;
	}
	
	public static boolean oneEditReplace(char[] str1,char[] str2) {
		boolean flag=false;
		for(int i=0;i<str1.length;i++) {
			if(str1[i]!=str2[i]) {
				if(flag) {
					return false;
				}
				flag=true;
			}
		}
		return true;
	}

}
