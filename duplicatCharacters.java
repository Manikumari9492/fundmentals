package praticeSession;

import java.util.HashMap;

public class duplicatCharacters {

	public static void main(String[] args) {
		 String str = "programming";

	        HashMap<Character, Integer> map = new HashMap<>();

	        // Count frequency of each character
	        for (char c : str.toCharArray()) {
	            map.put(c, map.getOrDefault(c, 0) + 1);
	        }

	        // Print duplicates
	        System.out.println("Duplicate characters:");
	        for (char c : map.keySet()) {
	            if (map.get(c) > 1) {
	                System.out.println(c + " : " + map.get(c));
	            }
	        }

	}

}
