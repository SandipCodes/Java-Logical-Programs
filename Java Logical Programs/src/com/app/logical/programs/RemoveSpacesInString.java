package com.app.logical.programs;

public class RemoveSpacesInString {

	public static void main(String[] args) {

		//method1();
		method2();
	}//main()

	public static void method1() {

		String input="he is    a   great  boy   and    husband.";
		
		int len=input.length();
		
		System.out.println("Input:"+input);
		input=input.replaceAll(" ", "");
		/*
		for(int i=0;i<len;i++) {
			
			if(input.charAt(i)==' ') {
				
				//input=input.replace(' ', '$');
				input=input.replaceAll(" ", "");
			}//if
		}//for
		*/
		System.out.println("Input:"+input);
	
	}
	
	public static void method2() {


		String input="he is    a   great  boy   and    husband.";
		
		int len=input.length();
		String output="";
		System.out.println("Input:"+input);

		char ch;
		for(int i=0;i<len;i++) {
			ch=input.charAt(i);
			if(ch==' ') {
				//i++;
				continue;
			}//if
			
			output +=ch;
		}//for
		
		System.out.println("output:"+output);

	}
}//class
