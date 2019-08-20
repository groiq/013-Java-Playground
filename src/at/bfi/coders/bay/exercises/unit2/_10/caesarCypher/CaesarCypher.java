package at.bfi.coders.bay.exercises.unit2._10.caesarCypher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Encodes and decodes Strings using a Caesar Cypher.
 * 
 * In a Caesar Cypher, "each letter in the plaintext is replaced by a letter some fixed number of positions down the alphabet. 
 * For example, with a left shift of 3, D would be replaced by A, E would become B, and so on."
 * (https://en.wikipedia.org/wiki/Caesar_cipher)
 * 
 * This cypher is hardcoded to substitute alphabetic characters included in the ASCII set.
 * All other signs are ignored.
 * For later milestones, make the character range more dynamic; handle unicode.
 * 
 * The methods are designed to take the amount of the shift as a parameter.
 * For this amount, values between 0 and 26 (inclusive) are supported.
 * Numbers outside this range are for the next milestone.
 * 
 * @author groiq
 *
 */
public class CaesarCypher {
	
	private static final int aAscii = (int) 'a';
	private static final int zAscii = (int) 'z';
	private static final int AAscii = (int) 'A';
	private static final int ZAscii = (int) 'Z';
	
	/**
	 * Encodes a String by shifting characters by a given amount. Supports positive integers (including 0) for the password.
	 * @param text the String to be encoded
	 * @param pwd the amount of the shift
	 * @return the encoded String
	 */
	public static String encode(String text, int pwd) {
		// if pwd is greater than 26, bring it within the range.
		pwd = pwd % (zAscii-aAscii+1);
		/*
		 * Cast the String to a char array.
		 * Loop through the array.
		 * For each char, check the ascii value; 
		 * if it is between a and z or A and Z, calculate the shifted value
		 * and replace the char by the corresponding shifted char.
		 */
		char[] asChars = text.toCharArray();
		int curAscii;
		for (int i = 0; i < asChars.length; i++) {
			curAscii = (int) asChars[i];
			if (curAscii >= aAscii && curAscii <= zAscii) {
				
				asChars[i] = encodeChar(curAscii,aAscii,zAscii,pwd);
			} else if (curAscii >= AAscii && curAscii <= ZAscii) {
				asChars[i] = encodeChar(curAscii, AAscii, ZAscii,pwd);
			}
		}
		/* Cast the char[] back to a String and return. */
		text = new String(asChars);
		return text;
	}
	
	/*
	 * Shifts a character by a given value in the alphabet.
	 */
	private static char encodeChar(int curAscii, int a, int z, int pwd) {
		// First, add the pwd to the ascii value.
		curAscii = curAscii + pwd;
		/*
		 * If the new ascii value is outside of the a-z range,
		 * calculate size of the range, substract it and correct off-by-one errors.
		 */
		if (curAscii > z) {
			curAscii -= (z-a+1);
		}
		// return the calculated ascii value.
		return (char) curAscii;
	}
	
	/**
	 * Encodes an entire file and writes the result to a new file.
	 * 
	 * Expects a relative file path in the form ".\{directory}[\{subdirectories}]\{filename}.{ending}".
	 * Creates a file named ".\{directory}[\{subdirectories}]\{filename}_{outfilePostfix}.{ending}".
	 * Note that this cannot handle any other periods in the file / directory names.
	 * Note also that output files are overwritten.
	 * 
	 * @param infilePath the file to be encoded
	 * @param outfilePostfix postfix for the output file
	 * @param pwd the amount of the shift
	 */
	public static void encodeFile(String infilePath, String outfilePostfix, int pwd) {
		
		// generate the name for the output file
		String[] splitName;
		splitName = infilePath.split("[.]{1}");
		String outfilePath = "." + splitName[1] + "_" + outfilePostfix + "." + splitName[2];
		
		// set up a BufferedReader for the infile and a BufferedWriter for the outfile
		try(BufferedReader inputFileContents = new BufferedReader(new FileReader(new File(infilePath)));
				BufferedWriter outputWriter = new BufferedWriter(new FileWriter(new File(outfilePath)))) {
			/*
			 * Set up an empty String. Encode the input line by line and append the result to the output.
			 */
			String output = "";
			String curLine;
			while((curLine = inputFileContents.readLine()) != null) {
				output += encode(curLine, pwd) + "\n";
			}
			// write the finished output to file.
			outputWriter.write(output);
		// on IOExceptions, just print the error message.
		} catch (IOException e) {
			System.out.println(e);
		}	
		
	}
	
	/**
	 * Cracks a Caesar cypher using brute force.
	 * 
	 * Generates the possible decryptions and compares them to a list of words stored in a thesaurus object.
	 * If a decrypted String contains at least one word from the thesaurus, it is printed to the console.
	 * 
	 * @param input the String to be cracked
	 * @param thesaurus the Thesaurus to be used
	 */
	public static void crack(String input, Thesaurus thesaurus) {
		System.out.println();
		System.out.println("Trying to crack string: \"" + input + "\"");
		String testString;
		String[] words;
		for (int i = 0; i < 27; i++) {
			testString = decode(input, i);
			words = testString.split("\\s+");
			for (String word : words) {
				if (thesaurus.getDict().contains(word)) {
					System.out.println("possible match: chiffre: " + i + ", text: " + testString);
					break;
				}
			}
		}
	}
	
	/*
	 * Takes the cypher a String was encoded with and calculates the cypher needed to decode it.
	 */
	private static int decodePwd(int encodePwd) {
		return (zAscii - aAscii) - encodePwd + 1;
	}
	
	/**
	 * Reverts encoding of a String.
	 * Supports cyphers between 0 and 26.
	 * Returns the decoded String.
	 * @param text the encoded String
	 * @param pwd the cypher the String was encoded with
	 * @return the decoded String
	 */
	public static String decode(String text, int pwd) {
		return encode(text, decodePwd(pwd));
	}
	
	/**
	 * Reverts encoding of a file.
	 * Supports cyphers between 0 and 26.
	 * Writes the decoded text to a new file.
	 * File handling restrictions like in encodeFile().
	 * @param infilePath the file to be decoded
	 * @param outfilePostfix postfix for the output file
	 * @param pwd the cypher the file was encoded with
	 */
	public static void decodeFile(String infilePath, String outfilePostfix, int pwd) {
		encodeFile(infilePath, outfilePostfix, decodePwd(pwd));
	}

}
