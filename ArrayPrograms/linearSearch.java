
/* wap to find whether an element is present in the array using Linear search */
public class linearSearch  {
	
	public static void linearSearch(int[] a,int key)
	{
		int index=-1;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==key)
			{
				index=i;
				break;
			}
		}
		
		if(index!=-1)
			System.out.println(key+" is present at index "+index);
		else
			System.out.println(key+" is not present in the array");
		
	}
	public static void main(String[] args) {
		int[] x= {40,90,50,10,20};
		
		linearSearch(x,150);
	}

}