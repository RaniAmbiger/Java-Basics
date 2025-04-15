class m15
{
	
	 int a=100;
	public void test()
	{
		System.out.println("From test method");
	}
	public static void main(String[] args) 
	{
		System.out.println("From main method");
		m15 ob1=new m15();
		System.out.println(ob1.a);
		ob1.test();
		System.out.println("---------------------");
		m15 ob2=new m15();
		System.out.println(ob2.a);
		ob2.test();
		System.out.println("---------------------");
		m15 ob3=new m15();
		System.out.println(ob3.a);
		ob3.test();
			
	}
}
