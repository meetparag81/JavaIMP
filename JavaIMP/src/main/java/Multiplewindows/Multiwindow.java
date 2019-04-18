package Multiplewindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Multiwindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver" ,ResourceHelper.getResourcePath("\\src\\main\\resources\\chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		String firstwindow = driver.getWindowHandle(); 
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//h2[text()='Guru99 Bank']//following::a[1]"));
		act.moveToElement(ele).click().build().perform();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> Itr = windows.iterator();
		while(Itr.hasNext())
		{
		String childwindow=Itr.next();
		if(!firstwindow.equalsIgnoreCase(childwindow))
		{
			
		driver.switchTo().window(childwindow);
		try
		{
			
		TestUtils.VisibleOn(driver,driver.findElement(By.name("emailid")) , 30);
		}
		catch(TimeoutException e)
		{
			e.getStackTrace();
		}
		driver.findElement(By.name("emailid")).sendKeys("borawakepp4@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		driver.close();
		Thread.sleep(3000);
		String Act=	driver.switchTo().window(firstwindow).getTitle();
		String exp = "Guru99 Bank Home Page ";
		
			
		}
		
			
		}
		
		
		
	}

}
