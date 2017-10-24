package com.algorithms.dp;

import java.util.Scanner;

public class ArrangeCoins {

	public static void arrangeCoins(long[] coins) {
		// Get the length of the array of coins
		int len = coins.length;
		// Iterate over the array length
		// Since this is quadratic equation to find the progression of the
		// number
		// the formula to find the sum = (x + 1) * x / 2
		// formula to find x is X = (-1 + sqrt(8 * n + 1)) / 2
		for (int coinIdx = 0; coinIdx < len; coinIdx++) {
			long coin = coins[coinIdx];
			long a = (int) Math.sqrt((1 + (8 * coin)));
			System.out.println((a - 1) / 2);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		long[] coins = new long[size];
		for (int i = 0; i < size; i++) {
			coins[i] = scan.nextInt();
		}
		arrangeCoins(coins);
	}

}
