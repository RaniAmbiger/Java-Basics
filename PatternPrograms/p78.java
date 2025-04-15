class p78
{
	public static void main(String[] args) 
	{
		System.out.println("From Main Begin");
		test1();
		System.out.println("From Main End");
	}
	public static void test2()
	{
		System.out.println("From Test2");
	}
	public static void test1()
	{
		System.out.println("From Test1 Begin");
		test2();
		System.out.println("From Test1 End");
	}
}
