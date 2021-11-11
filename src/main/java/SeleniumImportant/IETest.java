package SeleniumImportant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "G:\\Javaprogramming\\Selenium\\Selenium Setup\\IE\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.DemoQA.com");

	}

}
