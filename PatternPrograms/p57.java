class p57 
{
	public static void main(String[] args) 
	{
		int num=769,temp=num,reverse=0,remainder=0;
		while(temp>0)
		{
			remainder=temp%10;
			reverse=reverse*10+remainder;
			temp=temp/10;
		}
		System.out.println(reverse);
	}
}
