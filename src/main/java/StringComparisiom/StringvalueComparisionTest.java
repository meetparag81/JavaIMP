package StringComparisiom;

public class StringvalueComparisionTest 
{

	public static void main(String[] args) 
	{
		/*
		 * String a = "parag"; String b = "parag"; if(a==b) {
		 * System.out.println("The comparision value when a==b is "+ a==b); }
		 * if(a.equals(b)) {
		 * System.out.println("The comparision value when a.equals(b) is "+a.equals(b));
		 * } String d = new String("parag"); String e = new String("parag"); if(d!=e)//
		 * creating String object the hashcode is diffrent of two string hence this
		 * condition will be false {
		 * System.out.println("The comparision value when d==e is "+d==e); } else
		 * if(d.equals(e)) {
		 * System.out.println("The comparision value when d.equals(e) is "+d.equals(e));
		 * }
		 */

		System.out.println("==================");
		String a1 = "selenium";
		String b1 = "selenium";
		boolean flag = a1==b1;
		System.out.println("The comparision value when a1==b1 is "+ flag);


		System.out.println("The comparision value when a1.equals(b1) is "+a1.equals(b1));	

		String d1 = new String("selenium");
		String e1 = new String("selenium");
		// creating String object the hashcode is diffrent of two string hence this condition will  be false
		boolean flag1 = d1==e1;
		System.out.println("The comparision value when d1==e1 is "+flag1);


		System.out.println("The comparision value when d1.equals(e1) is "+d1.equals(e1));


	}

}
