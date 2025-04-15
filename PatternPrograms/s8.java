class s8
{
	public static void main(String[] args) 
	{	
		char ch='E';
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(i>=j)
				{
					System.out.print(ch);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			ch--;
		}
	}
}