class s94 
{
	public static void main(String[] args) 
	{
		int row=5;
		int noSpace=0;
		int noChar=2*row-1;
		char ch='A';
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<noSpace;j++)
			{
				System.out.print(' ');
			}
			for (int k=0;k<noChar;k++)
			{
				System.out.print(ch);
			}
		System.out.println();
		noSpace++;
		noChar-=2;
		ch++;
		}
		
	}
}
