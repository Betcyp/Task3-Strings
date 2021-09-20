package com.userstring;
import java.util.Scanner;

import com.strings.Append;
public class MainAppend {
	public static void main (String[] args)
    {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the first string");
	  System.out.println("Enter the second string");
	  String str1=sc.next();
	  String str2=sc.next();
	  Append obj= new Append();
      System.out.println("The given strings is: "+str1+" and "+str2);
      System.out.println("The new string is: "+obj.appendString(str1,str2));
	 }
}
