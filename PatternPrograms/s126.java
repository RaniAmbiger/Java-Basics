class  s126
{
	public static void main(String[] args) 
	{
		int row=5;
		int noChar=row-2;
		
		for(int i=0;i<row;i++)
		{
			for(int k=0;k<noChar;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<row/2)
			{
				noChar--;
			}
			else
			{
				noChar++;
			}
		}
	}
}
