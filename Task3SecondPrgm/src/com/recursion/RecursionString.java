package com.recursion;

public class RecursionString {
	   
		public static String recursionReverse(String str) {
			if(str.isEmpty()) {
				return str;
			}
			return recursionReverse(str.substring(1))+str.charAt(0);
		}
}
		

