package binarysearch;

import org.apache.poi.util.SystemOutLogger;

//find the ele from given array and its index if array is in decending order
public class SearchTheElementArayAscending {
	public static void main(String[] args) {
		int ints[]= {1,2,3,4,5,6,7,8,9,10};
		int givenno=2;
		indexvalue(ints,givenno);
		
	}
	
	

public static int indexvalue(int arr[],int givenno){
	 
	int ele=givenno;
	int start=0;
	int end =arr.length-1;
	
	while(start<=end){
	int mid = (start+end-start)/2;
	if(ele==arr[mid]){
		System.out.println("elenent"+ele+ "is located at"+"index"+arr[mid]);
		return arr[mid];
	}
	else if(ele<arr[mid]) {
		end=mid-1;
		

	}
	else {
		start=mid+1;
	}
	}
	return-1;
}
}
