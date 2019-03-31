package com.hackerrank.exercises.algorithms.ex11QueensAttackII;

public class QueensAttack {
	
	static int queensAttackHelper(int boardSize, int obstacleCount, int queenX, int queenY, int[][] obstacles) {
		
		int offset = queenY - queenX;
		
		for (int[] obstacle : obstacles) {
			if (obstacle[0] == queenX) {
				
			} if (obstacle[1] == queenY) {
				
			} if (obstacle[1] - obstacle[0] == offset) {
				
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
