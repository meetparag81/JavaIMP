package Practice;

public class primeno {

	public static void main(String[] args) {
		
	
		int[]arr = new int[]{-5,0,1,2,3,5,6,8};
		
		for(int i=0;i<arr.length;i++){
			int flag=0;
			if((arr[i]==1||arr[i]<=0)){
				System.out.println(arr[i]+" Number is not prime no");
				
			}
			else{
				if(arr[i]==2){
					
					flag=1;
				}
				if(arr[i]%2==0&&flag==0){
					System.out.println(arr[i]+" Number is not prime no");
					
				}
				else{
					System.out.println(arr[i]+" Number is  prime no");
				}
				
			}
		}
		

	}

}

