package SeleniumImportant;

import org.testng.annotations.Test;

public class TestNGPriority 
{
	@Test(priority = -1)
	 
	  public void One() 
	{
	 
	      System.out.println("This is the Test Case number minus one");
	 
	  }
	 
	  @Test(priority = 0)
	 
	  public void Two() {
	 
		  System.out.println("This is the Test Case number zero");
	 
	  }
	 
	  @Test(priority = 1)
	 
	  public void Threeone() {
	 
		  System.out.println("This is the Test Case threeone");
	 
	  }
	 
	  @Test(priority = 1)
	 
	  public void Threetwo() 
	  {
	 
		  System.out.println("This is the Test Case number threetwo");
	 
	  }
	  
	  @Test(priority = 1)
	  public void Three() 
	  {
	 
		  System.out.println("This is the Test Case number three");
	 
	  }
	  
	  @Test(priority = 2)
	  public void Four() 
	  {
	 
		  System.out.println("This is the Test Case number four");
	 
	  }

}
