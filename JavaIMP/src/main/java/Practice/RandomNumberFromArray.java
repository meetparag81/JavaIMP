package Practice;

import java.util.Random;

public class RandomNumberFromArray {

	public static void main(String[] args) {
		
		 
		      int[] arr = new int[] { 10, 30, 45, 60, 78, 99, 120, 140, 180, 200};
		      System.out.print("Random number from the array = "+arr[new Random().nextInt(arr.length)]);
		   }
		

	}


