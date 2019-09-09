/**
 * 
 */
package at.bfi.coders.bay.exercises.builderPattern;

import java.util.Arrays;


/**
 * @author  Hannes Alkin
 * @version 
 * @since   09.09.2019

 */
public class BuilderPatternTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// test the builder on rpg character
//		# names from: https://www.name-generator.org.uk/

//		System.out.println(Math.pow(2, 4));
		String[] names = { "Bathtson Freeger", "Pointyspen Bellelline", "Jaenstewart Grangdon", "Wickedro Elliottshot",
				"Hermilawrence Clarkotter", "Harilda Sandore", "Mcdonaldcackle Bapower", "Crawfordbroom Mitcheness",
				"Thocat Burpower", "Greenhar Roness", "Agadunn Aumrris", "Cacklegordon Williamsshot",
				"Fostercauldron Williamar", "Hane Grangthompson", "Davintress Dumbleriffiths",
				"Broomtucker Granghoward", "Fosterhat Williamar", "Wandper Bapower", "Elmmos Grangthompson",
				"Gandunn Aumrris" };
		System.out.println(Arrays.toString(names));
		System.out.println(names.length);

		PlayerCharacter[] charsWithChaining = new PlayerCharacter[4];
		int pos = 0;

		charsWithChaining[pos] = new PlayerCharacter.Builder(names[pos]).build();
		pos++;
		charsWithChaining[pos] = new PlayerCharacter.Builder(names[pos]).withProfession("ranger").build();
		pos++;
		charsWithChaining[pos] = new PlayerCharacter.Builder(names[pos]).withRace("elf").build();
		pos++;
		charsWithChaining[pos] = new PlayerCharacter.Builder(names[pos]).withProfession("ranger").withRace("elf")
				.build();

		System.out.println();
		System.out.println(pos);
//		System.out.println(Arrays.toString(charsWithChaining));
		for (PlayerCharacter playerCharacter : charsWithChaining) {
			System.out.println(playerCharacter);
		}

		System.out.println();
		PlayerCharacter[] charsWithLoop = new PlayerCharacter[16];

		PlayerCharacter.Builder tempBuilder;
		for (pos = 0; pos < charsWithLoop.length; pos++) {
//			System.out.println(names[pos]);
			tempBuilder = new PlayerCharacter.Builder(names[pos]);
			if (pos % 2 != 0) {
				tempBuilder = tempBuilder.withRace("elf");
			}
			if ((pos / 2) % 2 != 0) {
				tempBuilder = tempBuilder.withProfession("ranger");
			}
			if ((pos / 4) % 2 != 0) {
				tempBuilder = tempBuilder.withLevel(2);
			}
			if ((pos / 8) % 2 != 0) {
				tempBuilder = tempBuilder.withHitpoints(50);
			}
			charsWithLoop[pos] = tempBuilder.build();

		}

		for (PlayerCharacter character : charsWithLoop) {
			System.out.println(character.toTableEntry());
		}

	}

}
