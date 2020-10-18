package stringBuffer;

public class ChecksumNo {
	
	public static void main(String[] args) {
		
		String NumericString = "0123456789";
		StringBuilder sb = new StringBuilder(9);
		for (int i = 0; i < 8; i++) {
			int index = (int) (NumericString.length() * Math.random());
			sb.append(NumericString.charAt(index));
		}
		System.out.println("First 8 random numbers are ="+ sb);
	int sum= 0;
	int count=2;
	for(int i=7;i>0;i--)
	{
		
		 int k = Integer. parseInt(String. valueOf(sb.charAt(i)));
		sum=sum+( k* count);
		count++;
		
		
		
	}
	sum=sum+9;
	int divisor=11;
	int remainder = sum % divisor;
	if(remainder==0) {
		sb.append(0);
	}
	else
	{
		 int div = divisor-remainder;
		 sb.append(div);
	}
	sb.toString();
	

}
	
}
