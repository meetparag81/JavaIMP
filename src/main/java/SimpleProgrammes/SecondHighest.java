package SimpleProgrammes;

import java.util.Iterator;

public class SecondHighest {

	public static void main(String[] args) {
	int arr[]={1,2,3,6,8,9};
	findsecondhighest( arr);

	}

	private static void findsecondhighest(int[] arr) {
		int temp=0;
				//This will sort the array in ascending order
				for (int i=0;i<arr.length;i++) {
					for (int j=i+1;j<arr.length;j++) {
						if(arr[i]>arr[j]){
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
							
						}
						
						
					}
				
					
				}
				System.out.println(arr[arr.length-2]);
		
	}

}
