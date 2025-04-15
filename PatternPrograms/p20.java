class p20 
{
	public static void main(String[] args) 
	{
		int a=100,b=200,c=150;


		int d=a>b?a:b;
		int greatest=d>c?d:c;


		//OR int greatest=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println(greatest);
	}
}
