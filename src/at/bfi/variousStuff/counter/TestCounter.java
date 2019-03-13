package at.bfi.variousStuff.counter;

import at.bfi.variousStuff.counter.Counter;

public class TestCounter {

	public static void main(String[] args) {
		
		int min = 0;
		int max = 3;
		
		System.out.println("max");
		Counter.count(max);
		
		System.out.println("min,max");
		Counter.count(min,max);
		
		System.out.println("max,min");
		Counter.count(max,min);
		
		System.out.println("min,max,-1");
		Counter.count(min,max,-1);
		
		System.out.println("max,min,-1");
		Counter.count(max,min,-1);
				
		System.out.println("min,max,2");
		Counter.count(min,max,2);
		
		System.out.println("min,max,-2");
		Counter.count(min,max,-2);
		
//		System.out.println("2,2");
//		Counter.count(2,2);
//		
//		System.out.println("2,2,-1");
//		Counter.count(2,2,-1);
//		
//		System.out.println("2,2,2");
//		Counter.count(2,2,2);
//		
//		System.out.println("2,2,-2");
//		Counter.count(2,2,-2);

	}

}
