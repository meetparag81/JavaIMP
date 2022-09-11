package MapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
	HashMap<String, Integer>test= new HashMap<>();
	test.put("PB", 10);
	test.put("PB", 10);
	System.out.println(test);
	
	ArrayList<String >testarraylst= new ArrayList<>();
	testarraylst.add("PB");
	testarraylst.add("PB");
	System.out.println(testarraylst);
	
	Set<String> testset = new HashSet<>();
	testset.add("PB");
	testset.add("PB");
	
	System.out.println(testset);

	}

}
