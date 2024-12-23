package logicalquestions.p;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Countthenumberofdulicatewords {

	public static void main(String[] args) {
		
		findDuplicateWords("java in java in rohan rohan awale");
	}
	public static void findDuplicateWords(String inputstring) {
		
		String words[]= inputstring.split(" ");
		
		Map<String,Integer>wordCount = new HashMap<String, Integer>();
		 for(String word : words) {
			 
			 if(wordCount.containsKey(word)) {
				 wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
			 }else
				 wordCount.put(word, 1);
		 
	}
	Set<String>wordsInString = wordCount.keySet();
	
	for(String word : wordsInString) {
		if(wordCount.get(word)>1) {
			System.out.println(word + ":" + wordCount.get(word));
		}
	}
}}
