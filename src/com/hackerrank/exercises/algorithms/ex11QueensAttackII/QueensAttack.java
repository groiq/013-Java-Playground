package com.hackerrank.exercises.algorithms.ex11QueensAttackII;

import java.util.Arrays;

public class QueensAttack {
	
	static int queensAttackHelper(int boardSize, int obstacleCount, int queenX, int queenY, int[][] obstacles) {
		
//		System.out.println(boardSize + "x" + boardSize + "," + queenX + "," + queenY);
		
		int maxHigh = boardSize + 1;
		
		int horizLow = 0;
		int horizHigh = maxHigh;
		int vertLow = 0;
		int vertHigh = maxHigh;
		
		int risingD = queenY - queenX;
		int fallingD = queenY + queenX;
		
		
		int risingLow = Math.max(0, risingD);
		int risingHigh = Math.min(maxHigh, maxHigh+risingD);

		int fallingLow = Math.max(0, fallingD-maxHigh);
		int fallingHigh = Math.min(fallingD, maxHigh);
		
//		// for later: generate a board as an object, provide a drawBoard method using fields
//		for (int y = boardSize; y > 0; y--) {
//			for (int x = 1; x < maxHigh; x++) {
//				if (x == queenX && y == queenY) {
//					System.out.print("X");
//				} else {
//					if (x == queenX) {
//						System.out.print("|");
//					} else if (y == queenY) {
//						System.out.print("-");
//					} else if (x + y == fallingD) {
//						System.out.print("\\");
//					} else if (y - x == risingD) {
//						System.out.print("/");
//					} else {
//						System.out.print(".");
//					}
//				}
//			}
//			System.out.println();
//		}
		
//		System.out.println("risingD: " + risingD + ", risingLow: " + risingLow + ", risingHigh: " + risingHigh);
//		System.out.println("fallingD: " + fallingD + ", fallingLow: " + fallingLow + ", fallingHigh: " + fallingHigh);
		
		for (int[] obstacle : obstacles) {
			if (obstacle == null) break;
			System.out.println(Arrays.toString(obstacle));
			if (obstacle[0] == queenX) {
				if (obstacle[1] < queenY) {
					vertLow = Math.max(vertLow, obstacle[1]);
				} else {
					vertHigh = Math.min(vertHigh, obstacle[1]);
				}
			} else if (obstacle[1] == queenY) {
				if (obstacle[0] < queenX) {
					horizLow = Math.max(horizLow, obstacle[0]);
				} else {
					horizHigh = Math.min(horizHigh, obstacle[0]);
				} 
			} else if (obstacle[1] - obstacle[0] == risingD) {
				if (obstacle[1] < queenY) {
					risingLow = Math.max(risingLow, obstacle[1]);
				} else {
					risingHigh = Math.min(risingHigh, obstacle[1]);
				}
			} else if (obstacle[0] + obstacle[1] == fallingD) {
				if (obstacle[1] < queenY) {
					fallingLow = Math.max(fallingLow, obstacle[1]);
				} else {
					fallingHigh = Math.min(fallingHigh, obstacle[1]);
				}
			}
		}
		
		int result = 0;
		
		result = result + horizHigh - horizLow - 2;
		result = result + vertHigh - vertLow - 2;
		result = result + risingHigh - risingLow - 2;
		result = result + fallingHigh - fallingLow - 2;
		
		return result;
	}
	
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
    	return queensAttackHelper(n, k, r_q, c_q, obstacles);
    }


	public static void main(String[] args) {
		
		int[][] tester;
		tester = new int[][] {new int[]{5,5},new int[] {4,2}, new int[] {2,3}};
		int[][] empty = new int[][] {new int[] {}};
		
		System.out.println(queensAttack(5, 3, 4, 3, tester));
//		System.out.println(queensAttack(7, 0, 2, 3, empty));
		System.out.println(queensAttack(7, 0, 2, 3, new int[][] {null}));
//		System.out.println(queensAttack(7, 0, 4, 4, empty));
//		System.out.println(queensAttack(7, 0, 6, 5, empty));
//		int testSize;
//		testSize = 5;
////		testSize = 3;
//		for (int i = 1; i < testSize+1; i++) {
//			for (int j = 1; j < testSize+1; j++) {
//				System.out.println(queensAttack(testSize, 0, i, j, empty));
//				System.out.println("--------");
//			}
//		}
		
//		System.out.println(queensAttack(27, 0, 18, 4, empty));
		

	}

}
