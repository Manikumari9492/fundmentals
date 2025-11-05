package com.codegnan.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class firstLetterEx {

	public static void main(String[] args) {
		List<String>words=Arrays.asList("apple","banana","amla","corrot","boll","cat","cow","mani","Amma","Nanna");
		
		Map<Character,List<String>> TotalWords=new HashMap();
		
		for (String word:words) {
			if(word == null|| word.isEmpty()) ;
			
			char firstChar=Character.toLowerCase(word.charAt(0));
			
			 TotalWords.computeIfAbsent(firstChar, k -> new ArrayList<>()).add(word);
        }

       
        for (Map.Entry<Character, List<String>> entry : TotalWords.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
			  
		}
		
	}

}
