package com.app.logical.programs;

public class WordCountInString {

	public static void main(String[] args) {
		
		wordCount();
	}
	public static void wordCount() {
		
		String str="Welcome to Hyderabad city, which is a capital of telangana.";
		
		int len=str.length();
		int count=1;
		for(int i=0;i<len;i++) {
			
			if(str.charAt(i) ==' ' && str.charAt(i+1) !=' ') {
				count++;
			}//if
		}//for
		System.out.println("Given String is:\n "+str);
		System.out.println("No of words in given String is:"+count);
	}//wordCount()

}//class
