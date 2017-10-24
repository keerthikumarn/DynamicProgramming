package com.algorithms.dp;

public class NonDecreasingNumbers {

	static int nonDecrease(int n) {
		int num[][] = new int[10][n + 1];

		for (int i = 0; i < 10; i++){
			num[i][1] = 1;
		}

		for (int digit = 0; digit <= 9; digit++) {
			for (int len = 2; len <= n; len++) {
				for (int x = 0; x <= digit; x++){
					num[digit][len] += num[x][len - 1];
					System.out.println("NUM : "+num[digit][len]);
				}
			}
		}

		int count = 0;
		for (int i = 0; i < 10; i++){
			count += num[i][n];
			System.out.println("Count : "+count);
		}
		return count;
	}

	public static void main(String args[]) {
		int n = 1;
		System.out.println(nonDecrease(2));
	}

}
