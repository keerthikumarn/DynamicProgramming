package com.algorithms.dp;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for (int arr_i = 0; arr_i < size; arr_i++) {
			arr[arr_i] = scan.nextInt();
		}
		for (int idx = size; idx > 0; idx--) {
			System.out.print(arr[idx - 1]+" ");
		}
	}

}
