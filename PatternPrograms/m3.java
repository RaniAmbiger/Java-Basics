class m3
{
	static int a=100;
	public static void main(String[] args) 
	{
		System.out.println(a);
		a=200;
		m3.test();
		System.out.println(a);
	}
	public static void test()
	{
		System.out.println(a);
		a=300;
		System.out.println(a);
		a=400;
	}

}
