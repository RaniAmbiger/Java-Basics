
import java.util.Arrays;

/* wap to print the duplicate elements in an array */
public class duplicateEle  {
	
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,20,30,10,20,10};
		
		Arrays.sort(a);
		
		for (int i = 0; i < a.length-1; i++) 
		{
			if(a[i]==a[i+1])
			{
				System.out.println(a[i+1]);
			}
			
		}
	}

}