class m21 
{
	int a;
	int b;
	public m21(int x,int y)
	{
		a=x;
		b=y;
	}
	public static void main(String[] args) 
	{
		m21 ob1=new m21(100,200);
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		System.out.println("--------------");
		m21 ob2=new m21(500,1000);
		System.out.println(ob2.a);
		System.out.println(ob2.b);
		System.out.println("--------------");
		m21 ob3=new m21(800,1500);
		System.out.println(ob3.a);
		System.out.println(ob3.b);

	}
}
