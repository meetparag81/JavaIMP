package WebdriverMethodsAndsInterrfaces;

import org.apache.log4j.Logger;



public class ResourceHelper 
{

	
	public static String  GetResourcePath(String path)
	{
		String BasePath = System.getProperty("user.dir");
				
				
				return BasePath + path;
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println(ResourceHelper.GetResourcePath("\\src\\main\\resorces\\configfile\\log4j.properties"));
		
	}

}
