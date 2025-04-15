class p89 
{
	public static void test()
	{
		System.out.println("From Test-1");
	}
	public static void test(int a)
	{
		System.out.println("From Test-2");
	}
	public static void test(int a,int b)
	{
		System.out.println("From Test-3");
	}
	public static void main(String[] args) 
	{
		test();
		test(100);
		test(100,200);
	}
}
