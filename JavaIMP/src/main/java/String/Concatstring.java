package String;

public class Concatstring {
	
	public static void main(String[] args) {
		
		String s = "durga";
		System.out.println(s);
		//In this case –object will be garbage collected
s.concat("software") ;

StringBuffer sb=  new StringBuffer("durga");
System.out.println(sb);
sb.append("software");
//Sysout statement prints “durgasoftware”
System.out.println(sb);



		
	}

}
