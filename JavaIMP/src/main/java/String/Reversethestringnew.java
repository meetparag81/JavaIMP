package String;

public class Reversethestringnew 
{
	public static void main(String[] args)
	{
		String s = "Selenium";
		String s1 = "put";
		String Rev = "";
		String Rev1 = "";
		int len = s.length();
		int len1 = s1.length();
		
		for(int i = len-1;i>=0;i--)// len-1 is used to start string from reverse side.
		{
			Rev = Rev + s.charAt(i);// charAt(i) give character at i location.
			for(int j =len1-1;j>=0;j++ )
			Rev1 = Rev1+s1.charAt(j);
		}
		System.out.println(Rev + Rev1);


		
		
		
		
		
	}
	
}

	