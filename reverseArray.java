package ArraysProblems;

public class reverseArray {

	public static void main(String[] args) {
		//            0     1   2    3   4   5     6   7     8   9
		int arr[] = {1241,5342,653,6342,532,6345,6345,2345,2355,};
		System.out.print("Original Array: " );
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		int st = 0;//first element
		int end = arr.length-1;// second element
		
		
		while(st<=end)
		{
			int temp = arr[st];
			arr[st] = arr[end];
			arr[end] = temp;
			st++;
			end--;
		}
		
		System.out.print("Reverse Array: " );
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		

	}

}
