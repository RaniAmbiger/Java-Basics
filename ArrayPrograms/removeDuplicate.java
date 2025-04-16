
import java.util.LinkedHashSet;

/* wap to print the duplicate elements in an array using collection*/
public class removeDuplicate  {
	
	public static void main(String[] args) {
		
		int[] a= {10,20,30,20,10,10};
		LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) 
		{
			if(!l.add(a[i]))
			{
				System.out.println(a[i]);
			}
		}
		
	}

}
