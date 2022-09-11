package stringBuffer;

import java.util.ArrayList;
import java.util.List;

public class CanadaNID {

	public static void main(String[] args) {

		String NumericString = "12345679";
		//String NumericString = "924476414";

		StringBuilder sb = null;




		boolean flag=false;
		while(!flag)
		{
			sb = new StringBuilder(9); 
			int Multiplier[] = {1,2,1,2,1,2,1,2,1};
			int EacDigit=0;
			int result=0;
			List<Integer>Alldigits = new ArrayList<Integer>();

			int i= 0;

			for (int j = 0; j < 9; j++) { 
				int index = (int)(NumericString.length()*Math.random()); 
				sb.append(NumericString.charAt(index));


			}



			for(i=0;i<=8;i++) {
				int FirstDigit=Integer. parseInt(String. valueOf(sb.charAt(i)));
				int Muliplierdigit=Multiplier[i];
				EacDigit= (FirstDigit*Multiplier[i]);
				// how to add eachdigit in final digit, if digit is greater than 9 
				if(EacDigit>9)
				{
					String MultipliiedDigt= Integer.toString(EacDigit); 
					int Resultfirstresult =Integer. valueOf(MultipliiedDigt.substring(0,1));
					int Resulrseconddigit=Integer. valueOf(MultipliiedDigt.substring(1,2));;
					int Sumofresults =  (Resultfirstresult+Resulrseconddigit);
					Alldigits.add(Sumofresults);


				}
				else
				{
					Alldigits.add(EacDigit);

				}

				result=result+Alldigits.get(i);


			}
			if(result%10==0)
			{
				break;
			}


			//Append each character in a string. 

		}
		System.out.println("Final digit are  "+sb.toString());
	}
}

