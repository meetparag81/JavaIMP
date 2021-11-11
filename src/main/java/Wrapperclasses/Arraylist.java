package Wrapperclasses;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		int a=10;
		// here we wrapped int value by using Integer object so we can use it in arraylist as a object as add method accepts as a parameter 
		Integer I = new Integer(a);
		ArrayList<Integer> al = new ArrayList<>();
		al.add(a);
		

	}

}
