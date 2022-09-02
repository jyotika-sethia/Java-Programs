package Practice;

public class Missingnumber {

	public static void main(String[] args) {
		//WAP to find missing integer in an array
		int arr[] = {8,9,10,12} ;
		int sum=0,total=0;
		int missing;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];//0+8//8+9//17+10//27+12
		}
		
		for(int j=8;j<=12;j++)
		{
			total=total+j;
		}
		
				//50-39
		missing=total-sum;
		
		System.out.println("the missing number in the array is "+missing);
	}

}
