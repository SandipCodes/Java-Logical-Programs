/*
 * Number is said to be sparse if it's binary representation
 *  isnot having 2 or more consecutive 1s(set).
 * i.e. 4==>100 ,  
 */
package com.app.logical.programs;

public class SparseNumberTest {

	public static void main(String[] args) {

		//sparseNumberTest();
		//sparseNumberTest2();
		
		//programs with right concept
		//isSparse();
		isSparseOptimized();
   }//main

	public static void isSparseOptimized() {
		//int input=12;
		 int input=9;

		 if((input & ( input >> 1)) ==0) {
			 System.out.println("Given number:"+input + "  is sparse");
		 }
		 else {
			 System.out.println("Given number:"+input+"  isnot sparse");			 
		 }
		 
		 //System.out.println(input << 5);
		 
	}//isSparseOptimized()
	public static void isSparse() {
		
		//int input=12;
		int input=72;
		int number=input;
		
		String binary="";
		String temp="";
		boolean flag=true;
		
		int i=0,j=0;
		//converting given number into binary
		while(number >= 1 ) {
			
			temp= temp+ number % 2;
			number= number/2;
		}//while
		
		//reversing the generated binary no
		int len=temp.length();
		i=len-1;
		while(i>=0) {
			binary=binary+ temp.charAt(i);
			i--;
		}//while
		
		System.out.println(binary);
		//now checking whether number is sparse or not
		
		i=0;
		while(i <len) {
			
			if(binary.charAt(i) =='1') {
				i++;
				if(i< len && binary.charAt(i) =='1') {
					flag=false;
					break;
				}//if
			}//if
			i++;
		}//while
		
		if(flag==true) {
			System.out.println("Given number :"+ input+ " ===>  :"+ binary+ "=> is sparse .");
		}
		else {
			System.out.println("Given number :"+ input+ " ===>  :"+ binary+ "=> is not sparse .");
		}
	}//
	public static void sparseNumberTest() {
		//int number=4;
				//int number=292;
				//int number=300;
				int number=3;
				int input=number;
				
				
				String binary="";
				boolean flag=false;
				
				//converting given no into binary
				int i=0,j=0;
				while(number >= 1) {
					binary= binary+ number % 2;
					number=number /2;
				}
				
				if(binary.length() %3 !=0) {
					System.out.println("GIven number is not sparse");
				    System.exit(0);
				}
				
				
				//reversing resulted remainders to get binary number
				int len=binary.length();
				String revBinary="";
				
				i=len-1;
				while(i >=0) {
				   revBinary += binary.charAt(i);
				   i--;
				}
				
				
				
				//checking for sparse number
				  i=0;
				  while(i< len ) {
					  
					  if(revBinary.charAt(i)=='1') {
						   i++;
						   if(i < len && revBinary.charAt(i)=='0') {
							   i++;
							   if(i < len && revBinary.charAt(i)=='0') {
								   flag=true;
								   i++;
								   continue;
							   }//1st inner if
							   else {
								   flag=false;
								   break;
							   }
						   }//outer if
						   else {
							   flag=false;
							   break;
						   }
					  }//outer if
					  else {
						  flag=false;
						  break;
					  }//else
				  }//while
				
				if(flag) {
					System.out.println("The given no:  "+ input+ "   with Binary : "+ revBinary+ "    is sparse .");
				}
				else {
					System.out.println("The given no:  "+ input+ "   with Binary : "+ revBinary+ "    is not sparse .");
					
				}
				
				System.out.println("tarvesed bits:"+ i);
	}//method1
	public static void sparseNumberTest2() {
		//int number=4;
					int number=292;
					//int number=300;
					//int number=3;
					int input=number;
					
					
					String binary="";
					 String revBinary="";
						
					boolean flag1=false;
					boolean flag2=false;
					
					//converting given no into binary
					int i=0,j=0;
					while(number >= 1) {
						binary= binary+ number % 2;
						number=number /2;
					}//while
				
					//reversing resulted remainders to get binary number
					
					int len=binary.length();
				
					  i=len-1;
					while(i >=0) {
					   revBinary += binary.charAt(i);
					   i--;
					}//while
					
					
					
					if(len %3 !=0) {
						//System.out.println("GIven number is not sparse");
					    //System.exit(0);
						flag1=false;
						
					}
					else {
					    
						i=0;
						while(i<len) {
							
							if(revBinary.charAt(i) !='1') {
								flag1=false;
								break;
							}
							else {
								flag1=true;
							}
							i=i+3;
						}//while
						
						i=1;
						while(i<len) {
							
							if(revBinary.charAt(i) !='0'){
								flag2=false;
								break;
							}
							i++;
							
							if(i< len && revBinary.charAt(i) !='0'){
								flag2=false;
								break;
							}
							else {
								flag2=true;
							}
							i=i+2;
						}//while
						
					}//else
					
					if(flag1 && flag2) {
						System.out.println(input + " is sparse: with binary: "+ revBinary);
					}
					else {
						System.out.println(input + " is not sparse : with binary: "+ revBinary);
					}
					
					
	}//method2
}//class
