class m14 
{
	static 
	{
		System.out.println("From static block of m14");
	}
	static int b=100;
	public static void main(String[] args) 
	{
		System.out.println("From main of m14");
		System.out.println(m14.b);
		System.out.println("----------------------");
		System.out.println(m13.a);
		m13.test();
	}
}
