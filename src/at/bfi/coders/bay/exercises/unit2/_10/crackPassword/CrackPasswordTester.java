package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

public class CrackPasswordTester {
	
	

	public static void main(String[] args) {
		
		Professor drPepper = new Professor("System.out.println(\"Hello world!\");", "Professor Pepper", 4);
		
		
		System.out.println("calling getter for solution...");
		System.out.println(drPepper.getSolution());
		
		char[] wrongPassword = {'0','0'};
		System.out.println("fetching solution with wrong password...");
		System.out.println(drPepper.getSolution(wrongPassword));
		
		System.out.println("calling getter for password password...");
		System.out.println(drPepper.getPassword());
		
		System.out.println("cracking password properly...");
		Sleuth samSpade = new Sleuth("Sam Spade");
		
		System.out.println("the solution is: " + samSpade.crackSolution(drPepper));
		

	}

}
