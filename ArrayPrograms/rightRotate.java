 
import java.util.Arrays;

/* wap to rotate the array to the right by two times */
public class rightRotate {
	
	
	public static void main(String[] args) {
		int[] a= {40,90,50,10,20};
		System.out.println(Arrays.toString(a));
		
		int rotate=2;
		for (int i = 0; i < rotate; i++) 
		{
			int last=a[a.length-1];
	
			for (int j =a.length-1;j>0; j--) 
			{
				a[j]=a[j-1];
				
			}
			a[0]=last;
		}
		System.out.println(Arrays.toString(a));
		
	}

}


