class m18
{
	int a=100;
	float b=25.45f;
	static int x=500;
	static float y=145.25f;
	
	public static void main(String[] args) 
	{
		m18 ob1=new m18();
		m18 ob2=new m18();
		ob1.a=800;
		ob2.y=625.85f;
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		System.out.println(ob1.x);
		System.out.println(ob1.y);

		System.out.println("-------------");
		
		System.out.println(ob2.a);
		System.out.println(ob2.b);
		System.out.println(ob2.x);
		System.out.println(ob2.y);
	}
}
