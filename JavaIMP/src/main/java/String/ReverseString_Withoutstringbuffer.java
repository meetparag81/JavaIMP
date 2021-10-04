package String;

public class ReverseString_Withoutstringbuffer {

	public static void main(String[] args) 
	{
		
		String input = "Selenium";

		// convert String to character array
		// by using toCharArray
		char[] characterinstring = input.toCharArray();

		for (int i = characterinstring.length-1; i>=0; i--)
		{
			
			System.out.print(characterinstring[i]);
			
			
		}
		

	}

}
