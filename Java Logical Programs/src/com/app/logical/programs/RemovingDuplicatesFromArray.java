package com.app.logical.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class RemovingDuplicatesFromArray {

	public static void main(String[] args) {

		System.out.println("RemovingDuplicatesFromArray.removeDuplicateUsingSet()");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int no = sc.nextInt();

		Object input[] = new Object[no];

		// getting the values of any type (Integer,Character or String) dyanamically
		for (int i = 0; i < no; i++) {
			System.out.println("Enter " + (i + 1) + "th element:");
			input[i] = sc.next();
		}

		System.out.println("input::" + Arrays.toString(input));


		 removeDuplicateUsingHashMap(input);
		
		//removeDuplicateUsingSet(input);
	}// main()

	public static void removeDuplicateUsingSet(Object input[]) {


		Set<Object> set = new HashSet<>();

		int i = 0;

		for(Object obj:input) {
			
			if(set.add(obj)==false) {
				System.out.println(obj+ " is duplicate element..");
			}
		}//for

		System.out.println();
		System.out.println("output::" + set);
		
	}//removeDuplicateUsingSet()

	public static void removeDuplicateUsingHashMap(Object input[] ) {

		Object output[];
		Object key;
		HashMap<Object, Integer> map = new HashMap<Object, Integer>();

		int i = 0;
		int len=input.length;

		for (i = 0; i < len; i++) {

			key = input[i];

			if (!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				int count = map.get(key);
				map.put(key, ++count);
			}

		} // for

		Iterator itr = map.entrySet().iterator();

		output = new Object[map.size()];

		for (i = 0; itr.hasNext(); i++) {
			Map.Entry<Object, Integer> entry = (Entry<Object, Integer>) itr.next();

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() +" is duplicate element..");
				output[i] = entry.getKey();
			} else {
				output[i] = entry.getKey();
			}
			// System.out.print(output[i]+" ");

		} // while
		System.out.println();
		System.out.println("output::" + Arrays.toString(output));

	}//removeDuplicateUsingHashMap()
}// class
