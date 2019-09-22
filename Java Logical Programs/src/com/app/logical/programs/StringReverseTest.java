package com.app.logical.programs;

import java.util.Scanner;

public class StringReverseTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to Reverse:");
		String str = sc.next();
		String reverse="";
         int len=str.length();
		
         //reverse string in one line
          //str= new StringBuilder(str).reverse().toString();
           //System.out.println(str);
          // char ch1=new char(s1.length());-->wrong statement
		//method1
		  //reverseMethod1(str);
		// method2
		    //reverseMethod2(str);

		//method3
		// reverseMethod3(str);
         
         //System.out.println(reverseStringUsingRecursion(str,reverse,len));
         
       //  reverse=reverseStr(str);
         //System.out.println(reverse);
         
         //reverseStringUsingSB(str);
         
         reverseStringUsingSplit(str);
	}// main
	public static void reverseStringUsingSplit(String str) {
		
		String tokens[]=str.split("");
		
		for(int i=tokens.length-1;i>=0;i--) {
			System.out.print(tokens[i]);
		}//for
	}//method
	public static void reverseStringUsingSB(String str) {

		System.out.println("input:"+str);
		
		StringBuilder sbStr=new StringBuilder();
		
		for(int i=str.length()-1;i>=0;i--) {
			sbStr.append(str.charAt(i));
		
		}//for
		
		System.out.println("Output :"+ sbStr.toString());
	}//reverseStringUsingSB()
	
	public static String reverseStr(String str) {
		
		if(str.length() < 2 || str.isEmpty() || str==null)
			return str;
		
		return(reverseStr(str.substring(1)) +str.charAt(0));
	
	}
	
	public static String reverseStringUsingRecursion(String str,String reverse,int len){
		
		if(str.isEmpty() ||str==null || len <2)
			return str; 
		
		if(--len >= 0)
	         return (reverse+ str.charAt(len)+ reverseStringUsingRecursion(str,reverse,len));
		
	return reverse;
	}
	// method 1
	public static void reverseMethod1(String str) {

		char ch[] = str.toCharArray();
		int len = str.length();
		String s2="";
		
		for(int i=len-1;i>=0;i--) {
    
         s2+=ch[i];
    	 //System.out.println(ch[i]);
    }
		System.out.println(s2);
	}

	//method2
	public static void reverseMethod2(String str) {
		char ch[] = str.toCharArray();
		int len = str.length();

		for (int i = 0, j = len - 1; i < j; i++, j--) {
			// System.out.print(ch[i]);
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		} // for

		System.out.println(ch);
		//String s2 = new String(ch);
		//System.out.println(s2);
	}
	
	public static void reverseMethod3(String str) {
	
	    	String reverse="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
		    reverse +=str.charAt(i);
		}//for
		
		System.out.println(reverse);
		
	}//reverseMethod3()
}// class
