/**
 * 
 */
package at.bfi.coders.bay.exercises.builderPattern;

/**
 * <h1>RPG Character using a builder pattern</h1>
 * 
 * <p>Another exercise in the Builder pattern. The aim is to use a builder together with default values.</p>
 * 
 * <p>I'll model an rpg character. It has a name, race, profession, level and hit points.
 * All shall have default values that can be overridden. 
 * Name is a required field, and final. 
 * (Was going to use other final fields, but that doesn't work with a builder. 
 * Maybe some other time.)</p>
 * 
 * <p>Also, this time I'll try and define the builder class within the parent class.</p>
 * 
 * @author  Hannes Alkin
 * @version 
 * @since   09.09.2019

 */
public class PlayerCharacter {
	
	private final String name;
	private final String race;
	private final String profession;
	private int level;
	private int hitpoints;
		
	/**
	 * @param name
	 * @param race
	 * @param profession
	 * @param level
	 * @param hitpoints
	 */
	private PlayerCharacter(String name, String race, String profession, int level, int hitpoints) {
		this.name = name;
		this.race = race;
		this.profession = profession;
		this.level = level;
		this.hitpoints = hitpoints;
	}


	public static class Builder {
		
		private final String name;
		private String race;
		private String profession;
		private int level;
		private int hitpoints;
		
		public Builder(String name) {
			this.name = name;
			this.race = "human";
			this.profession = "warrior";
			this.level = 1;
			this.hitpoints = 100;
		}
		
		public Builder withRace(String race) {
			this.race = race;
			return this;
		}
		
		public Builder withProfession(String profession) {
			this.profession = profession;
			return this;
		}
		
		public Builder withLevel(int level) {
			this.level = level;
			return this;
		}

		public Builder withHitpoints(int hitpoints) {
			this.hitpoints = hitpoints;
			return this;
		}
		
		public PlayerCharacter build() {
			return new PlayerCharacter(this.name, this.race, this.profession, this.level, this.hitpoints);
		}
		
		
	}


	@Override
	public String toString() {
//		return "PlayerCharacter [name=" + name + ", race=" + race + ", profession=" + profession + ", level=" + level
//				+ ", hitpoints=" + hitpoints + "]";
		return name + ", lvl " + level + " " + race + " " + profession + " (" + hitpoints + " HP)";
//		return "lvl " + level + " " + race + " " + profession + " (" + hitpoints + " HP) named " + name;
	}
	
	// TODO write a proper table entry
	public String toTableEntry() {
		String result;
//		result =  String.format("%25s", name) + ": lvl " + String.format("%02d", level) + " "  ;
		result = String.format("%25s: lvl %02d %5s %7s (%3s HP)", name,level,race,profession,hitpoints);
		return result;
	}


	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}


	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}


	/**
	 * @return the hitpoints
	 */
	public int getHitpoints() {
		return hitpoints;
	}


	/**
	 * @param hitpoints the hitpoints to set
	 */
	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return the race
	 */
	public String getRace() {
		return race;
	}


	/**
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}
	
	public int getEffectiveHitpoints() {
		return this.hitpoints * this.level;
	}
	

}
