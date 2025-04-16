
/* wap to find the least element in an array */ 
public class leastEle  {
	

	public static void main(String[] args) 
	{
		int[] a= {40,30,80,10,20,70};
		
		int least=a[0];
		for (int i = 1; i < a.length; i++) 
		{
			if(a[i]<least)
			{
				least=a[i];
			}
		}

		System.out.println(least);
			
	

	}

}