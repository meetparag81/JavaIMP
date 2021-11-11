package stringBuffer;

public class IrlandLogicForNID {
	//
	public static void main(String[] args) {
		
		String NumericString = "1234567";
		String AlphabetString= "AWXTZ";
		//String Numberforfiestdigit="123";
		 StringBuilder sb = new StringBuilder(9);
		// sb.append(1);
		
		  for (int i = 0; i <7; i++) { int index = (int) (NumericString.length() *  Math.random()); sb.append(NumericString.charAt(index)); 
		  }
		 
		//sb.append(NumericString);
		System.out.println("First 7 random numbers are ="+ sb);
	int sum= 0;
	int count=2;
	int array[] ={8,7,6,5,4,3,2};
	for(int i=0;i<6;i++)
	{
		
		 int k = Integer. parseInt(String. valueOf(sb.charAt(i)));
		sum=sum+( k*array[i]);
		
		 
	}
	sum= sum+9;
	int reminder= sum%23;
	String word= "ABCDEFGHIJKLMNOPQRSTUVW";
	count=0;
	for(int i=0; i<23;i++)
	{
		
		if(reminder==i)
		{
			sb.append(word.charAt(i));
			break;
		}
			
			
		
	}
	for(int i=0;i<1;i++)
	{
		int index = (int) (AlphabetString.length() * Math.random());
		sb.append(AlphabetString.charAt(index));
	
	}
	System.out.println("The number is" +sb+ "and the length is " + sb.length());
		
	}
	
	

}
