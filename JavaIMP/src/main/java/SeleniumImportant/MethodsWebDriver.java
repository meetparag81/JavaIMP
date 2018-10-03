package SeleniumImportant;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsWebDriver
{
	public static  void main(String arg[]) throws InterruptedException
	{
	//Webdriver driver = new Webdriver();
		WebDriver driver = new ChromeDriver();
		ChromeDriver driver1 = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver1.wait();
	
	}
}
