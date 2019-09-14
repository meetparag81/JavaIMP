package IFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helpers.ResourceHelper;

public class FramesTest 
{
	
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver" ,ResourceHelper.getResourcePath("\\src\\main\\resources\\chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home");
		/*List<WebElement>frames= driver.findElements(By.tagName("//iframe"));
		
		for(int i=0;i<frames.size();i++)
		{
			String frameid= frames.get(i).getAttribute("id");*/
			driver.switchTo().frame("a077aa5e");
			driver.findElement(By.xpath("/html/body/a/img")).click();
			
		}
		
	}


