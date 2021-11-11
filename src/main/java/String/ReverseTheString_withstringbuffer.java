package String;

import java.util.Scanner;

public class ReverseTheString_withstringbuffer
{

	public static void main(String[] args)
		{
		String Orignal;
		String rev = "";		
		String orignal = "Null is not valid input";	
		if (orignal == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder out = new StringBuilder();

		char[] chars = orignal.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--){
			out.append(chars[i]);

		}
		System.out.println(out);
				
			
		}
	

}
