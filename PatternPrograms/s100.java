
class s100
{
	public static void main(String[] args) 
	{
		int row=5;
		int noSpace=0;
		int noChar=2*row-1;
		
		for(int i=0;i<row;i++)
		{
			char ch='A';
			for(int j=0;j<noSpace;j++)
			{
				System.out.print(' ');
			}
			for (int k=0;k<noChar;k++)
			{
				if(k<noChar/2)
					System.out.print(ch++);
				else
					System.out.print(ch--);
			}
		System.out.println();
		noSpace++;
		noChar-=2;
		
		}
		
	}
}
