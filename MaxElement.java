package ArraysProblems;

public class MaxElement {

	public static void main(String[] args) {
		
		int arr[] = {1,765,36,36,54,75,345,346,753,252,3642,836,2626,2,22662,4562}; // array initialization
		int max = arr[0]; // set first element of array in max
		
		for(int ind=1;ind<arr.length;ind++)
		{
			if(arr[ind]>max) 
				max = arr[ind]; 
		}
		System.out.printf("Max Element in the Array : %d",max);
	}

}
