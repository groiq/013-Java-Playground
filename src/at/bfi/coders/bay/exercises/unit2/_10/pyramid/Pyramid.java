package at.bfi.coders.bay.exercises.unit2._10.pyramid;

public class Pyramid {
	
	static String blank;
	static String sign;

	public static void main(String[] args) {
		
		blank = "_";
		blank = " ";
		sign = "X";
		
//		buildPyramid(4);
		
		for (int i = 1; i < 8; i++) {
			buildPyramid(i);
//			System.out.println("--------");
			System.out.println();
			System.out.println();
		}
		
//		buildPyramid(8);

	}

//	private static void buildPyramid(int lineCount) {
//		for (int i = 0; i < lineCount; i++) {
//			int curLine = i + 1;
//			for (int j = -lineCount; j < lineCount + 1; j++) {
////				System.out.print(j);
//				if (Math.abs(j) <= curLine && j % 2 == 0) {
//					System.out.print("X");
//				} else {
//					System.out.print("_");
//				}
//			}
//			System.out.println();
//		}
//	}
	
	private static void buildPyramid(int lineCount) {
//		int totalLen = (lineCount - 1) * 4 + 1;
//		System.out.println(lineCount*4-3);
		int totalLen = (lineCount*4)-3;
//		System.out.println(totalLen);
		for (int curLineNum = 1; curLineNum <= lineCount; curLineNum++) {
			int curLineLen = curLineNum * 4 - 3;
			int padding = (totalLen - curLineLen) / 2;
			System.out.print(padLine(padding));
			for (int i = 0; i < curLineLen; i++) {
//				System.out.print(sign);
				if (i % 2 == 0) {
					System.out.print(sign);
				} else {
					System.out.print(blank);
				}
			}
			System.out.print(padLine(padding));
			System.out.println();
		}
	}
	
	private static String padLine(int padding) {
		String result = "";
		for (int i = 0; i < padding; i++) {
			result += blank;
		}
		return result;
	}

}
