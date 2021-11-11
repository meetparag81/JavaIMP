package stringBuffer;

public class ModCalculationUsingString {
	
	public static void main(String[] args) {
		
		String NumericString = "0123456789";
		StringBuilder sb = new StringBuilder(9);
		for (int i = 0; i < 9; i++) {
			int index = (int) (NumericString.length() * Math.random());
			sb.append(NumericString.charAt(index));
		}
		int checkvalue = (int) (Double.valueOf(sb.toString()) % 23);
		String k = String.valueOf(checkvalue);
		
		String words = new String("TRWAGMYFPDXBNJZSQVHLCKE");
		int count=1;
		for(int i=0;i<words.length();i++)
		{
			
			if (i == checkvalue) {
				sb.append(words.charAt(i));
				break;
				
			}
			
		}
		System.out.println("characters are" + sb + " and no of characters" + sb.length());
		
	

}
}
