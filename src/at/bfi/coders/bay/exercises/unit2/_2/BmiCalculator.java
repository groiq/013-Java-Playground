package at.bfi.coders.bay.exercises.unit2._2;

/**
 * 
 * @author groiq
 *
 *Calculates a bmi.
 *Gives feedback whether the bmi is healthy.
 *
 *Source: https://www.diabetes.ca/managing-my-diabetes/tools---resources/body-mass-index-(bmi)-calculator
 *
 * > Body Mass Index is a simple calculation using a person[']s height and weight. The formula is BMI = kg/m2 
 * > where kg is a person[']s weight in kilograms and m2 is their height in metres squared.
 * > A BMI of 25.0 or more is overweight, while the healthy range is 18.5 to 24.9. BMI applies to most adults 18-65 years.
 */
public class BmiCalculator {
	
	private static double lowerLimit = 18.5;
	private static double upperLimit = 24.9;

	private static String calculateBMI(double size, double weight) {

		double bmi = weight / Math.pow(size, 2);
		
		String judgment = "";
		if (bmi < lowerLimit) {
			judgment = "underweight";
		} else {
			if (bmi > upperLimit) {
				judgment = "overweight";
			} else {
				judgment = "within healthy range";
			}
		}

		String result = "given values: size " + size + ", weight " + weight + ". " + "Your bmi is " + bmi + ", meaning that you are " + judgment + ".";
		
		return result;
	}

	public static void main(String[] args) {
		
		for (double size = 1.80; size < 1.90; size += 0.10) {
			for (double weight = 40.0; weight < 120.1; weight += 10) {
				System.out.println(calculateBMI(size, weight));
			}
		}

	}

}
