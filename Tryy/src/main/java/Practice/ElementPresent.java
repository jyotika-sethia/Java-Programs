package Practice;

import java.util.Scanner;

public class ElementPresent {

	public static void main(String[] args) {
		// WAP if the given element is present in the array or not
		int  arr[] = {34,12,8,199,3,56,24};
		int flag=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value u want to find");
		int n=s.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println(n+" is found in the array");
		}
		else
		{
			System.out.println(n+"is not found in the array");
		}		
	}

}
