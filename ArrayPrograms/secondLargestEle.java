 
/* wap to find the second largest element in an array */
public class secondLargestEle {
	
	public static void main(String[] args) 
	{
		int[] a= {40,30,60,80,50,10,20,70};
		
		
		int largest=a[0];
		int secondLargest=a[0];
		for (int i = 1; i < a.length; i++) 
		{
			
			if(a[i]>largest)
			{
				secondLargest=largest;
				largest=a[i];
			}
			else if(a[i]>secondLargest)
			{
				secondLargest=a[i];
			}

		}
		System.out.println(secondLargest);

	}

}