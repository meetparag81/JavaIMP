package SeleniumImportant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait 
{
	

	public static void main(String[] args) 
	{
		WebDriver driver = null;
	WebDriverWait wait = new WebDriverWait(driver, 30, 100);
	wait.until(ExpectedConditions.numberOfWindowsToBe(2));// this will be used upto the windows are not opened 
	

	}

}
