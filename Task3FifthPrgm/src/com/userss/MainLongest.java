package com.userss;
import com.substring.LongestString;
import java.util.Scanner;

public class MainLongest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		LongestString obj=new LongestString();
		obj.longestSubString(str);
		sc.close();
	}
}