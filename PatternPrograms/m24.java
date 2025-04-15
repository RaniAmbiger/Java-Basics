class m24
{
	int a,b;
	public m24(int x)
	{
		System.out.println("From constructor-1");
		this.a=x;
	}
	public m24(int y,int z)
	{
		this(y);
		System.out.println("From constructor-2");
		this.b=z;
	}
	public static void main(String[] args) 
	{
		m24 ob=new m24(100,200);
		System.out.println(ob.a);
		System.out.println(ob.b);

	}
}
