class p36
{
	public static void main(String[] args) 
	{
		if(false)
		System.out.println(1);
		System.out.println(2);		//treated as separator statement
		else
		System.out.println(3);		//so else without if not allowed
		System.out.println(4);
	}
}
