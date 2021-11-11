package String;

public class Reversethestring {

	public static void main(String[] args) {
		//reverse string
		
		String s = "selenium";
		int m = s.length();
		String rev="";
		for(int i=m-1;i>=0;i--)
		{
		rev= rev+s.charAt(i);
		}
		System.out.println(rev);
		//String buffer class
		String s1 = "selenium123";
		StringBuffer sf = new StringBuffer(s1);
		System.out.println(sf.reverse());
		}
		

	
		

	}


