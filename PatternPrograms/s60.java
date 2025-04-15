class s60
{
	public static void main(String[] args) 
	{	
		char ch='A';
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if(i+j<=4)
				{
					System.out.print(ch);
					if(ch!='Y')
						ch=(char)(ch+2);
					else
						ch='A';
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}