package JavascriptExecutorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Multiplewindows.ResourceHelper;

public class entertextbyjavascript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,ResourceHelper.getResourcePath("\\src\\main\\resources\\chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('email').setAttribute('value', 'paragborwake81@gmail.com')");
	js.executeScript("document.getElementById('pass').setAttribute('value', 'paragborwake81')");
	
	WebElement element= driver.findElement(By.xpath("//input[@value='Log In']"));
	js.executeScript("arguments[0].click;",element);
	//js.executeScript(arguments[0].stylebackgroundColour, arg1)

	}

}
