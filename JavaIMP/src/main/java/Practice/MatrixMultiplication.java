package Practice;

public class MatrixMultiplication {

	public static void main(String[] args) {
//      matrix1    matrix2
//		1 1 1    1 1 1
//		2 2 2    2 2 2
//		3 3 3    3 3 3
		//creating two matrices    
		int row[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int col[][]={{1,1,1},{2,2,2},{3,3,3}};    
		    
		//creating another matrix to store the multiplication of two matrices    
		int multiplicationmatrix[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//multiplying and printing multiplication of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		multiplicationmatrix[i][j]=0; 
		//This loop needed for increament of each row  number and column number for each row and col
		for(int k=0;k<3;k++)      
		{   
			// by using multiplicationmatrix[i][j]+ will add the multiplevalue in the matrix and k will be used to get daa from row[0][k=0]*col[k=0][j]i.e 1*1 then k increament  then it will become 2 value from second row from fiet col of matrx1  and for matrix2 first row and  
		multiplicationmatrix[i][j]+=row[i][k]*col[k][j];      
		}//end of k loop  
		System.out.print(multiplicationmatrix[i][j]+" ");  //printing matrix element  
		}//end of j loop  
		System.out.println();//new line    
		}    
		}
	}  
	

	


