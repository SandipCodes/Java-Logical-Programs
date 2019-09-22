package com.app.logical.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurenceOfCharacterTest {

	static int outerLoopExecutedTimes=0;
	public static void main(String[] args) {

		occurenceOfCharacterInString();
		//occurenceOfCharacterInStringUsingHashMap();
		// System.out.println(mp);
	}// main

	//method to count occurence Of Character In String
	public static void occurenceOfCharacterInString() {

		String str = "sameersameer";
		//String str = "abcdefghabcdefghijklmanop";
		
		// get length of String
		// Map mp=new HashMap<Character,Integer>();

		int len = str.length();
		String doneChars = "";

		label: for (int i = 0; i < len; i++) {


			char ch = str.charAt(i);

			for (int k = 0; k < doneChars.length(); k++) {
				if (ch == doneChars.charAt(k)) {
					continue label;
				}
			}
			doneChars += ch;

			int count = 0;

			for (int j = 0; j < len; j++) {
				if (ch == str.charAt(j)) {
					count++;
				} // if
			} // inner for

			System.out.println("Character " + ch + " occured " + count + " times.");
			outerLoopExecutedTimes++;

			// mp.put(ch, count);
			
		} // outer for
		//System.out.println(mp);
		System.out.println("Outer loop Executes for "+ outerLoopExecutedTimes+ " times." );

	}//occurenceOfCharacterInString()
	
	//occurenceOfCharacterInStringUsingHashMap--- optimized logic
	public static void occurenceOfCharacterInStringUsingHashMap(){
		
		String input="sandipsandipsan";
		char[] ch=input.toCharArray();
		
		Map<Character, Integer> map=new HashMap<>();
		
		//extended for loop
		for(char c:ch) {
			
			if( !map.containsKey(c)) {
				map.put(c, 1);
			}//if
			else {
				  int count=map.get(c);
				  map.put(c, ++count);
			}//else
			
		}//for
		System.out.println(map);
	}//occurenceOfCharacterInStringUsingHashMap()
	
}// class
