class  s127
{
	public static void main(String[] args) 
	{
		int row=5;
		int col=5;
		for(int i=0;i<row;i++)
		{
			for(int k=0;k<col;k++)
			{
				if(i==0||i==row-1||k==0||k==col-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
	}
}
