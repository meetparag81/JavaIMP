package binarysearch;

import java.util.Arrays;

public class truefalseconditonusingbinarysearch {
	
	public static void main(String[] args) {
		int[] ints={102,14,37,102};

		System.out.println(exists(ints,102));
		System.out.println(exists(ints,36));
	
	}
	


private static boolean exists(int[] ints, int k) {
	
	int result= Arrays.binarySearch(ints, k);
	
	boolean test;
	if(result>=0)
	return test=true;
	else
		return test=false;
	
}
}
