class s49
{
	public static void main(String[] args) 
	{
		int num=5;
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(i+j<=4)
				{
					System.out.print(num);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			num--;
		}
	}
}