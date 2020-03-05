package SeleniumImportant;

import org.testng.annotations.Test;

public class TestNGPriority 
{
	@Test(priority = -1)
	 
	  public void MinusOne() 
	{
	 
	      
	      
	 
	  }
	 
	  @Test(priority = 0)
	 
	  public void Zero() {
	 
		  System.out.println("This is the Test Case number zero");
	 
	  }
	 
	  @Test(priority = 1)
	 
	  public void One() {
	 
		  System.out.println("This is the Test Case number one");
	 
	  }
	 
	  @Test(priority = 2)
	 
	  public void Two() 
	  {
	 
		  System.out.println("This is the Test Case number two");
	 
	  }
	  
	  @Test(priority = 3)
	  public void Five() 
	  {
	 
		  System.out.println("This is the Test Case number three");
	 
	  }

}
