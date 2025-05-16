package ArraysProblems;

public class SuffixSum {

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
		for(ind=arr.length-2;ind>=0;ind--)
		{
			arr[ind] = arr[ind] + arr[ind+1];
		}
		System.out.println("Array After SuffixSum : ");
		
		for(int val: arr)
		{
			System.out.print(val+",");
		}
		
	}

}
