package stringBuffer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FranceLogic {
	
	private static String DOB;
	
	
	
	

	public static void main(String[] args) throws NumberFormatException {
		String number="1234567890";
		String Dateofbirth = "04/01/82";
		StringBuilder sb = new StringBuilder(15);
		String gender = "12";
		for(int i=0;i<1;i++)
		{
			int index = (int) (gender.length() * Math.random());
			sb.append(gender.charAt(index));
		}
		System.out.println("The firtcharacter is" +sb+ "and the length is " + sb.length());
		String[] DateBirth = Dateofbirth.split("/");
		String year = DateBirth[2];
		sb.append(year);
		sb.append(DateBirth[1]);
		System.out.println("The first 5 characters are" +sb+ "and the length is " + sb.length());
			/*if(Integer.parseInt(year)<76);
			{
				sb.append(20);
			}*/
			sb.append(97);
			for(int i=0;i<6;i++)
			{
				int index = (int) (number.length() * Math.random());
				sb.append(number.charAt(index));
			}
			System.out.println("The first 13 characters are" +sb+ "and the length is " + sb.length());
			String s= sb.toString();
			long num = Long.parseLong(s);
		/*
		 * try { int num = Integer.parseInt(s); num1=num; } catch(Exception e) {
		 * 
		 * System.out.println("Numberformatexception seen"); }
		 */
			 long num1 = num;
			int reminder = (int) (num1%97);
			
			int lasttwoNos= 97-reminder;
			if(lasttwoNos==0)
			{
				sb.append(00);
			}
			sb.append(lasttwoNos);
			System.out.println("The Number is" +sb+ "and the length is " + sb.length());
		}
		
		
		
	

	
	public static String generateDOB() {
		return DOB; 

		/*Calendar calendar = Calendar.getInstance(); 

		calendar.add(Calendar.YEAR, getRandomInteger(-50, -20)); 

		Date date = calendar.getTime(); 

		SimpleDateFormat formDate = new SimpleDateFormat("MM,dd,yyyy"); 

		String strDate = formDate.format(date); 

		SimpleDateFormat formDate1 = new SimpleDateFormat("MMM,dd,yyyy"); 

		DOB = formDate1.format(date); 

		 

		return strDate;*/ 
	

}

	private static int getRandomInteger(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}

