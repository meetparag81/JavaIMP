package String;

public class Mutability 
{
		public static void main(String[] args)
		{
			String s = "durga";
			s.concat("software");
			System.out.println(s);
			System.out.println(s.concat("software"));
			StringBuffer sb=  new StringBuffer("durga");
			sb.append("software");
			System.out.println(sb);
			
			
		

	}

}
