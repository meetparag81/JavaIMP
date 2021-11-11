package JavascriptExecutorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Multiplewindows.ResourceHelper;

public class gettitlebyusingjavascriptExecutor {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" ,ResourceHelper.getResourcePath("\\src\\main\\resources\\chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
		 String domain = js.executeScript("return document.domain;").toString();
		 System.out.println(domain);
		String Title = js.executeScript("return document.title;").toString();
		System.out.println(Title);
		js.executeScript("document.getElementById('email').setAttribute('value', 'paragborwake81@gmail.com')");
		js.executeScript("document.getElementById('pass').setAttribute('value', 'paragborwake81')");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,200)");
		js.executeScript("window.scrollBy(0,-100)");
		WebElement element= driver.findElement(By.xpath("//a[text()='Careers']"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		driver.quit();
	}

}
