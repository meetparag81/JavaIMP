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
	 
<<<<<<< HEAD
	  public void Threeone() {
=======
	  public void One() {
>>>>>>> branch 'master' of https://github.com/meetparag81/JavaIMP.git
	 
		  System.out.println("This is the Test Case threeone");
	 
	  }
	 
	  @Test(priority = 1)
	 
<<<<<<< HEAD
	  public void Threetwo() 
=======
	  public void Two() 
>>>>>>> branch 'master' of https://github.com/meetparag81/JavaIMP.git
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
