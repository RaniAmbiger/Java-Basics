class p24 
{
	public static void main(String[] args) 
	{
		int a=10,b=15,c=20;
		boolean res=!((a+b>=a+c)&&(a*c!=b*c)||!(b/a==c/b));
		System.out.println(res);
	}
}
