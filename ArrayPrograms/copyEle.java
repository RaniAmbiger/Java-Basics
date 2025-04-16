 
import java.util.Arrays;

/* wap to copy the elements of one array into another */ 
public class copyEle {
	
	public static void main(String[] args) {
		int[] a= {20,30,50,70,80};
		int[] b=new int[a.length];
		for (int i = 0; i < b.length; i++) 
		{
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
