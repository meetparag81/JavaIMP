package SimpleProgrammes;

public class Partternprograme1 {
	/*5432*
	543*1
	54*21
	5*321
	*4321 TODO Auto-generated method stub*/
	public static void main(String[] args) {
		System.out.println();
		int i,j,lines=5; 
		// this loop is used to print the lines  
		for(i=1;i<=lines;i++){
			// this loop is used to print numbers in a line 
			for( j=lines;j>1;j--){
				 if(j!=i)  
			           System.out.print(j);  
			           else  
			            System.out.print("*");  
			   }  
			   System.out.println(""); 
				
			}
		}

	}


