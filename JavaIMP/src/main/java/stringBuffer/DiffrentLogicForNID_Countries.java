package stringBuffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DiffrentLogicForNID_Countries {

	private static String lphaStringPattern2;
	private static StringBuilder sb;
	private static String  selectedCountry;
	private static String  type;
	private static String firstName;
	private static String  lastName;
	private static String DOB;
	static Map alphabets;

	public static void main(String[] args) {
		
		// Startparag
		
				 if((type.equalsIgnoreCase("CURP") && selectedCountry.equals("Mexico"))) {
					
					String NumericString = "0123456789";
					lphaStringPattern2 = "ABCDEFGHIJKMNOPQTUVWXZ";
					sb = new StringBuilder(18);
					for (int i = 0; i < 4; i++) {
						int index = (int) (lphaStringPattern2.length() * Math.random());
						sb.append(lphaStringPattern2.charAt(index));
					}
					String[] Dateofbirth = DOB.split(",");
					String month = Dateofbirth[0];
					String day = Dateofbirth[1];
					String year = Dateofbirth[2];
					int birthyr= Integer.parseInt(year);
					String yr = year.substring(0, 2);
					sb.append(yr);
					sb.append(month);
					sb.append(day);
					//System.out.println("characters are" + sb + " and no of characters" + sb.length());
					String gender = "HF";
					for (int i = 0; i < 1; i++) {
						int index = (int) (gender.length() * Math.random());
						sb.append(gender.charAt(index));
					}
					//System.out.println("characters are" + sb + " and no of characters" + sb.length());
					sb.append("NE");
					//System.out.println("characters are" + sb + " and no of characters" + sb.length());
					for (int i = 0; i < 3; i++) {
						int index = (int) (lphaStringPattern2.length() * Math.random());
						sb.append(lphaStringPattern2.charAt(index));
					}
					//System.out.println("characters are" + sb + " and no of characters" + sb.length());
					if (birthyr<2000) {
						for (int i = 0; i < 1; i++) {
							int index = (int) (NumericString.length() * Math.random());
							sb.append(NumericString.charAt(index));
						}

					} else {
						for (int i = 0; i < 1; i++) {
							int index = (int) (lphaStringPattern2.length() * Math.random());
							sb.append(lphaStringPattern2.charAt(index));

						}

					}
					//System.out.println("characters are" + sb + " and no of characters" + sb.length());
					for (int i = 0; i < 1; i++) {
						int index = (int) (NumericString.length() * Math.random());
						sb.append(NumericString.charAt(index));
					}
					System.out.println("characters are" + sb + " and no of characters" + sb.length());
					
					
				}
				else if ((type.equals("FC- Fiscal Code") && selectedCountry.equals("Italy"))) {
					  sb = new StringBuilder();
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
						
						String words = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
					       ArrayList<Character> CharList = new ArrayList<Character>();

					       for(int i = 0; i<words.length(); i++){
					    	   CharList.add(words.charAt(i));
					         }
					       int[] arr = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};

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
					/*
					 * for(int k=0;k<26;k++) { String NID= sb.toString(); char s = NID.charAt(k);
					 * alphabets.get(k);
					 * 
					 * 
					 * }
					 */
					
				
				}
				else if ((type.equals("Documento Nacional de Identidad") && selectedCountry.equals("Spain"))) {
					String NumericString = "0123456789";
					 sb = new StringBuilder(9);
					for (int i = 0; i < 8; i++) {
						int index = (int) (NumericString.length() * Math.random());
						sb.append(NumericString.charAt(index));
					}
					int checkvalue = (int) (Double.valueOf(sb.toString()) % 23);
					String k = String.valueOf(checkvalue);
					
					String words = new String("TRWAGMYFPDXBNJZSQVHLCKE");
					int count=1;
					for(int i=0;i<words.length();i++)
					{
						
						if (i == checkvalue) {
							sb.append(words.charAt(i));
							break;
							
						}
					}
					System.out.println("characters are" + sb + " and no of characters" + sb.length());
				
				}//EndParag
				else if ((type.equals("Alien Identification Number") && selectedCountry.equals("Spain"))) {
					
				}
				else if ((type.equals("Social Insurance Number") && selectedCountry.equals("Spain"))) {
					
				}//EndParag
				else if ((type.equals("FN - Fiscal Number") && selectedCountry.equals("Portugal"))) {
					String NumericString = "0123456789";
					 sb = new StringBuilder(9);
					for (int i = 0; i < 8; i++) {
						int index = (int) (NumericString.length() * Math.random());
						sb.append(NumericString.charAt(index));
					}
					System.out.println("First 8 random numbers are ="+ sb);
				int sum= 0;
				int count=2;
				for(int i=7;i>0;i--)
				{
					
					 int k = Integer. parseInt(String. valueOf(sb.charAt(i)));
					sum=sum+( k* count);
					count++;
					
					
					
				}
				sum=sum+9;
				int divisor=11;
				int remainder = sum % divisor;
				if(remainder==0) {
					sb.append(0);
				}
				else
				{
					 int div = divisor-remainder;
					 sb.append(div);
				}
				
				}
				else if ((type.equals("SSN - Social Security Number") && selectedCountry.equals("Portugal"))) {
					String NumericString = "1234567890";
					 sb = new StringBuilder(11);
					for (int i = 0; i < 10; i++) {
						int index = (int) (NumericString.length() * Math.random());
						sb.append(NumericString.charAt(index));
					}
					
					System.out.println("First 8 random numbers are ="+ sb);
				int sum= 0;
				int count=2;
				int array[] ={29,23,19,17,13,11,7,5,3,2};
				for(int i=0;i<9;i++)
				{
					
					 int k = Integer. parseInt(String. valueOf(sb.charAt(i)));
					sum=sum+( k* array[i]);
					
					 
				}
				int reminder= sum%10;
				int num = 9-reminder;
				sb.append(num);
				System.out.println("The number is" +sb+ "and the length is " + sb.length());
					
				
				}
				else if(type.equals("FN - Fiscal Number") && selectedCountry.equals("Portugal"))
				{
					String NumericString = "1234567890";
					 sb = new StringBuilder(11);
					for (int i = 0; i < 10; i++) {
						int index = (int) (NumericString.length() * Math.random());
						sb.append(NumericString.charAt(index));
					}
					
					System.out.println("First 8 random numbers are ="+ sb);
				int sum= 0;
				int count=2;
				int array[] ={29,23,19,17,13,11,7,5,3,2};
				for(int i=0;i<9;i++)
				{
					
					 int k = Integer. parseInt(String. valueOf(sb.charAt(i)));
					sum=sum+( k* array[i]);
					
					 
				}
				int reminder= sum%10;
				int num = 9-reminder;
				sb.append(num);
				System.out.println("The number is" +sb+ "and the length is " + sb.length());
					
				}


				
				

				
			}

	

			public static String MexicoNationalid() {
				StringBuilder sb = new StringBuilder();
				String NumericString = "0123456789";
				lphaStringPattern2 = "ABCDEFGHIJKMNOPQTUVWXZ";
				sb = new StringBuilder(18);
				for (int i = 0; i < 4; i++) {
					int index = (int) (lphaStringPattern2.length() * Math.random());
					sb.append(lphaStringPattern2.charAt(index));
				}
				String[] Dateofbirth = DOB.split(",");
				String month = Dateofbirth[0];
				String day = Dateofbirth[1];
				String year = Dateofbirth[2];
				int birthyr= Integer.parseInt(year);
				String yr = year.substring(2, 4);
				sb.append(yr);
				sb.append(month);
				sb.append(day);
				//System.out.println("characters are" + sb + " and no of characters" + sb.length());
				String gender = "HM";
				for (int i = 0; i < 1; i++) {
					int index = (int) (gender.length() * Math.random());
					sb.append(gender.charAt(index));
				}
				//System.out.println("characters are" + sb + " and no of characters" + sb.length());
				sb.append("NE");
				System.out.println("characters are" + sb + " and no of characters" + sb.length());
				for (int i = 0; i < 3; i++) {
					int index = (int) (lphaStringPattern2.length() * Math.random());
					sb.append(lphaStringPattern2.charAt(index));
				}
				System.out.println("characters are" + sb + " and no of characters" + sb.length());
				if (birthyr<2000) {
					for (int i = 0; i < 1; i++) {
						int index = (int) (NumericString.length() * Math.random());
						sb.append(NumericString.charAt(index));
					}

				} else {
					for (int i = 0; i < 1; i++) {
						int index = (int) (lphaStringPattern2.length() * Math.random());
						sb.append(lphaStringPattern2.charAt(index));

					}

				}
				System.out.println("characters are" + sb + " and no of characters" + sb.length());
				for (int i = 0; i < 1; i++) {
					int index = (int) (NumericString.length() * Math.random());
					sb.append(NumericString.charAt(index));
				}
				System.out.println("characters are" + sb + " and no of characters" + sb.length());
						
				return sb.toString();
			}
			
			public static String PortugalNationalid() {
				String NumericString = "0123456789";
				StringBuilder sb = new StringBuilder(9);
				for (int i = 0; i < 8; i++) {
					int index = (int) (NumericString.length() * Math.random());
					sb.append(NumericString.charAt(index));
				}
				System.out.println("First 8 random numbers are ="+ sb);
			int sum= 0;
			int count=2;
			for(int i=7;i>0;i--)
			{
				
				 int k = Integer. parseInt(String. valueOf(sb.charAt(i)));
				sum=sum+( k* count);
				count++;
				
				
				
			}
			sum=sum+9;
			int divisor=11;
			int remainder = sum % divisor;
			if(remainder==0) {
				sb.append(0);
			}
			else
			{
				 int div = divisor-remainder;
				 sb.append(div);
			}
			return sb.toString();
			}
			//EndParag
			
			
			public static String ItalyNationalid()
			{
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
					
					String words = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
				       ArrayList<Character> CharList = new ArrayList<Character>();

				       for(int i = 0; i<words.length(); i++){
				    	   CharList.add(words.charAt(i));
				         }
				       int[] arr = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};

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
				
				 for(int k=0;k<26;k++) { String NID= sb.toString(); char s = NID.charAt(k);
				 alphabets.get(k);
				 
				 
				  }
				 
			return sb.toString();
			}



			private static String generateDOB() {
				return DOB;
				
				
			}
			
		

	}


