class s12 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(i>=j)
				{
					System.out.print((i+j+1)%2);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//System.out.println("Hello World!");
	}
}
