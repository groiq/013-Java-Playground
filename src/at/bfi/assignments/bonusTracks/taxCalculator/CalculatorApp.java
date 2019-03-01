/**
 * assignment:
 * 
 * Implement an income tax calculator. You should print the correct tax rate and
 * the resulting net income. the following progressive tax rates apply (numbers
 * are gross income): 
 * 0 - 1500 EUR -> 20% 
 * 1501 - 2500 EUR -> 35% 
 * 2501 - 3500 EUR -> 45% 
 * 3501 and above -> 50%
 * 
 * Note that the assignment doesn't specify a tax progression method.
 * The correct tax calculation is as such:
 * If you earn 400 Eur, then
 * 1500 Eur are taxed with 20%,
 * 1000 Eur (1501-2500) with 35%,
 * 1000 Eur (2501-3500) with 45%,
 * and 500 Eur (3501-4000) with 50%.
 * 
 * 
 */


package at.bfi.assignments.bonusTracks.taxCalculator;

public class CalculatorApp {

	public static void main(String[] args) {
		
//		int[] thresholds = {1500,2500,3500};
//		int[] rates = {20,35,45,50};
//		

		int[] incomes = {1000,1500,2000,2500,3000,3500,4000};
		TaxStats[] incomeStats = new TaxStats[incomes.length];
		
		for (int i = 0; i < incomeStats.length; i++) {
			incomeStats[i] = new TaxStats(incomes[i]);
			System.out.println(incomeStats[i]);
			System.out.println();
			System.out.println("--------------");
			System.out.println();
		}

	}

}
