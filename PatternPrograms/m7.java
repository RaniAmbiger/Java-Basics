class m7 
{
	static int a=test1(10,20);
	static int b=test1(10,20)+test2(15,30);
	static int test1(int m,int n)
	{
		return m+n+test2(m,n);
	}
	static int test2(int x,int y)
	{
		return x+y+15;
	}
	public static void main(String[] args) 
	{
		System.out.println(m7.a);
		System.out.println(m7.b);
	}
}
