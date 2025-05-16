package ArraysProblems;

public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[] = {12,32,54,64,94,100,105,130,62,74,93,63,79,93,96,152};
		int firstLargeElement = 0;
		int secondLargeElement = 0;
		
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]>firstLargeElement)
			{
				secondLargeElement = firstLargeElement;
				firstLargeElement = arr[i];
			}
			else if(arr[i]>secondLargeElement && arr[i]!=firstLargeElement)
			{
				secondLargeElement = arr[i];
			}
				
		}
		System.out.print("SecondLargestElement : "+secondLargeElement);
	}

}
