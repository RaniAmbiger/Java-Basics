class s41
{
	public static void main(String[] args) 
	{	
		for (int i=0;i<5;i++)
		{
			char ch='A';
			for (int j=0;j<5;j++)
			{
				if(i+j<=4)
				{
					System.out.print(ch++);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}