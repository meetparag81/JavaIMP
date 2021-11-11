package HashMapInSelenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Test 
{
	static HashMap<String, String> loginData()
	{
		HashMap<String, String>hm = new HashMap<String,String>();
		hm.put("x",  "paragborawake81@ pBorprg$81");
		hm.put("y",  "abc@ murcury");
		hm.put("z",  "xbc@ 123");
		return hm;
	}

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http:gmail.com");
		String Credentials=loginData().get("x");
		String Arr[]= Credentials.split("@");
		//driver.findElement(By.xpath("//p[text()='Use another account']")).click();
		driver.findElement(By.name("identifier")).sendKeys(Arr[0]);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("//input[@name='password']"));
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		
	}

}
