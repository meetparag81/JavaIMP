package SimpleProgrammes;

public class DividestringInEqualParts {

	public static void main(String[] args) {
		String str="aaaabbbbcccc";
		//Stores the length of the string  
		int len= str.length();
		//n determines the variable that divide the string in 'n' equal parts
		int n = 3;  
		int temp = 0, chars = len/n;  
		//Stores the array of string  
		String[] equalStr =  new  String[n];
		//Check whether a string can be divided into n equal parts  
		if(len % n != 0) {  
			System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
		}  
		else {



		}

	}
}
