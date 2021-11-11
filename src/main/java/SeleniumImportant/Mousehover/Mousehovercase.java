package SeleniumImportant.Mousehover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehovercase 
{
	private static WebDriver driver;
	
	public static String configureBrowser(String path)
	{
		String basePath = System.getProperty("user.dir");
        System.out.println(basePath + path);
		return basePath + path ;
		
	}
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",Mousehovercase.configureBrowser("\\src\\main\\resources\\chromedriver.exe"));
		driver = new ChromeDriver();
		driver.get("http://demoqa.com/menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act = new  Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Music')]"));
		act.moveToElement(ele).perform();
		WebElement ele1=driver.findElement(By.xpath("//div[contains (text(), 'Rock')]"));
act.moveToElement(ele1).perform();
		act.moveToElement(driver.findElement(By.xpath("//div[contains (text(), 'Classic')]"))).click().build().perform();
	}

}
