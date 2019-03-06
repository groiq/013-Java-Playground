/**
 * Implements an income tax calculator.
 * 
 * This class provides a main method to test the TaxStats class.
 */



package at.bfi.assignments.conditionals.taxCalculator.v3;

public class CalculatorApp {

	public static void main(String[] args) {
		
//		int[] thresholds = {1500,2500,3500};
//		int[] rates = {20,35,45,50};
//		

		TaxStats currStats;
		int[] incomes = {1000,1500,2000,2500,3000,3500,4000};
		
		for (int i : incomes) {
			currStats = new TaxStats(i);
			currStats.printAllOutputs();
			System.out.println();
			System.out.println("---------------------");
			System.out.println();
		}
		


	}

}
