package stringBuffer;

public class Portugal_SSN {
	
	public static void main(String[] args) {
		
		String NumericString = "1234567890";
		StringBuilder sb = new StringBuilder(11);
		for (int i = 0; i < 10; i++) {
			int index = (int) (NumericString.length() * Math.random());
			sb.append(NumericString.charAt(index));
		}
		
		System.out.println("First 8 random numbers are ="+ sb);
	int sum= 0;
	int count=2;
	int array[] ={29,23,19,17,13,11,7,5,3,2};
	for(int i=0;i<9;i++)
	{
		
		 int k = Integer. parseInt(String. valueOf(sb.charAt(i)));
		sum=sum+( k* array[i]);
		
		 
	}
	int reminder= sum%10;
	int num = 9-reminder;
	sb.append(num);
	System.out.println("The number is" +sb+ "and the length is " + sb.length());
	}
}


