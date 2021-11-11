package SimpleProgrammes;

public class subtractthetwomatrices {

	public static void main(String[] args) {
		int rows,cols;
		//Initialize matrix a
		int[][]a={
				{4, 5, 6},  
				{3, 4, 1},  
				{1, 2, 3} 
		};
		//Initialize matrix b 
		int[][]b={
				{2, 0, 3},  
				{2, 3, 1},  
				{1, 1, 1}
		};
		//Calculates number of rows and columns present in given matrix 
		rows=a.length;
		cols=a[0].length;

		//Create Array which will  will hold the result 
		int[][]diff= new int [rows][cols];

		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				diff[i][j] = a[i][j] - b[i][j]; 
			}

		}
		System.out.println("Subtraction of two matrices: ");  
		for(int i = 0; i < rows; i++){  
			for(int j = 0; j < cols; j++){  
				System.out.print(diff[i][j] + " ");  
			}  
			System.out.println();  


		}

	}
}
