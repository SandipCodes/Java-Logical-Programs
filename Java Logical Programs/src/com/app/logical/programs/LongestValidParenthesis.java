/*
 * Program to check longest valid parenthesis in given string
 * input=()(())))) ===>6
 * input=((() ==>2
 * input= )()()) ==>4 
 */
package com.app.logical.programs;

public class LongestValidParenthesis {

	private static int first=0,second=0,forloop=0;
	
	public static void main(String[] args) {
		
		validParenthesisCheck();
	}//main()
	
	private static void validParenthesisCheck(){
		
		//String input="()(()) )))";
		//String input="((()";
		//String input=")()())";
		String input=")))()()))))(())))";
		int output=0;
		
		int len=input.length();
		
		System.out.println("Input:"+ input);
		
		for(int i=0;i<len;i++) {
			
			forloop++;
			
			if(input.charAt(i)=='(' && input.charAt(i+1)==')') {
		         output +=2;
		         i++;
		       //  System.out.println("output: "+ output);
			}//if
			else {
				int count1=0,count2=0;
				
				while( i<len && input.charAt(i) =='(' ) {
		           count1++;
		           i++;
				}//while
			
			       //System.out.println("count1:"+count1);
			       //System.out.println("i:"+i);
				// )))()()))))(())))
				while(i < len && input.charAt(i)==')'  ) {
					count2++;
					second++;
					
					if(i < len-1 && (count1==0 && input.charAt(i+1)==')')) {
						i++;
						continue;
					}
					if(count1 >= count2) {
						output +=2;
					}//if
					else{
					     break;
					}//else
				  i++;
				}//2nd while
				//System.out.println("count2:"+count2);
				
			}//else

		}//for
		
		System.out.println("output:"+ output);
		System.out.println("forLoop:"+ forloop);
		System.out.println("second:"+ second);
	}//validParenthesisCheck()

}//class
