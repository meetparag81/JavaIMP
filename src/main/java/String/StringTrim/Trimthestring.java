package String.StringTrim;

import org.openqa.selenium.WebElement;

public class Trimthestring {
	
	
	public static void main(String args[]) 
    { 
        
      // trims the trailing and leading spaces  
    String s = " geeks for geeks has all java functions to read  ";  
    System.out.println(s.trim());   
      
    // trims the leading spaces  
    s = " Chetna loves reading books";  
    System.out.println(s.trim());  
    
    System.out.println("This is the Test Case number minus one");
    String s1 = "This is the Test Case number minus one(Test)";
    if (s1.split("\\(")[0].trim().length() >= 27) 
    {
		
		String a = s1.split("\\(")[0].trim();
		String b = a.substring(0, 27).trim();
		System.out.println(b);
		
	}
    else
    {
    	String a2 =	s1.split("\\(")[0].trim();
    }
    	
    	
     String s2 = "Test1to test string (Test)";
     int a = s2.split("\\(")[0].trim().length();
     if (s2.split("\\(")[0].trim().length() >= 27) 
     {
 		
 		String a1 = s2.split("\\(")[0].trim();
 		String b = a1.substring(0, 27).trim();
 		System.out.println(b);
 		
 	}
     else
     {
     	String c =	s2.split("\\(")[0].trim();
     	System.out.println(c);
     }
}
}
