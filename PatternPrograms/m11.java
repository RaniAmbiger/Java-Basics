class m11 
{
	public static void test()
	{
		System.out.println("From test");
	}
	static
	{
		test();
	}
	public static void main(String[] args) 
	{
		System.out.println("From main");
	}
}
