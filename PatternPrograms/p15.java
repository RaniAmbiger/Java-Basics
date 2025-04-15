class p15 
{
	public static void main(String[] args) 
	{
		int a=10,b=15;
		int c=++a + --b + a++;
		int d=c++ + --b - --a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
