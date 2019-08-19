package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

public class CrackPasswordTester {
	
	

	public static void main(String[] args) {
		
		Professor drPepper = new Professor("System.out.println(\"Hello world!\");", "Professor Pepper", 4);
		
		System.out.println("fetching solution...");
		System.out.println(drPepper.getSolution());
		
		System.out.println("fetching solution with universal password");
		System.out.println(drPepper.getSolution("swordfish"));
		
		System.out.println("fetching password...");
		System.out.println(drPepper.getPassword());
		
		Sleuth samSpade = new Sleuth("Sam Spade");
		
		System.out.println("the solution is: " + samSpade.crackSolution(drPepper));
		

	}

}
