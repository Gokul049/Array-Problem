package ArraysProblems;

public class ProductOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,25,6,2};
		int pro = 1;
		for(int ind=0;ind<arr.length;ind++)
		{
			pro = pro * arr[ind];
		}
		System.out.print("Product of The Array : "+pro);
	}

}
