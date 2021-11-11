package SeleniumImportant;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid_SetUp 
{
	public static WebDriver driver;
	public static void main(String[]  args) throws MalformedURLException, InterruptedException  
	{
		String URL = "http://www.DemoQA.com";
 		String Node = "http://192.168.1.201:4444/wd/hub";
 		System.setProperty("webdriver.ie.driver", "G:\\Javaprogramming\\Selenium\\Selenium Setup\\IE\\IEDriverServer.exe");
 		DesiredCapabilities cap = new DesiredCapabilities();
 		cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
 
 		driver = new RemoteWebDriver(new URL(Node), cap);
 
 		driver.navigate().to(URL);
 		Thread.sleep(5000);
 		driver.quit();
		
	}

}
