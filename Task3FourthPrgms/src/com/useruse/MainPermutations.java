package com.useruse;
import com.training.PermutationsOne;
import java.util.Scanner;
public class MainPermutations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
	    String str=sc.next();
	    PermutationsOne objt=new PermutationsOne();
	    objt.stringPermute(str);
	    sc.close();
	}
}
