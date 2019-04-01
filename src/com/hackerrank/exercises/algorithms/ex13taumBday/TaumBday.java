package com.hackerrank.exercises.algorithms.ex13taumBday;

public class TaumBday {

    static long taumBday(int b, int w, int bc, int wc, int z) {
    	
    	
    	long costBlack = Math.min(bc, wc+z);
    	long costWhite = Math.min(wc, bc + z);
//    	System.out.println(costBlack + "+" + costWhite);
    	
    	return  (costBlack * b + costWhite * w);
    }

	
	public static void main(String[] args) {
		
//		System.out.println(taumBday(1, 1, 2, 3, 2));
//		System.out.println(taumBday(1, 1, 3, 2, 2));
//		System.out.println(taumBday(1, 1, 4, 2, 1));
//		System.out.println(taumBday(1, 1, 2, 4, 1));
//		System.out.println(taumBday(27984, 1402, 619246, 615589, 247954));
		System.out.println(taumBday(95677, 39394, 86983, 311224, 588538));
//		System.out.println(taumBday(68406, 12718, 532909, 315341, 201009));
//		System.out.println(taumBday(15242, 95521, 712721, 628729, 396706));
//		System.out.println(taumBday(21988, 67781, 645748, 353796, 333199));
//		System.out.println(taumBday(22952, 80129, 502975, 175136, 340236));
//		System.out.println(taumBday(38577, 3120, 541637, 657823, 735060));
//		System.out.println(taumBday(5943, 69851, 674453, 392925, 381074));
//		System.out.println(taumBday(62990, 61330, 310144, 312251, 93023));
//		System.out.println(taumBday(11152, 43844, 788543, 223872, 972572));

	}

}
