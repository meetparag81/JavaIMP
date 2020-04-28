package stringBuffer;

public class Norwaylogic {
	
	public static void main(String[] args) {
		String NumericString = "211245008";
		//String AlphabetString= "AWXTZ";
		//String Numberforfiestdigit="123";
		 StringBuilder sb = new StringBuilder(11);
		 sb.append(NumericString);
		
		  /*for (int i = 0; i <8; i++) { int index = (int) 
				  
		  {
				  (NumericString.length() *  Math.random()); sb.append(NumericString.charAt(index)); 
		  }
		 */
		//sb.append(NumericString);
		 int sum=0; 
		 for(int i=1;i<8;i++)
		 {
			 int k = Integer. parseInt(String. valueOf(sb.charAt(i)));
			 int j = Integer. parseInt(String. valueOf(sb.charAt(i+1)));
			sum = (j*k)+sum;
		 } 
		int rem= sum%11;
		if(rem==0)
		{
			sb.append(0);
		}
		int num = 11-rem;
		int array[] ={8,7,6,5,4,3,2};
		for(int j=0;j<8;j++)
		{
			if(j==num)
			{
				sb.append(array[j]);
			}
		
		}
		for(int k=0;k<9;k++)
		{
			int m = Integer. parseInt(String. valueOf(sb.charAt(k)));
			 int n = Integer. parseInt(String. valueOf(sb.charAt(k+1)));
			sum = (n*m)+sum;
		}
		int rem1= sum%11;
		int num1 = 11-rem;
		int array1[] ={8,7,6,5,4,3,2};
		for(int j=0;j<8;j++)
		{
			if(j==num)
			{
				sb.append(array1[j]);
			}
		
		 System.out.println("The number is" +sb+ "and the length is " + sb.length());
		 
	
	String word= "ABCDEFGHIJKLMNOPQRSTUVW";
	
	
			
		
	
	
	System.out.println("The number is" +sb+ "and the length is " + sb.length());
		
	}
	

}
}
