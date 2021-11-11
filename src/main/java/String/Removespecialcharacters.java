package String;

public class Removespecialcharacters {

	public static void main(String[] args) {
		
String s = "Selenium.#$^n1265><@#%^&?";
//using reqular expression
s.replaceAll("[^a-zA-Z0-9]", " ");
System.out.println(s);

	}

}
