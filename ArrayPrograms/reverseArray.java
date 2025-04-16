 
import java.util.Arrays;

/* wap to reverse an array */
public class reverseArray {
	
	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50,60};
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length/2; i++) 
		{
			a[i]=a[i]+a[a.length-1-i];
			a[a.length-1-i]=a[i]-a[a.length-1-i];
			a[i]=a[i]-a[a.length-1-i];
			
//			using a temp variable
//			int temp=a[i];
//			a[i]=a[a.length-1-i];
//			a[a.length-1-i]=temp;
			
		}
		System.out.println(Arrays.toString(a));
	}

}
