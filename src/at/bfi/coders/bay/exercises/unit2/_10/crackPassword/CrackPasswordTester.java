package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

public class CrackPasswordTester {
	
	

	public static void main(String[] args) {
		
		Professor drPepper = new Professor("System.out.println(\"Hello world!\");", "Professor Pepper", 4);
		
		Sleuth samSpade = new Sleuth("Sam Spade", 1000);
		
		Student anonymousCheater = new Student("Do we need names?", 1500);
		
		anonymousCheater.bargain(samSpade, drPepper, 500);

	}

}
