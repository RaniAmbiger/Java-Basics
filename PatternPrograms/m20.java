class m20
{
	public m20(int a)
	{
		System.out.println("From Constructor-1");
	}
	public m20(int a,int b)
	{
		System.out.println("From Constructor-2");
	}
	public m20(int a,int b,int c)
	{
		System.out.println("From Constructor-3");
	}
	public static void main(String[] args) 
	{
		m20 ob1=new m20(100);
		m20 ob2=new m20(200);
		m20 ob3=new m20(200,100,150);
	}
}
