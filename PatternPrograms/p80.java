class p80 
{
	public static void test1(int a,int b,int c)
	{
		//System.out.println("From Test");
		int sum=a+b+c;
		System.out.println("Sum="+sum);
	}
	public static void main(String[] args) 
	{
		System.out.println("From main Begin");
		test1(10,20,30);
		test1(250,100,150);
		System.out.println("From main End");
	}
}
