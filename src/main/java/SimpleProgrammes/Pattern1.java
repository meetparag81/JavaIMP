package SimpleProgrammes;

import java.util.Scanner;

public class Pattern1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        
        //Taking rows value from the user
         
        //System.out.println("How many rows you want in this pattern?");
         
        //int rows = sc.nextInt();
         
        //System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= 4; i++) 
        {
            for (int j = 1; j <= 4; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
		
		
			
	}
	
		

}