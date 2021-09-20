package com.user
import java.util.Scanner;

import com.recursion.RecursionString;

public class MainRecursion {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string: ");
			String str=sc.next();
			RecursionString obj1=new RecursionString();
			//obj1.recursionReverse(str);
			System.out.println("reversed string is:"+obj1.recursionReverse(str));
			sc.close();
		}
}
