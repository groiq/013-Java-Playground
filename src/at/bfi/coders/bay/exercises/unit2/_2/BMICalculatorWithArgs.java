package at.bfi.coders.bay.exercises.unit2._2;

import java.util.Arrays;

public class BMICalculatorWithArgs {

	public static void main(String[] args) {
		
		String sizeAsString = args[0];
		
		System.out.println("Hello!");
		System.out.println(args);
		System.out.println(Arrays.toString(args));
		for (String string : args) {
			System.out.println(string);
		}
		



	}

}
