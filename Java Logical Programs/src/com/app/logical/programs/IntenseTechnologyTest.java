package com.app.logical.programs;

import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Vector;

class A {
	public void printName() throws FileNotFoundException {
		System.out.println("Value -A");
		System.out.println("A.printName()");
	}
}

public class IntenseTechnologyTest extends A implements Runnable {

	public static void main(String[] args) throws Exception {

		// q1_validDeclarationsTest();
		// q2_arrayDeclaration();
		// q3_multiDimentionalArrayTest();
		// q4_exceptionalHandling();
		/*
		 * A a=new Test(); a.printName();
		 */
		// Thread t=new Thread(this);//cannot use this in static context
		// t.start();
		
		//q5_vectorTest();
		q6_hashTableTest();
	}

	public static void q1_validDeclarationsTest() {

		int w = (int) 888.8;
		System.out.println(w);

		byte x = (byte) 1000L;
		System.out.println(x);

		long y = (byte) 100;
		System.out.println(y);

		byte z = (byte) 500;
		System.out.println(z);

	}

	public static void q2_arrayDeclaration() {
		int arr[] = new int[5];

		System.out.println(arr);
	}

	public static void q3_multiDimentionalArrayTest() {

		int arr[][] = new int[3][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];

		int sum = 0;

		for (int i = 0; i < 3; ++i) {

			for (int j = 0; j < i + 1; ++j) {
				arr[i][j] = j + 1;
			}
		}

		for (int i = 0; i < 3; ++i) {

			for (int j = 0; j < i + 1; ++j) {
				sum = sum + arr[i][j];
			}
		} // outer for

		System.out.println(sum);
	}

	public static void q4_exceptionalHandling() {

		try {
			int i, sum;
			sum = 10;

			for (i = -1; i < 3; ++i) {
				sum = (sum / i);
			} // for
		} // try
		catch (Exception e) {
			// e.printStackTrace();
			System.out.println("0");
		}
		// System.out.println(sum);
	}// method

	// overidden method with new Exception throws
	public void printName() throws NullPointerException {
		System.out.println("VALUE -B");
		System.out.println("Test.printName()");
	}

	@Override
	public void run() {

		System.out.println("TEst");
	}

	public static void q5_vectorTest() {
		
		Vector obj=new Vector(4,2);
		obj.addElement(new Integer(3));
		obj.addElement(new Integer(2));
		obj.addElement(new Integer(5));
		obj.removeAll(obj);
		System.out.println(obj.isEmpty());
	}
	
	public static void q6_hashTableTest() {
		Hashtable obj=new Hashtable();
		obj.put("A", new Integer(3));
		obj.put("B", new Integer(2));
		obj.put("C", new Integer(8));
		
		obj.remove(new String("A"));
		System.out.println(obj);
	}
}// class
