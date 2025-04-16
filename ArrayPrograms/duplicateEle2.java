
/* wap to print the duplicate elements in an array without sorting*/
public class duplicateEle2  {
	
	public static void main(String[] args) {
		int[] a= {10,20,30,20,10,10};
		
		for (int i = a.length-1;i>=0; i--) 
		{
			boolean isDuplicate=false;
			
			for (int j = i-1; j >=0; j--) 
			{
				if(a[j]==a[i])
				{
					isDuplicate=true;
					break;
				}		
			}
			if(isDuplicate)
			{
				System.out.println(a[i]);
			}
			
			
		}
		
	}

}