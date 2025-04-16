
/* wap to find the frequency of occurance of every element in the array */
public class frequencyOfEle  {
	
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,20,30,10,20,10};
		
		int[] frequency=new int[a.length];
		int counted=-1;
		
		
		for (int i = 0; i < a.length; i++) 
		{
			int count=1;
			
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]==a[i])
				{
					count++;
					frequency[j]=counted;
				}		
			}
			
			if(frequency[i]!=counted)
			{
				frequency[i]=count;
			}
		}
		
		for (int i = 0; i < frequency.length; i++) 
		{
			if(frequency[i]!=counted)
			{
				System.out.println(a[i]+"="+frequency[i]);
			}
		}
		
	}

}

/* 
 * a={10,20,30,40,50,20,30,10,20,10}
 * 
 * frequency={3,3,2,1,1,-1,-1,-1,-1,-1}
 */
