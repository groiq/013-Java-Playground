package other.exercises.e01.simple.recursion;

public class Queuer {
	
	private final String name;
	private Queuer queuerInFront;
	
	public Queuer(String name) {
		this.name = name;
	}
	
	public void queueBehind(Queuer lastQueuer) {
		this.queuerInFront = lastQueuer;
	}

	String getName() {
		return name;
	}
	
	/*
	 * Note that this means that when someone hasn't joined a queue yet, their position is 1 -
	 * thus they are a queue of their own.
	 */
	public int getPosition() {
		int position;
		if (this.queuerInFront == null) {
			position = 0;
		} else {
			position = queuerInFront.getPosition();
		}
		position++;
		return position;
	}

	@Override
	public String toString() {
		return "Queuer named \"" + this.name + "\"";
	}
	
	

}
