class  s140
{
	public static void main(String[] args) 
	{
		int row=7;
		int noSpace=row/2;
		int noChar=1;		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<noSpace;j++)
			{
				System.out.print(' ');
			}
			for(int k=0;k<noChar;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<row/2)
			{
				noSpace--;
				noChar++;
			}
			else
			{
				noSpace++;
				noChar--;
			
			}
		}
	}
}
