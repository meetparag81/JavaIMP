package SeleniumImportant;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.IReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AlertProgramme implements ITestListener
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php ");
		driver.findElement(By.name("cusid")).sendKeys("1001");
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().accept();
		
		String Alertmessage= driver.switchTo().alert().getText();
		
				System.out.println(Alertmessage);
				driver.switchTo().alert().accept();
				driver.quit();
//Implicitwait 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
// Explicitwait  WebDriverWait wait1 = new WebDriverWait(driver, 3000);
//  to create a screenshot
				TakesScreenshot src = ((TakesScreenshot)driver);
				src.getScreenshotAs(OutputType.FILE);
//"Listnered used to capture screenshot is 'ITestListener'";

//"Listner used to take Extend report is  IReporter"; 
 // "Selenium exceptions"
 // TimeoutException
 // NoSuchElementException;
 // NoSuchFrameException;
  //NoAlertPresentException
  //NoSuchWindowException;
 // SessionNotFoundException;
  
  
  
				

	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
