package SimpleProgrammes;

public class Prime1 
{

	public static void main(String[] args) 
	{
		int num = 10;
		for (int i = 1; i <= num; i++) 
		{
			boolean flag = true;
			for (int m = 2; m <= num / 2; ++m) 
			{
				// condition for nonprime number
				if (i % m == 0) 
				{
					flag = false;
					break;
				}
			}

			if (flag==true) 
			{
				System.out.println(i + " is  a prime number.");
			}

			else 
			{
				System.out.println(i + " is not a prime number.");
			}
		}
	}
}
