package SeleniumImportant;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeSuite
	public void sequence1()
	{
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void sequence2()
	{
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void sequence3()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void sequence4()
	{
		System.out.println("BeforeMethod");
	}
	@Test
	public void sequence5()
	{
		System.out.println("Test");
	}
	@AfterMethod
	public void sequence6()
	{
		System.out.println("fterMethod");
	}
	@AfterClass
	public void sequence7()
	{
		System.out.println("AfterClass");
	}
	@AfterTest
	public void sequence8()
	{
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void sequence9()
	{
		System.out.println("AfterSuite");
	}

}
