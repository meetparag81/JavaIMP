package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {

	public static void main(String[] args) 
	{
		HashSet<String> LH= new HashSet<>();
		LH.add("A");
		LH.add("K");
		LH.add("B");
		LH.add("M");
		LH.add("A");
		
	System.out.println(LH);//output will be [A, B, K, M] where insertion ordered is not maintained
		LinkedHashSet<String> LH1= new LinkedHashSet<>();
		LH1.add("A");
		LH1.add("K");
		LH1.add("B");
		LH1.add("M");
		LH1.add("A");
System.out.println(LH1);// output will be [A, K, B, M] duplicate A is not printed
	}

}
