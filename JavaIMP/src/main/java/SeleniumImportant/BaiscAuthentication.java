package SeleniumImportant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Multiplewindows.ResourceHelper;

public class BaiscAuthentication {
	
	public static void main(String[] args) {
		
		String url= "https://the-internet.herokuapp.com/basic_auth";
		System.setProperty("webdriver.chrome.driver" ,ResourceHelper.getResourcePath("\\src\\main\\resources\\chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
		//http:://username:password@url
		driver.get("http:/admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
