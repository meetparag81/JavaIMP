package binarysearch;

import java.util.Arrays;

public class NoisFirstorNot {

	public static void main(String[] args) {int[] ints={102,14,37,102};

	System.out.println(exists(ints,14));
	System.out.println(exists(ints,36));
	}



	private static boolean exists(int[] ints, int givennumber) {
int count=0;
		int result= Arrays.binarySearch(ints, givennumber);

		boolean test;
		if(result>=0){
			
			return test=true;
			
		}
		else{
			return test=false;

		}

	}
}
