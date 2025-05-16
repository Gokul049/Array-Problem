package ArraysProblems;

public class MinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1241,5342,653,6342,532,6345,6345,2345,2355,60};
		int min = arr[0];
		for(int ind=1;ind<arr.length;ind++)
		{
			if(arr[ind]<min)
				min = arr[ind];
		}
		System.out.print("Min Element in the Array : "+min);
	}

}
