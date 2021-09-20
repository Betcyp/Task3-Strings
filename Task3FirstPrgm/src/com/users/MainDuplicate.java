package com.users;
import java.util.Scanner;

import com.duplicates.DuplicateCharString;
public class MainDuplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
	    String str=sc.next();
	    DuplicateCharString obj=new DuplicateCharString();
	    obj.duplicateChar(str);
	    sc.close();
	}
}
	