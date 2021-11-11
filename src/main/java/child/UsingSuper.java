package child;

class Parent1
{
    String name;
    public void details()
    {
      name = "Parent";
        System.out.println(name);
    }
}
public class UsingSuper extends Parent1
{
	String name;
    public void details()
    {
        super.details();	//calling Parent class details() method
        name = "Child";
        System.out.println(name);
    }
    public static void main(String[] args)
    {
    	UsingSuper cobj = new UsingSuper();
        cobj.details();
    }
	
}
	
	
	    


