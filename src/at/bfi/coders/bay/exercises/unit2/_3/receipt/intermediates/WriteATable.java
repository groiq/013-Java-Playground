package at.bfi.coders.bay.exercises.unit2._3.receipt.intermediates;

public class WriteATable {

	public static void main(String[] args) {
		
		int limit = 10;
		
		for(int i = 0; i < limit; i++) {
			for(int j = 0; j < limit; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}

	}

}
