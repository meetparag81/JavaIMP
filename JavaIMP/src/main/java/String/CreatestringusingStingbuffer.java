package String;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CreatestringusingStingbuffer {
	private static String Firstname="John" ;
	private static String lphaStringPattern2="";
	private static String NumericString="";
	private static String lastName="Peter";	
	private static String DOB;
	private static StringBuilder sb;
	

	public static void main(String[] args) {
		 sb = new StringBuilder();
		 NumericString = "0123456789";
		 lphaStringPattern2 = "ABCDEFGHIJKMNOPQTUVWXZ";
		
		sb = new StringBuilder(16);
		String LastNameWOvowel = lastName. replaceAll("[AaEeIiOoUu]", "");
		
		String FirstNameWOvowel = Firstname. replaceAll("[AaEeIiOoUu]", "");
		//last name  three consonants 
		if((lastName.length()<=2))
		 {
			 sb.append(lastName); 
		 }
		 else
		 {
			 lastName = LastNameWOvowel.substring(0, 3);
		 }
		sb.append(lastName);
		 //first name  three consonants 
		 if((Firstname.length()<=2))
		 {
			 sb.append(Firstname); 
			 
		 }
		 else
		 {
			 Firstname = FirstNameWOvowel.substring(0, 3);
		 }
		 generateDOB();
		 sb.append(Firstname);
		 String[] Dateofbirth = DOB.split(",");
			String month = Dateofbirth[0];
			String day = Dateofbirth[1];
			String year = Dateofbirth[2];
			int birthyr= Integer.parseInt(year);
			String yr = year.substring(2, 4);
			sb.append(yr);
			System.out.println("characters are" + sb + " and no of characters" + sb.length());
			String DateofBirth = generateDOB();
			String[] Dateofbirthnew = DateofBirth.split(" ");
			String Month = Dateofbirthnew[0];
			if(Month.contentEquals("Jan"))
			{
				sb.append("A");
			}
			else if (Month.contentEquals("Feb")) {
				sb.append("B");
				
			}
			else if (Month.contentEquals("Mar")) {
				sb.append("C");
				
			}
			else if (Month.contentEquals("Apr")) {
				sb.append("D");
				
			}
			else if (Month.contentEquals("May")) {
				sb.append("E");
				
			}
			else if (Month.contentEquals("Jun")) {
				sb.append("H");
				
			}
			else if (Month.contentEquals("Jul")) {
				sb.append("L");
				
			}
			else if (Month.contentEquals("Aug")) {
				sb.append("M");
				
			}
			else if (Month.contentEquals("Sep")) {
				sb.append("P");
				
			}
			else if (Month.contentEquals("Oct")) {
				sb.append("R");
				
			}
			else if (Month.contentEquals("Nov")) {
				sb.append("S");
				
			}
			else if (Month.contentEquals("Dec")) {
				sb.append("T");
				
			}
			sb.append(day);
			System.out.println("characters are" + sb + " and no of characters" + sb.length());
			for (int i = 0; i <4 ; i++) {
				int index = (int) (NumericString.length() * Math.random());
				sb.append(NumericString.charAt(index));
			}
			System.out.println("characters are" + sb + " and no of characters" + sb.length());
			
			
		
		
		
	}
	
	
	public static String generateDOB() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, getRandomInteger(-50, -20));
		Date date = calendar.getTime();
		SimpleDateFormat formDate = new SimpleDateFormat("MMM dd, yyyy");
		String strDate = formDate.format(date);
		SimpleDateFormat formDate1 = new SimpleDateFormat("MM,dd,yyyy");
		DOB = formDate1.format(date);

		return strDate;

	}
	
	public static int getRandomInteger(int maximum, int minimum){
		return ((int) (Math.random() * (maximum - minimum))) + minimum;
}
}
