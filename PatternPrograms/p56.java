class p56 
{
	public static void main(String[] args) 
	{
	/*	int i=1;
		while(i<=5)
		{
			System.out.println("*"); o/p:-*****
			i++;
		}	*/
		int row=5;
		int col=5,i=1;
		while(i<=row)
		{
			int j=1;
			while(j<=col)
			{
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
