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
		System.out.println(queensAttack(7, 0, 3, 2, empty));
		System.out.println(queensAttack(7, 0, 4, 4, empty));
		System.out.println(queensAttack(7, 0, 5, 6, empty));
		

	}

}
