class  s109
{
	public static void main(String[] args) 
	{
		int row=9;
		int noSpace=row/2;
		int noChar=1;
		char ch='A';
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<noSpace;j++)
			{
				System.out.print(' ');
			}
			for(int k=0;k<noChar;k++)
			{
				System.out.print(ch);
			}
			System.out.println();
			if(i<row/2)
			{
				noSpace--;
				noChar+=2;
				ch++;
			}
			else
			{
				noSpace++;
				noChar-=2;
				ch--;
			}
		}
	}
}
