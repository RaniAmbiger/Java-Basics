
import java.util.Arrays;

/* wap to rotate the array to the left by two times */
public class leftRotate  {
	
	
	public static void main(String[] args) {
		int[] a= {40,90,50,10,20};
		System.out.println(Arrays.toString(a));
		
		int rotate=2;
		for (int i = 0; i < rotate; i++) 
		{
			int first=a[0];
			for (int j =0;j<a.length-1; j++) 
			{
				a[j]=a[j+1];
				
			}
			a[a.length-1]=first;
		}
		System.out.println(Arrays.toString(a));
		
	}

}