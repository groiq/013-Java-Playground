package at.bfi.assignments.bonusTracks;

public class SteppedTaxCalculatorV1 {
	
	/**
	 * A variant of the tax calculator assignment that uses differential tariff or whatever it's called.
	 * 
	 * The principle is as follows:
	 * If tax rates are 20% below 500 E and 30% above 500 E,
	 * and you earn 700 E,
	 * then you pay 20% on the first 500 E
	 * and 30% on the other 200 E.
	 * (that'd be 100 + 60 = 160 E, if I'm not mistaken.)
	 */

	private static int totalNet;
	private static int totalTax;

	public static void main(String[] args) {
		
//		Assignment:
//		
//		Implement an income tax calculator. You should print the correct
//tax rate and the resulting net income. the following progressive
//tax rates apply (numbers are gross income):
//0 - 1500 EUR -> 20%
//1501 - 2500 EUR -> 35%
//2501 - 3500 EUR -> 45%
//3501 and above -> 50%

		int[] grossIncomes = {1000,2000,3000,4000};

		for (int i : grossIncomes) {
			printTaxStats(i);
		}
		

	}

	private static void printTaxStats(int gross) {
		
		int[] thresholds = {1500,2500,3500};
		int[] rates = {20,35,45,50};
		
		System.out.println("gross income: " + gross);
		
		int rest = gross;
		int pos = 0;
		int block = thresholds[0];
		totalNet = 0;
		totalTax = 0;
		
		while (rest > block) {
			
			//block = thresholds[pos];
			rest -= block;
			
			printBlock(block,rates[pos]);
			
//			System.out.println(block);
			
			pos += 1;
			if (pos >= thresholds.length) break;
			block = thresholds[pos] - thresholds[pos-1];
			
		}
		
		printBlock(rest,rates[pos]);
		
		System.out.println("In total, net income is " + totalNet + " and tax is " + totalTax + ".");
		System.out.println();
		
	}

	private static void printBlock(int block, int rate) {
		
		System.out.print(block + " with " + rate + "%");
		
		int currTax = (block / 100) * rate;
		int currNet = block - currTax;
		totalTax += currTax;
		totalNet += currNet;
		
		System.out.println("; that's " + currNet + " net value and " + currTax + "tax.");
		
	}

}
