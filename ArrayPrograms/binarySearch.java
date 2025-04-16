

import java.util.Arrays;

/* wap to find whether an element is present in the array using Binary search */
public class binarySearch  {
	
	public static void binarySearch(int[] a,int key)
	{
		boolean flag=false;
		int firstIndex=0,lastIndex=a.length,midIndex;
		while(firstIndex<=lastIndex)
		{
			midIndex=(firstIndex+lastIndex)/2;
			
			if(a[midIndex]==key)
			{
				flag=true;
				break;
			}
			else if(a[midIndex]<key)
			{
				firstIndex=midIndex+1;
			}
			else if(a[midIndex]>key)
			{
				lastIndex=midIndex-1;
			}
			
		}
		
		
		if(flag)
			System.out.println(key+" is present in the array");
		else
			System.out.println(key+" is not present in the array");
		
	}
	public static void main(String[] args) {
		int[] x= {40,90,50,10,20};
		
		Arrays.sort(x);
		binarySearch(x,20);
	}

}

/*
 *  1.In binarySearch array should be sorted 
 *  
 * 2.then divide the array and search in both the sides
 * 
 */


