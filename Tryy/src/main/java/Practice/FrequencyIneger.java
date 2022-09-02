package Practice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyIneger {

	public static void main(String[] args) {
		// Write a program to find frequency of integers in an array

		 int arr[] = {15,23,23,15,5, 5, 20, 35, 35, 32};
		 
		 Map<Integer,Integer> intMap = new HashMap<Integer,Integer>();
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 if(intMap.containsKey(arr[i]))
			 {
				 intMap.put(arr[i],intMap.get(arr[i])+1);
			 }
			 else
			 {
				 intMap.put(arr[i],1);
			 }
		 }

		 System.out.println("The frequency of integer in array is "+intMap);
	}

}
