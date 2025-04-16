 
/* wap to find the largest  element in an array */ 
public class largestEle {
	

	public static void main(String[] args) 
	{
		int[] a= {40,30,80,10,20,70};
		
		
		int largest=a[0];
//		int least=a[0];
		for (int i = 1; i < a.length; i++) 
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
//			if(a[i]<least)
//			{
//				least=a[i];
//			}
		}
		System.out.println(largest);
//		System.out.println(least);
			
	

	}

}
