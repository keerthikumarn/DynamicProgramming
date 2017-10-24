package com.algorithms.dp;

import java.util.Scanner;

public class EggDropping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int noOfFloors = scan.nextInt();
		int noOfEggs = scan.nextInt();

		int noOfTrials = eggDropping(noOfEggs, noOfFloors);
		System.out.println(noOfTrials);
	}

	private static int eggDropping(int noOfEggs, int noOfFloors) {
		// 2D matrix table representing eggs & floors !
		int[][] eggFloors = new int[noOfEggs + 1][noOfFloors + 1];
		int i, j, result;
		// 1 check for 1 egg
		for (i = 1; i <= noOfEggs; i++) {
			eggFloors[i][1] = 1;
			eggFloors[i][0] = 0;
		}

		// Trials for 1 egg and N no. of floors
		for (j = 1; j <= noOfFloors; j++) {
			eggFloors[1][j] = j;
		}

		for (i = 2; i <= noOfEggs; i++) {
			for (j = 2; j <= noOfFloors; j++) {
				eggFloors[i][j] = Integer.MAX_VALUE;
				for (int x = 1; x <= j; x++) {
					result = 1 + Math.max(eggFloors[i - 1][x - 1], eggFloors[i][j - x]);
					if (result < eggFloors[i][j])
						eggFloors[i][j] = result;
				}
			}
		}
		return eggFloors[noOfEggs][noOfFloors];
	}

}
