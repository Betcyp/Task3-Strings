package com.duplicates;

public class DuplicateCharString {
	
	public void duplicateChar(String str) {
		int count;
		char string[]=str.toCharArray();
		int len=str.length();
		System.out.println("length of the string: "+len);
		System.out.println("Duplicate Characters are: ");
		for(int i=0;i<len;i++) {
			count=1;
			for(int j=i+1;j<len;j++) {
				if(string[i]==string[j] && string[i]!=' ') {
					count++;
					string[j]='0';
				}
			}
			if(count>1 && string[i]!='0') {
				System.out.println(string[i]);
			}
		}
	}
	
}