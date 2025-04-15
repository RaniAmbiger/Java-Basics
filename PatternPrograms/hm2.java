class hm2 
{
	public static void main(String[] args) 
	{
		int a=200,b=500,c=80;
		//int sec=a>b?(a<c?a:c):(b<c?b:c);
		int sec=a>b?(b>c?b:(a<c?a:c)):(a>c?a:(b<c?b:c);
		System.out.println(sec);
	}
}
