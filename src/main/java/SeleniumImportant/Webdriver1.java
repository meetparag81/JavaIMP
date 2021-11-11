package SeleniumImportant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver1 
{
	@SuppressWarnings("unused")
	public static  void main(String arg[])
	{
		System.out.println();
		WebDriver driver = new ChromeDriver();
		driver.get("https:://google.com");
		driver.findElement(By.xpath(""));
	}
	

}
