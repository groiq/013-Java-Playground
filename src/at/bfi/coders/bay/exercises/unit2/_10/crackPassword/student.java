package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

public class student {
	
	private final String name;
	private int budget;
	
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public String getName() {
		return name;
	}
	public student(String name, int budget) {
		this.name = name;
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", budget=" + budget + "]";
	}
	
	public void bargain(Sleuth sleuth, ProfessorAccount professor, int amount) {
		
		System.out.println("trying to hire " + sleuth.getName() + " to steal the solutions from " + professor.getName() + "...");
		
		while (amount <= budget) {
			// try-except handling
			amount += 10;
		}
		
	}

}
