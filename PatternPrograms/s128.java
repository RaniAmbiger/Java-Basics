class  s128
{
	public static void main(String[] args) 
	{
		int row=5;
		int noSpace=row-1;
		int noChar=1;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<noSpace;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<noChar;k++)
			{
				if(k==0||k==noChar-1||i==row-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			noSpace--;
			noChar+=2;
		}
	}
}
