package Lamda;

public interface Intra1 
{
	public void add(int a, int b);
	
	

}

class Check
{
	public static void main(String args[])
	{
		Intra1 i = (a,b)->System.out.println("The sum is:"+ (a+b));
		i.add(10, 20);
		i.add(100, 200);
	}
}
