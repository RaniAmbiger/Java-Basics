class  s124
{
	public static void main(String[] args) 
	{
		int row=9;
		int noSpace=row/2;
		int noChar=1;
		
		for(int i=0;i<row;i++)
		{
			char ch=(char)('A'+noChar/2);
			for(int j=0;j<noSpace;j++)
			{
				System.out.print(' ');
			}
			for(int k=0;k<noChar;k++)
			{
				System.out.print(ch);
				if(k<noChar/2)
					ch--;
				else
					ch++;
			}
			System.out.println();
			if(i<row/2)
			{
				noSpace--;
				noChar+=2;
			
			}
			else
			{
				noSpace++;
				noChar-=2;
			
			}
		}
	}
}
