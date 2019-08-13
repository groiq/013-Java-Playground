package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

public class ProfessorAccount {
	
	private final String password;
	private final String solution;
	private final String name;

	public String getName() {
		return name;
	}

	public String getPassword() {
		return "You didn't think this would work, did you?";
	}
	
	public String getSolution() {
		return "You didn't think this would work, did you?";
	}

	public int getPasswordLength() {
		return password.length();
	}

	

	public ProfessorAccount(String solution, String name, int passwordLen) {
		this.password = "....";
		this.solution = solution;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ProfessorAccount [password=<REDACTED>, solution=<REDACTED>, name=" + name + "]";
	}


}
