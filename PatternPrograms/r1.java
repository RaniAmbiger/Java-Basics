class r1 
{
	public static void main(String[] args) 
	{
		int num=637,temp=num,rem=0,rev=0;
		for (int i=1;temp>0 ;i++ )
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		System.out.println(rev);
	}
}
