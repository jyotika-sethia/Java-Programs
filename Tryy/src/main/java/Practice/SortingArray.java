package Practice;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,0,1,0,1,0,1,0,1,0};
		int n=arr.length;
		String arr1=Arrays.toString(arr);
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==1)
			{
				count++;
			}
		}
		for(int i=0;i<count;i++)
		{
			arr[i]=1;
		}
		for(int i=count;i<n;i++)
		{
			arr[i]=0;
		}
		System.out.println("the array after sort is "+Arrays.toString(arr));
	
	
	
	}
	

}
