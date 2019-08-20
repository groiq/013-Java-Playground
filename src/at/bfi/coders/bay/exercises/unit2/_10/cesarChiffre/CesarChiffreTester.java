package at.bfi.coders.bay.exercises.unit2._10.cesarChiffre;

/**
Aufgabe: Cäsar Chiffre (Advanced)
Erstelle ein Programm, das eine Variable mit Text enthält. 
Dein Programm soll diesen Text mit einem Passwort (hier einer Zahl) durch eine Cäsar-Chiffre verschlüsseln, 
und dann auf der Konsole ausgeben.

Cäsar Chiffre: Bedeutet dass ich das ABC um eine bestimmte Stelle Verschiebe. 
Nehmen wir an ich verschiebe es um 2 Positionen dann wird aus A ein C, aus B ein D, aus C ein E usw.

Zusatz:

Der Text soll aus einer Datei eingelesen werden.
Der chiffrierte Text soll in einer neuen Datei gespeichert werden.

Entschlüsseln
Erweitere dein Programm so, dass es einen verschlüsselten Text bei gegebenem Passwort entschlüsseln kann. 
Speichere den entschlüsselten Text in einer separaten Datei.

Schlüssel knacken
Erweitere dein Programm so, dass es in der Lage ist, 
einen beliebigen mit einer Cäsar-Chiffre verschlüsselten Text zu entschlüsseln. 
 * @author groiq
 *
 */
public class CesarChiffreTester {

	public static void main(String[] args) {
	
		
		System.out.println("Test encoding a string running through all keys.");
		String text2 = "abcdefghijklmnopqrstuvwxyz | ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		runThroughEncodings(text2);
		System.out.println();
		
		System.out.println("Test encoding a file. Refer to importantMessage.txt, importantMessage_encoded.txt and importantMessage_encoded_decoded.txt.");
		CesarChiffre.encodeFile(".\\sampleFiles\\importantMessage.txt", "encoded", 1);
		CesarChiffre.decodeFile(".\\sampleFiles\\importantMessage_encoded.txt", "decoded", 1);
		
		System.out.println("Test handling a file not found error...");
		CesarChiffre.encodeFile(".\\sampleFiles\\writingWebAppsInBasic.txt", "encoded", 1);
		
		System.out.println();

		Thesaurus theThesaurus = new Thesaurus();
		theThesaurus.add("die, der, und, in, zu, den, das, nicht, von, sie, " + 
				"ist, des, sich, mit, dem, dass, er, es, ein, ich, " + 
				"auf, so, eine, auch, als, an, nach, wie, im, für");
		theThesaurus.add("man, aber, aus, durch, wenn, nur, war, noch, werden, bei, " + 
				"hat, wir, was, wird, sein, einen, welche, sind, oder, zur, " + 
				"um, haben, einer, mir, über, ihm, diese, einem, ihr, uns, " + 
				"da, zum, kann, doch, vor, dieser, mich, ihn, du, hatte, " + 
				"seine, mehr, am, denn, nun, unter, sehr, selbst, schon, hier, " + 
				"bis, habe, ihre, dann, ihnen, seiner, alle, wieder, meine, Zeit, " + 
				"gegen, vom, ganz, einzelnen, wo, muss, ohne, eines, können, sei");
		theThesaurus.add("the, be, to, of, and, a, in, that, have, I, it, for, not, on, with, "
				+ "he, as, you, do, at, this, but, his, by, from, they, we, say, her, she, or, an, will, "
				+ "my, one, all, would, there, their, what, so, up, out, if, about, who, get, which, go, me, "
				+ "when, make, can, like, time, no, just, him, know, take, people, into, year, your, good, some, "
				+ "could, them, see, other, than, then, now, look, only, come, its, over, think, also, back, after, "
				+ "use, two, how, our, work, first, well, way, even, new, want, because, any, these, give, day, most, us");
		
		String[] crackingTestLines = {
				"All work and no play makes Jack a dull boy.",
				"The quick brown fox jumps over the lazy dog.",
				"Franz jagt im verwahrlosten Taxi quer durch Bayern.",
		};
		
		for (String string : crackingTestLines) {
			String encodedString = CesarChiffre.encode(string, 1);
			CesarChiffre.crack(encodedString, theThesaurus);
		}

	}

	private static void runThroughEncodings(String text) {
		String encoded;
		String decoded;
		String pwdFormatted;
		for (int i = 0; i < 27; i++) {
			encoded = CesarChiffre.encode(text, i); 
			decoded = CesarChiffre.decode(encoded, i);
			pwdFormatted = String.format("%02d", i);
			System.out.println(pwdFormatted +  ": " + encoded + " || " + decoded);
		}
	}

}
