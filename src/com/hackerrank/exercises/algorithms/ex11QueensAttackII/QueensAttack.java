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
		
//		int risingHigh = boardSize+1;
//		int risingLow = 0;
//		int fallingHigh = boardSize+1;
//		int fallingLow = 0;
		int risingHigh = Math.min(boardSize, boardSize+risingD)+1;
		int risingLow = Math.max(0, risingD);
		int fallingHigh = Math.min(boardSize+1, fallingD);
		int fallingLow = Math.max(0, fallingD-boardSize);
		
		for (int[] obstacle : obstacles) {
			System.out.println(Arrays.toString(obstacle));
			if (obstacle[0] == queenX) {
				System.out.println("vertical");
				if (obstacle[1] < queenY) {
					vertLow = Math.max(vertLow, obstacle[1]);
				} else {
					vertHigh = Math.min(vertHigh, obstacle[1]);
				}
			} if (obstacle[1] == queenY) {
				System.out.println("horizontal");
				if (obstacle[0] < queenX) {
					horizLow = Math.max(horizLow, obstacle[0]);
				} else {
					horizHigh = Math.min(horizHigh, obstacle[0]);
				}
				
			} if (obstacle[1] - obstacle[0] == risingD) {
				System.out.println("rising");
				if (obstacle[0] < queenX) {
					risingLow = Math.max(risingLow, obstacle[0]);
				} else {
					risingHigh = Math.min(risingHigh, obstacle[0]);
				}
			} if (obstacle[0] + obstacle[1] == fallingD) {
				System.out.println("falling");
				if (obstacle[0] < queenX) {
					fallingLow = Math.max(fallingLow, obstacle[0]);
				} else {
					fallingHigh = Math.min(fallingHigh, obstacle[0]);
				}
			}
		}
		
		int result = 0;
		
		result = result + horizHigh - horizLow - 1;
		result = result + vertHigh - vertLow - 1;
		result = result + risingHigh - risingLow - 1;
		result = result + fallingHigh - fallingLow - 1;
		
		return result;
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
