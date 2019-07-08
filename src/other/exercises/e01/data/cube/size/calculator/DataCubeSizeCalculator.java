package other.exercises.e01.data.cube.size.calculator;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author HAL
 *
 * A question that just came up in my database course:
 * Given a data cube with a known set of dimensions,
 * and a known number of tuples per dimension,
 * how many fields are there?
 * https://lagunita.stanford.edu/courses/DB/OLAP/SelfPaced/courseware/ch-on-line_analytical_processing/seq-vid-olap/?activate_block_id=i4x%3A%2F%2FDB%2FOLAP%2Fsequential%2Fseq-vid-olap
 * 
 * Thought I'd write a calculator for that.
 *
 */
public class DataCubeSizeCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many dimensions does the cube have?");
		int dimensions = input.nextInt();
		System.out.println("Calculating a cube with " + dimensions + " dimensions...");
		
		int[] tupleCount = new int[dimensions];
		
		for (int i = 0; i < tupleCount.length; i++) {
			System.out.println("Dimension #" + (i+1) + ": How many tuples are there?");
			tupleCount[i] = input.nextInt();
		}
		System.out.println("Stats of your data cube: " + Arrays.toString(tupleCount));
		
		input.close();

	}

}
