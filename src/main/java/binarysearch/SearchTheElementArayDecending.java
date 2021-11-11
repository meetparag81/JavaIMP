package binarysearch;

public class SearchTheElementArayDecending {
	
	public static void main(String[] args) {
		int ints[]= {20,17,15,14,13,12,10,9,8,4};
		int givenno=4;
		indexvalue(ints,givenno);

}

	
		
		
	
	public static int indexvalue(int arr[],int givenno){
		int start=0;
		int ele=givenno;
		int end =arr.length-1;
while(start<end){
	int mid= (start+end-start)/2;
	if(ele==arr[mid]){
		System.out.println("elenent"+ele+ "is located at"+"index"+arr[mid]);
		return arr[mid];
		
	}
	else if (ele<arr[mid]) {
		
		start=mid+1;
	}
	else{
		end=mid-1;
	}
}
return -1;
	
}
		
	}
