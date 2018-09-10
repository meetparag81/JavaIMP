package StringComparisiom;

public class StringTest1 {

	public static void main(String[] args) 
	{
	String s ="parag";
	String s1 = "PARAG";
	String s3 = new String("Parag");
	String s4 = "Parag";
	
	System.out.println(s1.equals(s));//false
	System.out.println(s==s1);//false
	System.out.println(s4==s);//false
	System.out.println(s4.equals(s));//false
	System.out.println(s4.equals(s3));//true
	System.out.println(s3.equals(s));//false
	

	}

}
