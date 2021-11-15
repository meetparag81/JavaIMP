package Practice;

public class PalindromeNo {

	
	public static void main(String[] args) {
		//To check the  PalindromeNo and reverse the No
		ReverseheNo(521);
		PalindromeNo(521);
		ArmstrongNumber(153);
		
		
	}
	private static void ArmstrongNumber(int num) {
	int  temp=num;
	int rev, sum=0;
	while(num>0){
	rev=num%10;
	num=num/10;
	sum=sum+rev*rev*rev;
	}
	if(temp==sum){
		System.out.println("number"+temp+"is ArmstrongNumber No");
	}
	else{
		System.out.println("number"+temp+"is  not ArmstrongNumber No");	
	}
	
	
		
	}
	public static  void ReverseheNo (int num){
		
		int rev = 0; int temp=0;
		temp=num;
		while(num>0){
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(("ReverseNumber"+rev));
		
		

		
	}
	
	public static void PalindromeNo(int num){
		int rev = 0; int temp=0;
		temp=num;
		while(num>0){
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if(rev==temp){
			System.out.println(("Number"+temp+" is PalindromeNo"));
		}
		else{
			System.out.println(("Number"+temp+" is not  PalindromeNo"));
		}

	}
	
	

}
