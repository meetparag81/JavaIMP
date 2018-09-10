package StringComparisiom;

public class Test1 {

	public static void main(String[] args) 
	{
String s1= new String( "durga");
String s2= new String( "durga");
String s3 = "durga";
String s4= "durga";
//System.out.println(s1==s2);//false
//System.out.println(s1.equals(s2));//true
System.out.println(s1.contains(s2));//true
System.out.println(s3==s4);//true
System.out.println(s3.equals(s4));//true
System.out.println(s3.equals(s2));//true
System.out.println(s3== s1);// false// "==" used to test refrence of an object

	}

}
