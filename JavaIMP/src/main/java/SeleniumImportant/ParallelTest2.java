package SeleniumImportant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest2 {
	WebDriver driver;

	@Test
	public void Test1() throws InterruptedException{
		System.out.println("Iam test1|"+Thread.currentThread().getId());
		WebDriverManager.chromiumdriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		
	}
	@Test
	public void Test2() throws InterruptedException{
		System.out.println("Iam test2|"+Thread.currentThread().getId());
		WebDriverManager.chromiumdriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		
	}
}


