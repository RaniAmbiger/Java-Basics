class  s139
{
	public static void main(String[] args) 
	{
		int row=5;
		int noSpace=0;
		int noChar=row;	
		
		for(int i=0;i<row;i++)
		{
			char ch='A';
			for(int j=0;j<noSpace;j++)
			{
				System.out.print(' ');
			}
			for(int k=0;k<noChar;k++)
			{
				System.out.print(ch);
				if(k<noChar/2)
					ch++;
				else
					ch--;
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
