package binarysearch;

public class truefalseconditonforgivenno {
	
	

	public static void main(String[] args) {
int[] ints={-9,14,37,102};

System.out.println(exists(ints,102));
System.out.println(exists(ints,36));

	}

	private static boolean exists(int[] ints, int k) {
		boolean test=false;
		for (int i : ints) {
			
			if(i==k&&ints!=null)
				test=true;
			
			else 
				test=false;
					
		}
		
		return test;
	}

}
