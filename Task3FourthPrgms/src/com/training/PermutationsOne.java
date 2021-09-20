package com.training;
public class PermutationsOne {
	
	public static void stringPermute(String input) {
		System.out.println("permutation of the string:"+input);
			stringPermutation("",input);
	}
	public static void stringPermutation(String str,String input) {
		if(input.length()==0) {
			System.out.println(str);
		}
		else {
			for(int i=0;i<input.length();i++) {
				stringPermutation(str+input.charAt(i),input.substring(0,i)+input.substring(i+1,input.length()));
			}
		}
	}
}