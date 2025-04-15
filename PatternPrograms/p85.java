class  p85
{
	public static double multiply(int a,float b,double c)
	{
		double product=a*b*c;
		return product;
	}
	public static void main(String[] args) 
	{
		double prod=multiply(10,20.55f,30.5644d);
		System.out.println(prod);
	}
}
