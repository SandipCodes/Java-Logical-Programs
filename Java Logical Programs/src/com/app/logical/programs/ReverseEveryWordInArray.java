package com.app.logical.programs;

public class ReverseEveryWordInArray {

	static int i=0;
	public static void main(String[] args) {
		//reverseAllWords();
		reverseAllWordsUsingSplit();
	}

	public static void reverseAllWords() {
		String input="welcome to java programming lang. how are you, my bro.";
		String output="";
		
		int len=input.length();
		
		System.out.println("input is: "+ input);
		for( i=0;i<len;i++) {
			
			for(int j=i;j<len;j++) {
			
				if((input.charAt(j)==' ' && input.charAt(j+1) !=' ' ) || (input.charAt(j)=='.' || input.charAt(j)==',') ){
					
					//System.out.println(j); 0-7 =welcome
					//getting every word
					String subStr=input.substring(i, j);
					
					String revStr="";
					int len1=subStr.length();
				
					//reversing every word 
					for(int k=len1-1;k >=0;  k--) {
						revStr =revStr+ subStr.charAt(k);
					}//for
					
					//storing reversed word in output String
					output = output+ revStr+" ";
					
					//j++;
					//assigning j value to i
					i=j;
					break;
					
				}//if
				
			}//inner for
			//i will be incremented i+1 , for  moving cursor from space to next char
		}//outer for
		System.out.println("Output is:  "+output);
		
	}//reverseAllWords()
	public static void reverseAllWordsUsingSplit(){
		
		String input="welcome to java programming lang. how are you, my bro.";
		String output="";
		
		System.out.println("Input : "+ input);
		String words[]=input.split(" ");
		
		for(String word: words) {
			
			String revWord="";
			int len1=word.length();
		
			//reversing every word 
			for(int k=len1-1;k >=0;  k--) {
				revWord =revWord + word.charAt(k);
			}//for
			
			//storing reversed word in output String
			output = output+ revWord+" ";
	
		}//for
		System.out.println("Output : "+ output);
	}
}//class
