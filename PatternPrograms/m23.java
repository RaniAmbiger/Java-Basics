class m23 
{
	public m23()
	{
		System.out.println("From constructor-1");
	}
	public m23(int a)
	{
		this();
		System.out.println("From constructor-2");
	}
	public static void main(String[] args) 
	{
		m23 ob=new m23(100);
	}
}
