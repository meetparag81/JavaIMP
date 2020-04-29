package stringBuffer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ItalyLogic {
	
	private static Map alphabets;
	private static String lphaStringPattern2;
	private static String lastName="John";
	private static String firstName="Peter";
	private static String DOB1="04-Dec-1989";
	private static String DOB;

	public static void main(String[] args) {
		 StringBuilder sb = new StringBuilder();
		 String NumericString = "0123456789";
		  lphaStringPattern2 = "ABCDEFGHIJKMNOPQTUVWXZ";
		
		sb = new StringBuilder(16);
		String LastNameWOvowel = lastName. replaceAll("[AaEeIiOoUu]", "");
		
		String FirstNameWOvowel = firstName. replaceAll("[AaEeIiOoUu]", "");
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
		 if((firstName.length()<=2))
		 {
			 sb.append(firstName); 
			 
		 }
		 else
		 {
			 firstName = FirstNameWOvowel.substring(0, 3);
		 }
		 generateDOB();
		 sb.append(firstName);
		 String[] Dateofbirth = DOB1.split("-");
			String Month = Dateofbirth[1];
			String day = Dateofbirth[0];
			String year = Dateofbirth[2];
			int birthyr= Integer.parseInt(year);
			String yr = year.substring(2, 4);
			sb.append(yr);
			System.out.println("characters are" + sb + " and no of characters" + sb.length());
		/*
		 * String DateofBirth = generateDOB(); String[] Dateofbirthnew = DateofBirth.split(" "); String Month = Dateofbirthnew[0];
		 */
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
			
			String words = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		       ArrayList<Character> CharList = new ArrayList<Character>();

		       for(int i = 0; i<words.length(); i++){
		    	   CharList.add(words.charAt(i));
		         }
		       int[] arr = new int[] {1,0,2,5,4,5,7,9,8,13,15,17,19,21,2,4,18,20,11,3,6,8,12,14,18,25,26};

		       ArrayList<Character> Nuberlist = new ArrayList<Character>();

		       for(int i = 0; i<arr.length; i++){
		    	   
		    	   
		         }
		       
  
		       for(int j=0;j<26;j++)
		       {
		        alphabets = new HashMap<String, Integer>();
				alphabets.put(CharList.get(j), j);
				
				System.out.println("The  character and numbers are"+ CharList.get(j)+","+ j );
		       }
		       
		       int sum = 0;
		       
		       
		       ArrayList<Character> CharList1 = new ArrayList<Character>();
		       System.out.println();
		 for(int k=0;k<15;k++) { 
			 String NID= sb.toString(); 
			 char s = NID.charAt(k);
		  alphabets.get(k);
		 }
		 
	
		
		
	}
	public static String generateDOB() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, getRandomInteger(-50, -20));
		Date date = calendar.getTime();
		SimpleDateFormat formDate = new SimpleDateFormat("MMM dd, yyyy");
		String strDate = formDate.format(date);
		SimpleDateFormat formDate1 = new SimpleDateFormat("MM,dd,yyyy");//startParag
		DOB = formDate1.format(date);//End

		return strDate;

	}
	
	public static int getRandomInteger(int maximum, int minimum) {
		return ((int) (Math.random() * (maximum - minimum))) + minimum;
	}

}
