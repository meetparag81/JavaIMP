package SeleniumImportant;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender 
{
	

	public static void main(String[] args) 
	{
		
	
		System.setProperty("webdriver.chrome.driver", "G:\\Javaprogramming\\Selenium\\Selenium Setup\\chromedriver\\for 65\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com");
		driver.findElement(By.name("username")).sendKeys("meetparag81");
		driver.findElement(By.name("password")).sendKeys("pBorprg$81");
		WebElement submitbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		try
		{
		wait.until(ExpectedConditions.visibilityOf(submitbutton));
		}
		catch(Exception e)
		{
			System.out.println("Element is not seen within 20 sec");
		}
		Actions act = new Actions(driver);
		act.moveToElement(submitbutton).click().perform();
		driver.switchTo().frame("mainpanel");
		String date = "18-September-2018";
		String arrdate[] = date.split("-");
		String day = arrdate[0];
		String month = arrdate[1];
		String year = arrdate[2]; 
		Select dayval = new Select(driver.findElement(By.name("slctMonth")));
		dayval.selectByVisibleText(month);
		Select yearval = new Select(driver.findElement(By.name("slctYear")));
		yearval.selectByVisibleText(year);
		int weekdays=7;
		boolean flag = false;
		for (int i = 2;i<=7;i++)
		{
			for(int j = 1; j<=weekdays;j++)
			{
				WebElement date1 =driver.findElement(By.xpath("//div[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr["+i+"]/td["+j+"]"));
				String daval= date1.getText();
				System.out.println(daval);
				if(dayval.equals(day));
				{
					date1.click();
					break;
				}
			}
			if(flag)
			{
				break;
			}
		}
		
		

	}
}


