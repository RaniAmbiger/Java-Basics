class  p47
{
	public static void main(String[] args) 
	{
		int a=100,b=40;
		char operator='*';
		switch(operator)
		{
			case '+':{int sum=a+b;
					System.out.println("Sum="+sum);
					break;
				   }
			case '-':{int dif=a-b;
					System.out.println("Diff="+dif);
					break;
				   }
			case '*':{int prod=a*b;
					System.out.println("Product="+prod);
					break;
				   }
		}
	}
}
