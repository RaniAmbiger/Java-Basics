class  s125
{
	public static void main(String[] args) 
	{
		int row=9;
		int noSpace=0;
		int noChar=row;		
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
				noSpace++;
				noChar-=2;
			
			}
			else
			{
				noSpace--;
				noChar+=2;
			
			}
		}
	}
}
