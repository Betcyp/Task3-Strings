package com.usertwo;
import java.util.Scanner;

import com.permutes.PermutationsOne;
public class MainPermutations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
	    String str=sc.next();
	    int len=str.length();
	    PermutationsOne objt=new PermutationsOne();
	    objt.stringPermute(str, 0, len - 1);
	    //System.out.println("the permutation of the string is: "+objt.stringPermute(str,0,len - 1);
	    sc.close();
	}
}
