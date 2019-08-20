package at.bfi.coders.bay.exercises.unit2._10.cesarChiffre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thesaurus {
	
	private List<String> dict;

	/**
	 * @return the dict
	 */
	public List<String> getDict() {
		return dict;
	}

	/**
	 * @param dict the dict to set
	 */
	public void setDict(List<String> dict) {
		this.dict = dict;
	}
	
	public String[] getDictAsArray() {
		return (String[]) dict.toArray();
	}
	
	public Thesaurus() {
		this.dict = new ArrayList<String>();
	}

	/**
	 * @param dict
	 */
	public Thesaurus(List<String> dict) {
		this.dict = dict;
	}

	@Override
	public String toString() {
		return this.dict.toString();
	}

	public void add(String newWords) {
//		System.out.println("adding words...");
//		System.out.println(newWords);
		String[] wordArray = newWords.split(",\\s");
//		System.out.println(Arrays.toString(wordArray));
		for (String word : wordArray) {
			if (word.length() > 2) {
//				System.out.println(word);
				dict.add(word);
			}
		}
	}
	
	public void add(String[] newWords) {
		for (String string : newWords) {
			add(string);
		}
	}

	
}
