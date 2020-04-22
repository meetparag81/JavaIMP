package BufferExamples;




import java.io.File; 

import java.io.FileInputStream; 

import java.io.FileNotFoundException; 

import java.io.FileOutputStream; 

import java.io.IOException; 

import java.io.InputStream; 

import java.text.ParseException; 

import java.text.SimpleDateFormat; 

import java.util.ArrayList; 

import java.util.Calendar; 

import java.util.Date; 

import java.util.List; 

import java.util.Properties; 

import java.util.Random; 

 

import org.apache.commons.io.Charsets; 

import org.apache.log4j.Logger; 

import org.apache.poi.EncryptedDocumentException; 

import org.apache.poi.openxml4j.exceptions.InvalidFormatException; 

import org.apache.poi.ss.usermodel.Cell; 

import org.apache.poi.ss.usermodel.Row; 

import org.apache.poi.ss.usermodel.Sheet; 

import org.apache.poi.ss.usermodel.Workbook; 

import org.apache.poi.ss.usermodel.WorkbookFactory; 

import org.apache.poi.xssf.usermodel.XSSFCell; 

import org.apache.poi.xssf.usermodel.XSSFSheet; 

import org.apache.poi.xssf.usermodel.XSSFWorkbook; 

import org.openqa.selenium.By; 

import org.openqa.selenium.JavascriptExecutor; 

import org.openqa.selenium.Keys; 

import org.openqa.selenium.WebDriver; 

import org.openqa.selenium.WebElement; 

import com.google.common.io.Files; 


public class Nationalid {
	
	
	
	private static String lphaStringPattern2;
	private static String DOB;
	
	public static void main(String[] args) {
		
		MaxicoNationalid();
	}

	public static StringBuilder MaxicoNationalid() { 

		StringBuilder sb = new StringBuilder(); 

		String NumericString = "0123456789"; 

		lphaStringPattern2 = "ABCDEFGHIJKMNOPQTUVWXZ"; 

		sb = new StringBuilder(18); 

		for (int i = 0; i < 4; i++) { 

		int index = (int) (lphaStringPattern2.length() * Math.random()); 

		sb.append(lphaStringPattern2.charAt(index)); 

		} 

		String[] Dateofbirth = generateDOB().split(","); 

		String month = Dateofbirth[0]; 

		String day = Dateofbirth[1]; 

		String year = Dateofbirth[2]; 
		int birthyr= Integer.parseInt(year);

		String yr = year.substring(0, 2); 

		sb.append(yr); 

		sb.append(month); 

		sb.append(day); 

		System.out.println("characters are " + sb + " and no of characters" + sb.length()); 

		String gender = "HF"; 

		for (int i = 0; i < 1; i++) { 

		int index = (int) (gender.length() * Math.random()); 

		sb.append(gender.charAt(index)); 

		} 

		System.out.println("characters are" + sb + " and no of characters" + sb.length()); 

		sb.append("NE"); 

		System.out.println("characters are " + sb + " and no of characters" + sb.length()); 

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

		System.out.println("characters are " + sb + " and no of characters" + sb.length()); 

		 

		 

		for (int j = 0; j<1; j++) { 

			int index = (int) (lphaStringPattern2.length() * Math.random()); 

			sb.append(lphaStringPattern2.charAt(index)); 
	
		} 

		System.out.println("characters are" + sb + " and no of characters" + sb.length());
		return sb;

		} 

		 

		 

	



	// Method to generate DOB 

	public static String generateDOB() { 

	Calendar calendar = Calendar.getInstance(); 

	calendar.add(Calendar.YEAR, getRandomInteger(-50, -20)); 

	Date date = calendar.getTime(); 

	SimpleDateFormat formDate = new SimpleDateFormat("MM,dd,yyyy"); 

	String strDate = formDate.format(date); 

	SimpleDateFormat formDate1 = new SimpleDateFormat("MMM,dd,yyyy"); 

	DOB = formDate1.format(date); 

	 

	return strDate; 
}

	private static int getRandomInteger(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}
