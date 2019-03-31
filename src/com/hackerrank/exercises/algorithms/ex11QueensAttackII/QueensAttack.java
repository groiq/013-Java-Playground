package com.hackerrank.exercises.algorithms.ex11QueensAttackII;

import java.util.Arrays;

public class QueensAttack {
	
	static int queensAttackHelper(int boardSize, int obstacleCount, int queenX, int queenY, int[][] obstacles) {
		
		int risingD = queenY - queenX;
		int fallingD = queenY + queenX;
		
		int horizHigh = boardSize+1;
		int horizLow = 0;
		int vertHigh = boardSize+1;
		int vertLow = 0;
		
		int risingHigh = boardSize+1;
		int risingLow = 0;
		int fallingHigh = boardSize+1;
		int fallingLow = 0;
		
		for (int[] obstacle : obstacles) {
			System.out.println(Arrays.toString(obstacle));
			if (obstacle[0] == queenX) {
				System.out.println("vertical");
				if (obstacle[1] < queenX) {
					vertLow = Math.max(vertLow, obstacle[1]);
				} else {
					vertHigh = Math.min(vertHigh, obstacle[1]);
				}
			} if (obstacle[1] == queenY) {
				System.out.println("horizontal");
				
			} if (obstacle[1] - obstacle[0] == risingD) {
				System.out.println("rising");
			} if (obstacle[0] + obstacle[1] == fallingD) {
				System.out.println("falling");
			}
		}
		
		return 0;
	}
	
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
    	return queensAttackHelper(n, k, r_q, c_q, obstacles);
    }


	public static void main(String[] args) {
		
		int[][] tester;
		tester = new int[][] {new int[]{5,5},new int[] {4,2}, new int[] {2,3}};
		
		System.out.println(queensAttack(5, 3, 4, 3, tester));

	}

}
