package overridingcombinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildClassNew extends Parentclassnew {
	
	int a=10,b=5;
	public int div(int a, int b)
	{
		return a/b;
		
	
	}
	
	public static void main(String[] args) {
		// Inoverriding the method from child class is always be taken  at runtime, hence it is called runtime polymorphysm
		ChildClassNew ccn= new ChildClassNew();
		System.out.println(ccn.div(20, 10));
		Parentclassnew pcn = new ChildClassNew();
		System.out.println(pcn.div(30, 15));
		
		WebDriver driver= new ChromeDriver();
		driver.get("");
		
	}

}
