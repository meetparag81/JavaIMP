package patternPrograms;

public class squarepattern {

	public static void main(String[] args) {
		/*Pattern to print 
		****
		****
		****
		****
		In above pattern we know that we has to print 4 star in first row and same upto 4th row 
		so we required to print the star one loop and for how many repeatation needed for that needed another forloop
*/
		// for repetation we will take  no of row iteration 
		
		for(int i=1;i<=4;i++){
		//to print the star in each row we need another for loop i.e
		for(int j=1;j<=4;j++){
			System.out.print("*");
		
		}
		System.out.println("");
		}
		
		// once our firstline completed column forloop will comeout and  row counter gets  
	}

}
