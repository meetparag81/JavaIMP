package WebdriverMethodsAndsInterrfaces;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;



public class MethodsAndInterfaces 
{
	 
	private void main() {
		System.setProperty("webdriver.chrome.driver" ,ResourceHelper.GetResourcePath("\\src\\main\\resources\\chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
		//driver. manage returns the options intrface.
		 Options var = driver.manage();
		//driver. manage. window returns the windows intrface.
		Window var1 = var.window();
		var1.maximize();
		//driver. manage(). window().maximize() method returns  the maximized window.
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
	}
	
}
