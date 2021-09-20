package com.permutes;
public class PermutationsOne {
	public void stringPermute(String str,int first,int last) {
		if(first==last) {
			System.out.println(str);
		}
		else {
			for(int i=first;i<=last;i++) 
			{	
				str=swap(str,first,i);
				stringPermute(str,first+1,last);
				str=swap(str,first,i);
			}
		}
	}

	public static String swap(String str1, int i, int j) {
		char temp;
		char[] charArray=str1.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}
}

