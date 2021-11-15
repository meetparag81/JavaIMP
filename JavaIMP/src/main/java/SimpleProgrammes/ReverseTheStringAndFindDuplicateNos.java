package SimpleProgrammes;

public class ReverseTheStringAndFindDuplicateNos 
{
	
	
	
	
	public static void main(String[] args) 
	{
		
		String str = "Selenium";
	    char ch[]=str.toCharArray();  
	    String rev=""; 
	   int count=0;
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    
	    for(int j=0;j>str.length();j++)
		{
			for(int k=0;k<str.length();k++){
				
				if(ch[k]==ch[j])
				{
					
					count++;
					
				}
			}
	     
	}
	    System.out.println("No of duplicates"+ count);
	    System.out.print("reverse string is"+rev);
			
			
				
				
				
			}
			
		
		
		

	}


