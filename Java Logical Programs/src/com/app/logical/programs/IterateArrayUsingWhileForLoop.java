package com.app.logical.programs;

import java.util.ArrayList;
import java.util.ListIterator;

public class IterateArrayUsingWhileForLoop {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		
		for(int i=1;i<=5;i++) {
			list.add(i);
		}//for
		
		ListIterator<Integer> itr=list.listIterator();
		
		//iterating list using while loop
		System.out.println("iterating list using while loop");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//iterating list using for loop
		
		System.out.println("iterating list using for loop: method 1");
		for( ;itr.hasPrevious();) {
			System.out.println(itr.previous());
		}
		System.out.println("iterating list using for loop: method 2");
		for(int i=0;i< list.size();i++) {
			System.out.println(list.get(i));
		}
		//iterating list using for loop
		System.out.println("iterating list using advanced for loop");
		 for(Integer l: list ) {
				System.out.println(l);				 
		 }
		
		
	}//main()

}//class
