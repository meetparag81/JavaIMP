package Mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Helpers.ResourceHelper;

public class MoseOverTest 
{
	
	private WebDriver driver;

	@ BeforeMethod
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver" ,ResourceHelper.getResourcePath("\\src\\main\\resources\\chromedriver.exe"));
		 driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
	}
	
	@Test
	public void MouseoverTest()
	{
		Actions act = new Actions(driver) ;
		act.moveToElement(driver.findElement(By.linkText("Home"))).build().perform();
		
		
	}

}
