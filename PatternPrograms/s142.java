class  s142
{
	public static void main(String[] args) 
	{
		int row=9;
		int noSpace=row-1;
		int noChar=1;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<noChar;j++)
			{
				System.out.print('*');
			}
			for(int k=0;k<noSpace;k++)
			{
					System.out.print(' ');
			}
			for(int l=0;l<noChar;l++)
			{
				System.out.print('*');
			}
			System.out.println();
			if(i<row/2)
			{
				noSpace-=2;
				noChar++;
			}
			else
			{
				noSpace+=2;
				noChar--;
			}
		}
	}
}
