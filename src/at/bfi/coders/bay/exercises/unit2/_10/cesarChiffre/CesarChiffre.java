package at.bfi.coders.bay.exercises.unit2._10.cesarChiffre;

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
	
	/* next milestone: handle numbers outside of the range of 0-26 */
	public static String decode(String text, int pwd) {
		int encoder = (zAscii - aAscii) - pwd + 1;
		return encode(text, encoder);
	}
	
	public static void encodeFile(String path, String outfileAppend) {
		
		System.out.println("inside encode file method");
		
	}

}
