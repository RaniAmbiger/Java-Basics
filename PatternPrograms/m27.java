class m27 
{
	{
		System.out.println("From non-static block-1");
	}
	{
		System.out.println("From non-static block-2");
	}
	public static void main(String[] args) 
	{
		System.out.println("From main");
		m27 ob1=new m27();
		m27 ob2=new m27();
	}
	{
		System.out.println("From non-static block-3");
	}
}
