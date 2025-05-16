package ArraysProblems;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int sum = 0;
		
		System.out.print("Sum of the Array : "+sum(arr,sum));
		
	}
	
	static int sum(int arr[], int sum)
	{
		for(int ind=0;ind<arr.length;ind++)
		{
			sum = sum + arr[ind];
		}
		return sum;
	}

}
