package com.app.logical.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashmapUsingWhileAndForLoop {

	public static void main(String[] args) {
		
		String input="hi how are you ? you should know how things are working here";
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
		
		//split given string 
		String words[]=input.split(" ");
		
		for(String word: words) {
		
			if(!map.containsKey(word)) {
				map.put(word, 1);
			}
			else {
				int count=map.get(word);
				map.put(word, ++count);
			}
			
		}//for
		//System.out.println(map);
		
		//traversing map value by value
		
		Iterator itr=map.entrySet().iterator();
		
		//iterating hashmap using while
		 
		/*System.out.println("Word--------> Count");
		while(itr.hasNext()) {
			
			Map.Entry<String, Integer> entry= (Entry<String, Integer>) itr.next();
			
			System.out.println(entry.getKey()+ "-------------->"+entry.getValue());
		}//while
		 */
			
		//iterating hashmap using advanced for
		System.out.println("Word--------> Count");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+ "-------------->"+entry.getValue());
		}//for
		
		
	}//main()

}//class
