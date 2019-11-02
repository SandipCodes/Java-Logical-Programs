package com.app.random.programs;

import java.util.Arrays;

public class CountFor100 {

	public static void main(String[] args) {

		int arr[] = { 7, 8, 10, 13, 15, 19, 20, 23, 25 };

		int len = arr.length;
		int arr2[] = new int[len - 2];
		// System.out.println(Arrays.toString(arr2));
		int sum = 0, k = 0;
		boolean flag = false;

		for (int i = 0; i < len - 2; i++) {
			sum = 0;
			k = 0;
			// System.out.println("----------------------------------------------------------------");
			for (int j = 0; j < len-1; j++) {

				if (i == j) {
					continue;
				}
				sum = sum + arr[j];
				if (sum == 100) {
					flag = true;
					arr2[k++] = arr[j];
					// System.out.println(arr2[j]+" ");
					break;
				} else {
					arr2[k++] = arr[j];
					// System.out.println(arr2[j]+" ");
				}
			} // for

	       if (flag) {
				System.out.println("all the no with 100 sum is:" + Arrays.toString(arr2));
				break;
			}
		} // for
	}// main()

}// class
