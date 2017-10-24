package com.algorithms.dp;

import java.util.Scanner;

public class MinimumWeight {

	public static void main(String[] args) {
		MinimumWeight mw = new MinimumWeight();
		Scanner scan = new Scanner(System.in);
		int weight = scan.nextInt();
		int[] values = new int[weight];
		for(int i=0; i<weight; i++){
			values[i] = scan.nextInt();
		}
		System.out.println(minimumWeight(weight, values));
	}

	private static int minimumWeight(int weight, int[] values) {
		int[][] vals = new int[values.length + 1][weight + 1];
		for(int i=0; i <= values.length; i++ ){
			for(int j=0; j <= weight; j++){
				if(i == 0 && j == 0){
					vals[i][j] = 0;
					continue;
				}
				if(j < values[i]){
					vals[i][j] = vals[i-1][j];
                }else{
//                	vals[i][j] = Math.max(vals[i] + vals[i - 1][j - ]);
                }				
			}
		}
		
		return vals[values.length][weight];
	}

}
