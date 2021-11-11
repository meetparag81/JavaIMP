package StringComparisiom;

public class StringTest 
{

	public static void main(String[] args) 
	{
		String a = "parag";
				String b = "parag";
		if(a==b)
		{
		System.out.println("true");
		}
		 if(a.equals(b))
		{
		System.out.println("true");	
		}
		 String d = new String("parag");
		 String e = new String("parag");
		 if(d==e)// creating String object the hashcode is diffrent of two string hence this condition will  be false
		 {
			 System.out.println("true");
		 }
		 else if(d.equals(e))
		 {
			 System.out.println("true");
		 }

	}

}
