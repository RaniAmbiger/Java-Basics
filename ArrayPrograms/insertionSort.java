 
import java.util.Arrays;

/* wap for sorting the array in increasing order using insertion sort */
public class insertionSort {
	
	public static void insertionSort(int[] a)
	{
//		for unsorted subarray
		for (int i = 1; i < a.length; i++) 
		{
			int temp=a[i];
			int j=i-1;
//			for sorted subarray
			while(j>=0&&temp<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		
	}
	public static void main(String[] args) 
	{
		int[] x= {40,30,50,10,20};
		
		System.out.println(Arrays.toString(x));
		insertionSort(x);
		System.out.println(Arrays.toString(x));
	}


}

/*
 * i=1		temp=30		j=i-1=0		j[0]=40
 * j=0		40,30,50,10,20		while(j>=0&&temp<a[j])		sorted[30,40],50,10,20
 * 
 * i=2		temp=50		j=i-1=1		j[1]=40
 * j=1		30,40,50,10,20		while(j>=0&&temp<a[j])(f)	sorted[30,40,50],10,20
 * 
 * i=3 		temp=10		j<i-1=2		j[2]=50
 * j=2		30,40,50,10,20		while(j>=0&&temp<a[j])		30,40,__,50,20
 * j=1		30,40,__,50,20		while(j>=0&&temp<a[j])		30,__,40,50,20
 * j=0		30,__,40,50,20		while(j>=0&&temp<a[j])		__,30,40,50,20		10,30,40,50,20
 * 
 * i=4		temp=20		j<i-1=3		j[3]=50
 * j=3		10,30,40,50,20		while(j>=0&&temp<a[j])		10,30,40,__,50	
 * j=2		10,30,40,__,50		while(j>=0&&temp<a[j])		10,30,__,40,50
 * j=1		10,__,30,40,50		while(j>=0&&temp<a[j])		10,__,30,40,50
 * j=0		10,20,30,40,50		while(j>=0&&temp<a[j])		10,20,30,40,50

*/
