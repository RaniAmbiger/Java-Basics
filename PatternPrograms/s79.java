class s79
{
	public static void main(String[] args) 
	{
		int row=5;
		int noSpace=row-1;
		int noChar=1;
		int num=1;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<noSpace;j++)
			{
				System.out.print(' ');
			}
			for (int k=0;k<noChar;k++)
			{
				System.out.print(num);
			}
		System.out.println();
		noSpace--;
		noChar+=2;
		num++;
		}
		
	}
}
