package Singletonconcept;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest 
{
	WebDriver driver;
	@BeforeMethod
	public void Setup()
	{
		DriverInialization instancedriver=	DriverInialization.getInstance();
		driver= instancedriver.openbrowser();
	}
	@ Test
	public void TestMethod()
	{
		driver.get("http:// google.com");
		driver.getTitle();
		
	}
	

}
// diffrence between Normal class and singleton class
//"In normal class we use consrtructor to creat an object, whereas in singletonclass we use the get instance method for initalization";
