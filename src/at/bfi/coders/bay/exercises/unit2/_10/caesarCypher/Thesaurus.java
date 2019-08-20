package at.bfi.coders.bay.exercises.unit2._10.caesarCypher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Handles a list of words used to crack a Caesar cypher.
 * 
 * Stores the list of words in an arraylist called dict.
 * 
 * for next milestone: methods to remove words
 * 
 * @author groiq
 *
 */
public class Thesaurus {
	
	private List<String> dict;

	/**
	 * returns the dict as an arrayList.
	 * @return the dict
	 */
	public List<String> getDict() {
		return dict;
	}

	/**
	 * sets a completely new dict.
	 * @param dict the dict to set
	 */
	public void setDict(List<String> dict) {
		this.dict = dict;
	}
	
	/**
	 * returns the dict as an array.
	 * @return the dict
	 */
	public String[] getDictAsArray() {
		return (String[]) dict.toArray();
	}
	
	/**
	 * initializes a new thesaurus with an empty dict.
	 */
	public Thesaurus() {
		this.dict = new ArrayList<String>();
	}

	/**
	 * initializes a new thesaurus with a given dict.
	 * @param dict
	 */
	public Thesaurus(List<String> dict) {
		this.dict = dict;
	}

	/**
	 * prints out the contents of the dict.
	 */
	@Override
	public String toString() {
		return this.dict.toString();
	}

	/**
	 * adds a word or a list of words to the dict
	 * @param newWords a single word or a comma-separated list of words, formatted as a String
	 */
	public void add(String newWords) {
		String[] wordArray = newWords.split(",\\s");
		for (String word : wordArray) {
			if (word.length() > 2) {
				dict.add(word);
			}
		}
	}
	
	/**
	 * adds new words contained in an array
	 * @param newWords a list of new words in a String array
	 */
	public void add(String[] newWords) {
		for (String string : newWords) {
			add(string);
		}
	}
	
}
