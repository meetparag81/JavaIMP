package overridingcombinations;

public class Test {

	public static void main(String[] args)
	{
		ChildClass obj = new ChildClass();
		System.out.println(obj.multi(10, 30));
		ParentClass obj1 = new ParentClass();
		System.out.println(obj1.multi(10, 30));
		Parentclassnew csn=  new ChildClassNew();
		csn.div(10, 2);

	}

}
