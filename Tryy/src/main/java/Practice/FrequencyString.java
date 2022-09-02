package Practice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyString {

	public static void main(String[] args) {
		// WAP to count the frequency of characters in a given string and print it in a map. e.g, String s = “We Dooo Testt”.
		
		String str="We Dooo Testt";
		char arr[]=str.toCharArray();
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		for(char c: arr)
		{
			if(charMap.containsKey(c))
			{
				charMap.put(c,charMap.get(c)+1);
			}
			else
			{
				charMap.put(c, 1);
			}
		}
		
		System.out.println("The Frequency of chacter in the string is "+charMap);	
	}
	

}
