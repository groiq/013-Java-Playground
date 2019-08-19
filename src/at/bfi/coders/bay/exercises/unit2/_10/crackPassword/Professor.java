package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

public class Professor {
	
	private final char[] password;
	private final String solution;
	private final String name;
	private final char[] pwdChars;

	public String getName() {
		return name;
	}

	public String getPassword() {
		return "You didn't think this would work, did you?";
	}
	
	public String getSolution() {
		return "You didn't think this would work, did you?";
	}
	
	public String getSolution(String password) {
		if (password.equals(this.password)) {
			return this.solution;
		} else {
			return "Wrong password!";
		}
	}
	
	public boolean enterPassword(char[] passwordGuess) {
		return (passwordGuess.equals(this.password));

	}

	public int getPasswordLength() {
		return password.length;
	}

	

	public char[] getPwdChars() {
		return pwdChars;
	}

	public Professor(String solution, String name, int passwordLen) {
		/* next milestone: generate pwd at random */
		this.password = new char[] {'a','b','c','1'};
		this.solution = solution;
		this.name = name;
		/* next milestone: generate pwd char range dynamically */
		this.pwdChars = new char[] {'a','b','c','0','1','2'};
	}

	@Override
	public String toString() {
		return "ProfessorAccount [password=<REDACTED>, solution=<REDACTED>, name=" + name + "]";
	}


}
