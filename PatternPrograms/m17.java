class m17
{
	static int a=500;
	public static void test1()
	{
		System.out.println("From static method");
	}
	int x=1000;
	public  void test2()
	{
		System.out.println("From non-static method");
	}
	public static void main(String[] args) 
	{
		m17 ob1=new m17();
		System.out.println(ob1.x);
		ob1.test2();
		
		System.out.println(ob1.a);
		ob1.test1();
		System.out.println("-------------");
		m17 ob2=new m17();
		System.out.println(ob2.x);
		ob2.test2();
		
		System.out.println(ob2.a);
		ob2.test1();
	}
}
