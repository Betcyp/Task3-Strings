package com.strings;

public class Append {
	public String appendString(String st1, String st2) 
	{
	  if (st1.length() == st2.length()) {
	    return st1+st2;}
	  if (st1.length() > st2.length())
	  {
	    int diff = st1.length() - st2.length();
	    return st1.substring(diff, st1.length()) + st2;
	  } 
	  else 
	  {
	    int diff = st2.length() - st1.length();
	    return st1 + st2.substring(diff, st2.length());
	  }
	}
}
