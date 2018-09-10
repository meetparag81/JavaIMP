package Singletonconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInialization 
{
	private static DriverInialization instance = null;
	public  WebDriver driver ;
	
	private DriverInialization()
	{
		
	}
	public WebDriver openbrowser()
	{
		driver= new ChromeDriver();
		
		
		
		return driver;
		
	}
	public static DriverInialization getInstance()
	{
		if(instance==null)
		{
			instance= new DriverInialization();	
		}
		
		return instance;
		
	}
	

	public static void main(String[] args) 
	{
		
		
		
		
		// TODO Auto-generated method stub

	}

}
