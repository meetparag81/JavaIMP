package Practice;

public class PrimeNumberinArray {

	public static void main(String[] args) {
		int arr[] = new int[]{-5,0,1,3,2,4,6,8,100};
		
		for(int i=0; i<arr.length;i++){
			int flag=0;
			if(arr[i]==1||arr[i]<=0){
				System.out.println(arr[i]+" No is not a prime No");
				
			}
			else{
				
				if(arr[i]==2){
					
				}
				if(arr[i]%2==0&& flag==0)
				{
					System.out.println(arr[i]+" No is not  a prime No");
				}
				else{
					System.out.println(arr[i]+" No is a prime No");
					
				}
			}
		}

	}

}
