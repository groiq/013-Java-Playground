package at.bfi.coders.bay.exercises.unit5.review;

/**
 * Player character simulation. Character race and profession are unchangeable.
 * Character name can be changed. A character is created on level 1. It's
 * supposed to level up step by step, but the interface provides more
 * flexibility.
 * 
 * @author Hannes Alkin
 * @version
 * @since 03.10.2019
 */
public class PlayerCharacter {

	private String name;
	private final String race;
	private final String profession;
	private int level;

	/**
	 * Create a new character
	 * 
	 * @param name
	 * @param race
	 * @param profession
	 */
	public PlayerCharacter(String name, String race, String profession) {
		this.name = name;
		this.race = race;
		this.profession = profession;

		this.level = 1;
	}

	/**
	 * Get character name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Change character name
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * get the current level
	 * 
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * set level manually to an arbitrary value
	 * 
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * standard level up (increase level by one)
	 */
	public void levelUp() {
		this.setLevel(this.getLevel() + 1);
		System.out.println("You've leveled up!");
	}

	/**
	 * get character race
	 * 
	 * @return the race
	 */
	public String getRace() {
		return race;
	}

	/**
	 * get character profession
	 * 
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}

	@Override
	public String toString() {
		return "*" + name + "*, lvl " + level + " " + race + " " + profession;
	}

}
