class s17
{
	public static void main(String[] args) 
	{
		for (int i=0;i<5;i++)
		{
			char ch=(char)('E'-i);
			for (int j=0;j<5;j++)
			{
				if(i>=j)
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