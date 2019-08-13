package at.bfi.coders.bay.exercises.unit2._10.crackPassword;

public class Student {
	
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
	public Student(String name, int budget) {
		this.name = name;
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", budget=" + budget + "]";
	}
	
	public void bargain(Sleuth sleuth, Professor professor, int amount) {
		
		System.out.println("trying to hire " + sleuth.getName() + " to steal the solutions from " + professor.getName() + "...");
		
		String result;
		do {
			result = sleuth.buySolution(amount, professor);
			amount += 100;
			if (amount > budget) {
				System.out.println("over budget");
				break;
			}
		} while (result.equals(sleuth.getDeclineMessage()));
		
		System.out.println("The solution is:");
		System.out.println(result);

		
	}

}