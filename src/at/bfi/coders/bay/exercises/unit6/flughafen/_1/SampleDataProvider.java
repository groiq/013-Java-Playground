/**
 * 
 */
package at.bfi.coders.bay.exercises.unit6.flughafen._1;

import java.util.Arrays;

/**
 * @author  Hannes Alkin
 * @version 
 * @since   28.10.2019

 */
public class SampleDataProvider {
	
	
	private static String[][] parseData(String rawData) {
		String[] arrayString = rawData.split("\r\n");
//		System.out.println(arrayString.length);
//		System.out.println(arrayString[19]);
		String[][] arrayArrayString = new String[arrayString.length][];
		for (int i = 0; i < arrayArrayString.length; i++) {
			arrayArrayString[i] = arrayString[i].split(",");
		}
		return arrayArrayString;
	}
	
	static String[][] getEmployeeData() {
		// 20 entries
		String employeeSampleDataRaw = "Wildon,Fridaye,7 Corben Way,8693,503-273-1135,wfridaye0@lulu.com\r\n" + 
				"Ame,Dalgarnocht,02111 Nelson Junction,3698,752-888-9921,adalgarnocht1@dailymail.co.uk\r\n" + 
				"Neila,Bodemeaid,0588 Granby Plaza,9616,317-855-0626,nbodemeaid2@cpanel.net\r\n" + 
				"Cory,Mossop,617 Union Park,2005,488-158-7233,cmossop3@github.com\r\n" + 
				"Adeline,Smeall,1 Hanson Point,5625,946-983-5120,asmeall4@pcworld.com\r\n" + 
				"Wanda,Beet,94 Cardinal Terrace,1896,330-357-4547,wbeet5@reverbnation.com\r\n" + 
				"Mariam,Collecott,750 Northview Street,3236,824-351-6929,mcollecott6@loc.gov\r\n" + 
				"Tristam,Sancias,171 Artisan Junction,2520,375-428-1049,tsancias7@wordpress.com\r\n" + 
				"Gualterio,Croshaw,4771 Lindbergh Plaza,7961,683-459-7331,gcroshaw8@technorati.com\r\n" + 
				"Deni,Revening,03236 Stoughton Lane,9260,565-672-6601,drevening9@163.com\r\n" + 
				"Maxy,Fuller,174 Continental Trail,9318,992-698-9129,mfullera@simplemachines.org\r\n" + 
				"Brenn,Colquhoun,39 Elmside Lane,9318,265-983-2751,bcolquhounb@nydailynews.com\r\n" + 
				"Petunia,Brockherst,2323 Beilfuss Lane,6838,426-105-1059,pbrockherstc@nasa.gov\r\n" + 
				"Cassey,Croxton,75902 Surrey Place,8106,756-218-0624,ccroxtond@walmart.com\r\n" + 
				"Alvis,Allonby,0 Green Ridge Terrace,2092,825-128-9972,aallonbye@deliciousdays.com\r\n" + 
				"Joye,Jarley,6 Pierstorff Alley,6259,310-626-3270,jjarleyf@cdbaby.com\r\n" + 
				"Isabelita,Juggins,780 Superior Parkway,8201,724-637-2819,ijugginsg@discuz.net\r\n" + 
				"Pren,Carreck,1 Oneill Alley,3101,278-135-0501,pcarreckh@over-blog.com\r\n" + 
				"Dunn,Palek,76247 Lillian Point,7584,883-468-5824,dpaleki@geocities.com\r\n" + 
				"Caitlin,Milesap,05 Quincy Pass,3226,829-727-9836,cmilesapj@squarespace.com\r\n";
		return parseData(employeeSampleDataRaw);
	}
	
	static String[][] getFlightData() {
		// 20 entries
		String flightDataRaw = "9,14,239,14,25,0,19\r\n" + 
				"19,11,56,13,6,19,3\r\n" + 
				"14,47,717,31,2,2,17\r\n" + 
				"19,47,346,29,14,17,7\r\n" + 
				"19,46,466,22,15,8,12\r\n" + 
				"1,57,685,15,20,3,19\r\n" + 
				"11,13,352,5,22,7,7\r\n" + 
				"19,1,591,26,35,16,15\r\n" + 
				"1,41,20,36,10,17,4\r\n" + 
				"14,53,336,19,36,14,12\r\n" + 
				"22,46,571,24,4,2,13\r\n" + 
				"17,47,92,27,10,17,19\r\n" + 
				"17,5,69,29,10,6,3\r\n" + 
				"6,23,238,17,32,19,18\r\n" + 
				"3,19,617,7,34,13,8\r\n" + 
				"16,19,295,12,15,12,17\r\n" + 
				"13,40,605,3,28,5,9\r\n" + 
				"3,6,660,4,34,6,18\r\n" + 
				"21,26,471,31,17,14,19\r\n" + 
				"21,58,149,24,16,12,17";
		return parseData(flightDataRaw);
	}


}
