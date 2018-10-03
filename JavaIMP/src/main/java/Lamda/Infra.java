package Lamda;
@FunctionalInterface
public interface Infra 
{
	public int add(int n);
	

}
class Demo implements  Infra
{

	@Override
	public int add(int n) 
	{
		
		return n*n;
	}
	
}



class Test234
{
	 public static void main(String args[])
		{
			Infra i = n->n*n;// here the n is a parameter used in lamda exoression and then return value added after"->"
			Infra i1 = (n)->n*n;// valid
			Infra i2 = n->n*n;// valid
			//Infra i3 = n->{n*n;};// invalid return kyeword is missing
			//Infra i3 = n->{return n*n;};// invalid
			//Infra i3 = n->{return n*n};// invalid, semicolon missing inside bracket
			//Infra i3 = n->{return n*n;}// invalid, semicolon missing outside bracket
			
			
			
		}
}
	

