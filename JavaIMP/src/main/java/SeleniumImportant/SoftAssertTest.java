package SeleniumImportant;


import org.testng.Assert;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	@Test
	public void testCaseOne() 
	{
		System.out.println("*** test case one started ***");
		Assert.assertEquals(5, 5, "First hard assert failed");
		System.out.println("hard assert success....");
		Assert.assertTrue("Hello".equals("hello"), "Second hard assert failed");
		System.out.println("*** test case one executed successfully ***");
	}


	@Test
	public void testCasetwo() 
	{
		SoftAssert softAssert = new SoftAssert();
		System.out.println("*** test case two started ***");
		softAssert.assertEquals("Hello", "new", "First soft assert failed");
		System.out.println("soft assert success....");
		softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed");
		softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed");
		System.out.println("*** test case two executed successfully ***");
		softAssert.assertAll();
	}
	@Test
	public void TestMethod()
	{
		SoftAssert softAssert = new SoftAssert();
		System.out.println("checking second validation");
		softAssert.assertEquals(10, 20);
		Assert.assertEquals("MM", "PP");
	}
}
