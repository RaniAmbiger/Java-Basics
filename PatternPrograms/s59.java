class s59
{
	public static void main(String[] args) 
	{

		
		for (int i=0;i<5;i++)
		{
			//int num=1;
			for (int j=0;j<5;j++)
			{
				if(i+j<=4)
				{
					System.out.print((j+1)%2);
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