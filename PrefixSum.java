package ArraysProblems;

public class PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Original Array :");
		for(int val:arr)
		{
			System.out.print(val+" ");
		}
		System.out.println();
		System.out.println();
		
		int ind;
		for(ind=1;ind<arr.length;ind++)
		{
			arr[ind] = arr[ind] + arr[ind-1];
		}
		System.out.println("Array After PrifixSum : ");
		for(int val: arr)
		{
			System.out.print(val+" ");
		}
	}
}
