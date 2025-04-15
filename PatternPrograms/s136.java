class  s136
{
	public static void main(String[] args) 
	{
		int row=5;
		int noSpace=0;
		int noChar=row;	
		//int num=3;
		for(int i=0;i<row;i++)
		{
			int num=1+noChar/2;
			for(int j=0;j<noSpace;j++)
			{
				System.out.print(' ');
			}
			for(int k=0;k<noChar;k++)
			{
				System.out.print(num);
				if(k<noChar/2)
					num--;
				else
					num++;
			}
			System.out.println();
			
			if(i<row/2)
			{
				noSpace++;
				noChar-=2;
				//num-=2;
			
			}
			else
			{
				noSpace--;
				noChar+=2;
				
			
			}
		}
	}
}
