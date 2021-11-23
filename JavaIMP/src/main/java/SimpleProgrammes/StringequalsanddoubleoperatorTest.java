package SimpleProgrammes;

public class StringequalsanddoubleoperatorTest {

	public static void main(String[] args) {
		
		String s1= new String ("you can not change me");
		String s2= new String ("you can not change me");
		System.out.println(s1==s2);// false because the s1 and s2 is pointing to two different objects in heap area but there is implicit object created for string lateral "you can not change me"
		String s3= "you can not change me";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);//false because the s1 is pointing to the object in heap and S3 pointing to  the object created in SCP when String s1= new String ("you can not change me"); is executed  
		System.out.println(s1.equals(s3));//true  because in string constant pool there is already"you can not change me" contents are  there" 
		String s4= "you can not change me";
		System.out.println(s3==s4);//true  because s4 also points to in string constant pool where s3 is referring already created object during s1 creation.
		System.out.println(s3.equals(s4));
		String s5= "you can not "+ "change me";
		System.out.println(s4==s5);//true  here concatenation happened at compile time and  s5 will refer to already create object in SCP
		System.out.println(s3==s5); //true  here concatenation happened at compile time and  s5 will refer to already create object in SCP
		System.out.println(s1==s5);//false both objects are pointing to different object one is in heap and another in the SCP
		String s6= "you can not ";
		String s7= s6+ "change me";		
		System.out.println(s7==s4);//false because if atleast a normal variable is available the string concatination will happen at run time only and new object will be created at heap area so s7 is pointing to heaparea object and s4 pointing to SCP.
		 final String s8= "you can not ";
		 String s9= s8+ "change me";
		 System.out.println(s9==s4);//true because if  a final  variable is equivalent to constant and two constants will be handle at compile time only. so s9 pointing to object where s4 pointing.
		
		
	}

}
