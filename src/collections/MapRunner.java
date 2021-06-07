package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is an awesome application."+"This has never happened before.";
		Map<Character,Integer> occurences = new HashMap<>();
		
		char[] characters = str.toCharArray();
		
		for(char character:characters) {
			//Get the character. 
			Integer integer = occurences.get(character);
			if(integer==null) {
				occurences.put(character,1);
			}else {
				occurences.put(character,integer+1);
			}
			//if it is there, then we increment the count.
			//if it is not there, initialize to 1
			
		}
		System.out.println(occurences);
	}

}
