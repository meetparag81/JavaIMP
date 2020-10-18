package stringBuffer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Spain_SocialInsuranceNumber {
	
	

	

	public static void main(String[] args)throws  IOException,NumberFormatException {
		String NumericString = "012345";
		String NumericString1 = "123456789";
		
		StringBuilder sb = new StringBuilder(14);
		
		sb.append(0);
		  for(int i=0;i<1;i++) { 
			  
			  int index = (int) (NumericString.length() * Math.random());
				sb.append(NumericString.charAt(index));
		 String s = sb.toString(); 
		 int k= Integer. parseInt(String. valueOf(s));
		 if(k>52&&k==0) {
		  sb.replace(0, 1,s ); 
		  }
		 }
		 
		//sb.append("0"+"1");
		//  sb.append("/");
		System.out.println(sb);
		
		
		
		
		 for(int k=0; k<8;k++) { 
			 
			 int index = (int) (NumericString1.length() * Math.random());
				sb.append(NumericString1.charAt(index));
			 
		
		 }
		  System.out.println(sb);
		String num = sb.toString();
			int num1= Integer.valueOf(num);
			//sb.append(sb+"/"+num);
			
			int  rem= (int) (num1)%97;
			if(rem<=9)
			{
						sb.append("0"+rem);
			}
			else
			{
				sb.append(rem);
			}
			System.out.println("The number is" +sb+ "and the length is " + sb.length());
			
		

			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		/*List<Integer> myList = new ArrayList<Integer>();
		for(int i=1;i<2;i++)
		{
			myList.add(i);
			
		}
		System.out.println(myList.size());
		
		 * int k=Integer. parseInt(String. valueOf(sb.charAt(i)));
		 * 
		 * while(num<2) { int j=myList.get( i);
		 * 
		 * if(k==j&&k!=0) { sb.append(j+1); } else { sb.append(k); } num++; }
		 */
		
	}
	
	
	
	
	
	


