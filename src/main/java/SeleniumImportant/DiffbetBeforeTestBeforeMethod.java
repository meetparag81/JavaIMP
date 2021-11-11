package SeleniumImportant;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DiffbetBeforeTestBeforeMethod 
{
	
	@BeforeTest
    public void beforeTest() 
	{
      System.out.println("BT");
    }
   @BeforeMethod
   public void beforemethod()
   {
          System.out.print("BM");
   }
   
   public void helper() 
   {
             System.out.println("Flow");
           }

           @Test(priority=1)
           public void TestExample() 
           {
             
             System.out.println("-Test1");
           }

           @Test(priority=2)
           public void TestExample1() 
           {
           
             System.out.println("-Test2");
           }
 
}
	
	


