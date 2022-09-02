package Practice;

public class Duplicate {

	public static void main(String[] args) {
		// WAP to find out the duplicate elements from the array
		
		int arr[] = {34,12,34,12,3};
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])//34==12//34==34//
				{
					System.out.println("The duplicate element is "+arr[j]);
				}
			}
		}

	}

}
