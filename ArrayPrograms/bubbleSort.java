 
import java.util.Arrays;

/* wap for sorting array in increasing order using bubble sort */
public class bubbleSort {
	
	public static void bubbleSort(int[] a)
	{
//		rounds
		for (int i = 0; i < a.length; i++) 
		{
//			each round which sorts array
			for (int j = 0; j < a.length-1-i; j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
	}
	public static void main(String[] args) 
	{
		int[] x= {10,70,30,50,60};
		
		System.out.println(Arrays.toString(x));
		bubbleSort(x);
		System.out.println(Arrays.toString(x));
	}

}

/*
 * i=0		j<5-1-i=4
 * j=0	[10,70],30,50,60		->[10,70],30,50,60
 * j=1	10,[70,30],50,60		->10,[30,70],50,60
 * j=2	10,30,[70,50],60		->10,30,[50,70],60
 * j=3	10,30,50,[70,60]		->10,30,50,[60,70]		70 gets its place
 * 
 * i=1		j<5-1-i=3
 * j=0	[10,30],50,60,70		->[10,30],50,60,70
 * j=1	10,[30,50],60,70		->10,[30,50],60,70
 * j=2	10,30,[50,60],70		->10,30,[50,60],70		60 gets its place
 * 
 * i=2		j<5-1-i=2
 * j=0	[10,30],50,60,70		->[10,30],50,60,70
 * j=1	10,[30,50],60,70		->10,[30,50],60,70		50 gets its place
 * 
 * i=3		j<5-1-i=1
 * j=0	[10,30],50,60,70		->[10,30],50,60,70		30 gets its place
 * 
 */
