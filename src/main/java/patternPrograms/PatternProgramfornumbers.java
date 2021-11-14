package patternPrograms;

public class PatternProgramfornumbers {

	public static void main(String[] args) {
//		5432*
//		543*1
//		54*21
//		5*321
//		*4321
		int lines=5;
		for(int i=1;i<=lines;i++){
			for(int j=lines;j>=1;j--){
				if(j!=i){
					System.out.print(j);
					
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println(""); 
		}

	}

}
