package SeleniumImportant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Multiplewindows.ResourceHelper;



public class FacebookTestforfindelementTest {
	
	private static WebDriver driver;
	private static WebElement ele;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver" ,ResourceHelper.getResourcePath("\\src\\main\\resources\\chromedriver.exe"));
		  driver= new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  // findelement method finds first element when properies are same for two objects
		// EntertheusernameUsingClassname("login_form_input_box", "paragborawake81");
		 //EnterthepasswordUsingClassname("login_form_input_box", "parag");
		// findelement method finds first element when properies are same for two objects
		  EntertheusernameUsingXpath("//input[@class='inputtext login_form_input_box']", "parag");
		  EnterthepasswordUsingXpath("//input[@class='inputtext login_form_input_box']", "bparag");
		  
		 driver.quit();
	}
	
	public static WebElement EntertheusernameUsingClassname(String locatortype,String value){
	try
	{
		
		 ele = driver.findElement(By.className(locatortype));
		ele.clear();
		ele.sendKeys(value);
	}
	catch(Exception e)
	{
		e.getStackTrace();
	}
		
		
	return ele;
	
}
	public static WebElement EnterthepasswordUsingClassname(String locatortype,String value)
	{
		try
		{
			
			 ele = driver.findElement(By.className(locatortype));
			ele.clear();
			ele.sendKeys(value);
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		
		ele.clear();
		ele.sendKeys(value);
		return ele;
	
}
	public static WebElement EntertheusernameUsingXpath(String locatortype,String value){
		try
		{
			
			 ele = driver.findElement(By.xpath(locatortype));
			ele.clear();
			ele.sendKeys(value);
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		return ele;

}
	public static WebElement EnterthepasswordUsingXpath(String locatortype,String value){
		try
		{
			
			 ele = driver.findElement(By.xpath(locatortype));
			ele.clear();
			ele.sendKeys(value);
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		return ele;

}
}
