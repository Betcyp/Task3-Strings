package com.substring;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestString {
	public static void longestSubString(String str ) {
		String longestSub=null;
		int lengthOfSubString=0;
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		char[] array=str.toCharArray();
		for(int i=0;i<array.length;i++) {
			char ch=array[i];
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			}
			else {
				i=map.get(ch);
				map.clear();
			}
			if(map.size() > lengthOfSubString) {
				lengthOfSubString=map.size();
				longestSub=map.keySet().toString();
			}
		}
		System.out.println("the longest substring: "+longestSub);
		System.out.println("the length of the longest substring is: "+lengthOfSubString);
		
	}
}
