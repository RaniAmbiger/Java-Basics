class s19
{
	public static void main(String[] args) 
	{
		for (int i=0;i<5;i++)
		{
			int num=1+i;
			for (int j=0;j<5;j++)
			{
				if(i>=j)
				{
					System.out.print(num--);
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