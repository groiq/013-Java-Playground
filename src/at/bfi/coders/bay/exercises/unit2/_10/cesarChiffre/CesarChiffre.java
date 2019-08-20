package at.bfi.coders.bay.exercises.unit2._10.cesarChiffre;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CesarChiffre {
	
	private static final int aAscii = (int) 'a';
	private static final int zAscii = (int) 'z';
	private static final int AAscii = (int) 'A';
	private static final int ZAscii = (int) 'Z';
	
	
	
	/* next milestone: handle negative numbers */
	public static String encode(String text, int pwd) {
		pwd = pwd % (zAscii-aAscii+1);
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
		text = new String(asChars);
		return text;
	}
	
	private static char encodeChar(int curAscii, int a, int z, int pwd) {
		curAscii = curAscii + pwd;
		if (curAscii > z) {
			curAscii -= (z-a+1);
		}
		return (char) curAscii;
	}
	
	public static void encodeFile(String infilePath, String outfileAppend, int pwd) {
		
		String[] splitName;
		splitName = infilePath.split("[.]{1}");
		String outfilePath = "." + splitName[1] + "_" + outfileAppend + "." + splitName[2];
		
		try(BufferedReader inputFileContents = new BufferedReader(new FileReader(new File(infilePath)));
				BufferedWriter outputWriter = new BufferedWriter(new FileWriter(new File(outfilePath)))) {
			String output = "";
			String curLine;
			while((curLine = inputFileContents.readLine()) != null) {
				output += encode(curLine, pwd) + "\n";
			}
			outputWriter.write(output);
		} catch (IOException e) {
			System.out.println(e);
		}	
		
	}
	
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
	
	private static int decodePwd(int encodePwd) {
		return (zAscii - aAscii) - encodePwd + 1;
	}
	
	/* next milestone: handle numbers outside of the range of 0-26 */
	public static String decode(String text, int pwd) {
//		int encoder = (zAscii - aAscii) - pwd + 1;
		return encode(text, decodePwd(pwd));
	}
	
	public static void decodeFile(String infilePath, String outfileAppend, int pwd) {
		encodeFile(infilePath, outfileAppend, decodePwd(pwd));
	}

}
