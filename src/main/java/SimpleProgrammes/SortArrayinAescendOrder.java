package SimpleProgrammes;

public class SortArrayinAescendOrder {


	public static void main(String[] args) {
		int arr[]={10,2,3,7,8,-9};
		sortTheArray( arr);
	}
	private static void sortTheArray(int[] arr) {
		int temp=0;
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i] > arr[j])   
				{  
					temp = arr[j];  
					arr[j] = arr[i];  
					arr[i] = temp; 
				}

			}
			System.out.println(arr[i]); 


		}
		System.out.println();

	}

}

