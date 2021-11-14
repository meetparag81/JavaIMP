package Practice;

public class factorial {

	public static void main(String[] args) {
		int fact=1;
		int number=5;
		for(int i=1;i<=number;i++){
			fact=fact*i;
		}
		System.out.println("factorial of "+ number+" is "+fact);
		 fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);
		
	}
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    
		  
		     
		 

}
