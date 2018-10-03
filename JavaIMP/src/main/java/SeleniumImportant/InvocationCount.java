package SeleniumImportant;

import org.testng.annotations.Test;

public class InvocationCount 
{
	
	@Test(invocationCount = 10)
	public void testCount() 
	{
		System.out.println("Invocation count test");
	}

}
