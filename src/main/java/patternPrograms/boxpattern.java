package patternPrograms;

public class boxpattern {
	
	public static void main(String[] args) {
		/*Pattern to print 
		****
		*  *
		*  *
		****
		In above pattern we know that we has to print 4 star in first row and 4 star in  4th row  as well as we need to print 
		4 star in first column and in fourth col
*/
for(int row=1;row<=4;row++){
	for(int col=1;col<=4;col++){
		if(row==1||row==4||col==1||col==4){
			System.out.print("*");
		}
		else{
			System.out.print(" ");
		}
		
	}
	System.out.println("");
	
}
		
	}

}
