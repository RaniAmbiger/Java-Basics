 
import java.util.Arrays;

/* wap to find the Largest, secondLargest and thirdLargest element in an array */
public class thirdLargestEle {
	
	public static void main(String[] args) {
		
		int[] a= {90,10,50,30,100,20,60,40,80,70};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println();
		System.out.println("Largest="+a[a.length-1]);
		System.out.println("Second Largest="+a[a.length-2]);
		System.out.println("Third Largest="+a[a.length-3]);
		
		System.out.println("Least="+a[0]);
	}

}
