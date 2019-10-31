package at.bfi.coders.bay.exercises.unit6.tableGenerator;

/**
 * @author  Hannes Alkin
 * @version 
 * @since   31.10.2019

 */
public class TableGenerator {

	/**
	 * Generates a HTML table for web testing purposes.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
//		int i = 100;
//		int j = 10;
//		System.out.println(i);
////		System.out.println(i*2);
//		System.out.println(i|j);
		int lim = 16;
		
		System.out.println("<table class=\"table\">");
		System.out.println("<tr>");
		System.out.println("<th scope=\"col\">#</th>");
		for (int i = 0; i < lim; i++) {
			System.out.println("<th scope=\"col\">" + i + "</th>");
		}
		System.out.println("</tr>");
		for (int i = 0; i < lim; i++) {
			System.out.println("<tr>");
			System.out.println("<th scope=\"row\">" + i + "</td>");
			for (int j = 0; j < lim; j++) {
				System.out.println("<td>" + (i^j) + "</td>");
			}
			System.out.println("</tr>");
		}
		System.out.println("</table>");

	}

}
