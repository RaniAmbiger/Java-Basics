class p90 
{
	public static int add(int a,int b,int c)
	{
		int sum=a+b+c;
		return sum;
	}
	public static double add(int a,float b,double c)
	{
		double sum=a+b+c;
		return sum;
	}
	public static double add(double a,float b,int c)
	{
		double sum=a+b+c;
		return sum;
	}
	public static String add(String a,char b,boolean c)
	{
		String sum=a+b+c;
		return sum;
	}

	public static void main(String[] args) 
	{
		System.out.println(add(10,20,30));
		System.out.println(add(10,25.5f,135.4555d));
		System.out.println(add(135.4555d,25.5f,10));
		System.out.println(add("Java",'$',true));


	}
}
