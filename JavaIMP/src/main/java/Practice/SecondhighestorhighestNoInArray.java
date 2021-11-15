package Practice;
//Secondhighest
public class SecondhighestorhighestNoInArray {

	public static void main(String[] args) {
		int temp=0;
		
	int[] arr= new int[]{-1,0,1,60,80,99,999};
	int  total=arr.length;
	//highestno in array
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
		if(arr[i]>arr[j]){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		
		}
	}
	System.out.println("second largest no in array is "+arr[total-2]);
	System.out.println("Largest no in array is "+arr[total-1]);
	System.out.println("smallest no in array is "+arr[0]);
	System.out.println("secondsmallest no in array is "+arr[1]);
	}

}
