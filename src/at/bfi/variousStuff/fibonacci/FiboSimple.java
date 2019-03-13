package at.bfi.variousStuff.fibonacci;

public class FiboSimple {

	public static void main(String[] args) {
		int vorvorig = 0;
		int vorig = 1;
		System.out.println(vorvorig);
		System.out.println(vorig);
		
		int neueZahl = 0;
		
		int zaehler = 2;
		
//		while (zaehler < 10) {
//			neueZahl = vorvorig + vorig;
//			System.out.println(neueZahl);
//			vorvorig = vorig;
//			vorig = neueZahl;
//			zaehler++;
//		}
		
		for (int i = 2; i < 10; i++) {
			neueZahl = vorvorig + vorig; 
			System.out.println(neueZahl);
			vorvorig = vorig;
			vorig = neueZahl;
		}


	}

}
