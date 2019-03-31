package com.hackerrank.exercises.algorithms.ex11QueensAttackII;

import java.util.Arrays;

public class QueensAttack {
	
	static int queensAttackHelper(int boardSize, int obstacleCount, int queenX, int queenY, int[][] obstacles) {
		
		System.out.println(boardSize + "x" + boardSize + "," + queenX + "," + queenY);
		
		int maxHigh = boardSize + 1;
		
		int horizLow = 0;
		int horizHigh = maxHigh;
		int vertLow = 0;
		int vertHigh = maxHigh;
		
		int risingD = queenY - queenX;
		int fallingD = queenY + queenX;
		
		System.out.println(risingD + "||" + fallingD);
		
//		for (int y = boardSize; y > 0; y--) {
//			for (int x = 1; x < maxHigh; x++) {
//				if (y - x == risingD) {
//					if (x + y == fallingD) {
//						System.out.print("X");
//					} else {
//						System.out.print("/");
//					}
//				} else if (x + y == fallingD) {
//					System.out.print("\\");
//				} else {
//					System.out.print(".");
//				}
//			}
//			System.out.println();
//		}
		
		// Todo: generate a board as an object, provide a drawBoard method using fields
		for (int y = boardSize; y > 0; y--) {
			for (int x = 1; x < maxHigh; x++) {
				if (x == queenX && y == queenY) {
					System.out.print("X");
				} else {
					if (x == queenX) {
						System.out.print("|");
					} else if (y == queenY) {
						System.out.print("-");
					} else if (x + y == fallingD) {
						System.out.print("\\");
					} else if (y - x == risingD) {
						System.out.print("/");
					} else {
						System.out.print(".");
					}
				}
			}
			System.out.println();
		}
		
		
		int result = 0;
		
		result = result + horizHigh - horizLow - 2;
		result = result + vertHigh - vertLow - 2;
//		result = result + risingHigh - risingLow - 1;
//		result = result + fallingHigh - fallingLow - 1;
		
		return result;
	}
	
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
    	return queensAttackHelper(n, k, r_q, c_q, obstacles);
    }


	public static void main(String[] args) {
		
		int[][] tester;
		tester = new int[][] {new int[]{5,5},new int[] {4,2}, new int[] {2,3}};
		int[][] empty = new int[][] {new int[] {}};
		
//		System.out.println(queensAttack(5, 3, 4, 3, tester));
//		System.out.println(queensAttack(7, 0, 2, 3, empty));
//		System.out.println(queensAttack(7, 0, 4, 4, empty));
//		System.out.println(queensAttack(7, 0, 6, 5, empty));
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println(queensAttack(5, 0, i, j, empty));
				System.out.println("--------");
			}
		}
		
//		System.out.println(queensAttack(27, 0, 18, 4, empty));
		

	}

}
