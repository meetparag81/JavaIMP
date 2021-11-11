package Singletonconcept;

public class SingletonConcept 
{
	private static SingletonConcept singlton_instance= null;
	public String str;
	
	private SingletonConcept()
	{
		str= "hey i am using singlton pattern";
		
	}
	
	public static SingletonConcept getInstance()// lazy initalization
	{
		if(singlton_instance==null)
		{
			singlton_instance = new SingletonConcept();
		}
		return singlton_instance;
	}

	public static void main(String[] args) 
	{
		SingletonConcept x = SingletonConcept.getInstance();
		SingletonConcept y = SingletonConcept.getInstance();
		SingletonConcept z = SingletonConcept.getInstance();
		
		x.str= (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		y.str = (y.str).toLowerCase();
		System.out.println(z.str);
		System.out.println(y.str);
		System.out.println(x.str);
		

	}

}
