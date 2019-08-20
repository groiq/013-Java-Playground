package at.bfi.coders.bay.exercises.unit2._10.cesarChiffre;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Reads a file and writes the contents to a different file.
 * @author groiq
 *
 */
public class CopyInputToOutput {

	public static void main(String[] args) {
		
//		System.out.println(System.getProperty("user.dir"));
		
		String infileName;
		infileName = ".\\sampleFiles\\importantMessage.txt";
//		infileName = ".\\hello.txt";

		String[] splitName;
		splitName = infileName.split("[.]{1}");
		System.out.println(Arrays.toString(splitName));
		String outfileName = "." + splitName[1] + "_processed" + "." + splitName[2];
		System.out.println(outfileName);
		

		
		try(BufferedReader inputFileContents = new BufferedReader(new FileReader(new File(infileName)));
				BufferedWriter outputWriter = new BufferedWriter(new FileWriter(new File(outfileName)))) {
			String output = "";
			String curLine;
			while((curLine = inputFileContents.readLine()) != null) {
				System.out.println(curLine);
				output += curLine;
				output += "\nadd more superfluous text here.\n";
			}
			outputWriter.write(output);
		} catch (IOException e) {
			System.out.println(e);
		}
		

	}

}
