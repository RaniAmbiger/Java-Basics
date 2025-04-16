 
import java.util.Arrays;

/* wap for sorting array in increasing order using selection sort */
public class selectionSort {
	
	public static void selectionSort(int[] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			int minIndex=i;
//			to get min element in array
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]<a[minIndex])
				{
					minIndex=j;
				}
				
			}
//			swap min element with i element
			if(minIndex!=i)
			{
				int temp=a[i];
				a[i]=a[minIndex];
				a[minIndex]=temp;
			}
			
		}
		
	}
	public static void main(String[] args) 
	{
		int[] x= {40,30,50,10,20};
		
		System.out.println(Arrays.toString(x));
		selectionSort(x);
		System.out.println(Arrays.toString(x));
	}

}

/*
 * i=0		minIndex=0		j<5		
 * j=1		minIndex=1
 * j=2		minIndex=1
 * j=3		minIndex=3
 * j=4		minIndex=3
 * 
 * 40,30,50,10,20	if(minIndex!=i)		swap the values		10,30,50,40,20		10 gets its place
 * 
 * i=1		minIndex=1		j<5
 * j=2		minIndex=1
 * j=3		minIndex=1
 * j=4		minIndex=4
 * 
 * 10,30,50,40,20	if(minIndex!=i)		swap the values		10,20,50,40,30		20 gets its place
 * 
 * i=2		minIndex=2		j<5
 * j=3		minIndex=3
 * j=4		minIndex=4
 * 
 * 10,20,50,40,30	if(minIndex!=i)		swap the values		10,20,30,40,50		30 gets its place
 * 
 * i=3		minIndex=3		j<5
 * j=4		minIndex=4
 * 
 * 10,20,50,40,30	if(minIndex!=i)		dont swap the values		10,20,30,40,50		40 gets its place
 * 
 * i=4		minIndex=4		j<5
 * j=5 condition false
 */
