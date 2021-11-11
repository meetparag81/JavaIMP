package patternPrograms;

public class tringlepattern {

	public static void main(String[] args) {
		/*Pattern to print 
		*
		**
		***
		****
		In above pattern we know that we has to print one star in first row and as no of rows increases starincreases it means our star is depend on the no of rows which we have 
		so we required to print the star one loop and for how many repeatation needed for that needed another for loop
*/
		// for repetation we will take  no of row iteration
		for(int row=1;row<=4;row++){
			for(int col=1;col<=row;col++){
				System.out.print("*");
			}
			// once our firstrow is done we need to move to next line for that we need 
			System.out.println("");
		}
			
		}
		
	}


