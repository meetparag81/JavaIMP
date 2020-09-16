package SeleniumImportant;

import org.testng.annotations.Test;
import org.testng.Assert;

public class hardAsserTest 
{
	@Test
	public void TestMethod()
	{
		System.out.println("checking first validation");
		Assert.assertEquals(10, 20);
		Assert.assertEquals("MM", "PP");
	}
	
	

}
