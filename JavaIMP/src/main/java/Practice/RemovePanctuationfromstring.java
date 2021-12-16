package Practice;

public class RemovePanctuationfromstring {

	public static void main(String[] args) {
		
				String str = "?This String $% Contains$$ punctuation !!"; 
				str = str.replaceAll("\\p{Punct}",""); 
				System.out.println(str); 
			} 
		 
		

	}


