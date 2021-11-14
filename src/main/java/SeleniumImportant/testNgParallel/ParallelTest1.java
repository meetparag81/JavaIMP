package SeleniumImportant.testNgParallel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest1 {
	
	@Test
	public void Test1(){
		
		System.out.println("I am test1");
		public WebDriver driver;
		 WebDriverManager.chromedriver().setup();
	}
	
	@Test
	public void Test2(){
		System.out.println("I am test2");
	}
	

}
