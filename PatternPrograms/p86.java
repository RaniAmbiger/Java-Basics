class p86 
{
	public static String concat(String x,char y,boolean z)
	{
		String concatinate=x+y+z;
		return concatinate;
	}
	public static void main(String[] args) 
	{
		System.out.println(concat("Java",'$',true));
		System.out.println(concat("Java",'@',false));
	}
}
