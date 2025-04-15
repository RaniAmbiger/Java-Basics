
import java.util.Scanner;

/* wap to check whether a number is facinating number */
public class facinatingNum  {
	
	public static int numberOfDigits(int num)
	{
		int digits=0;
		while(num>0)
		{
			digits++;
			num/=10;
			
		}
		return digits;
	}
	
	public static boolean facinatingNumber(int num)
	{
		String s=" "+num+2*num+3*num;
		boolean flag=true;
		for(char ch='1'; ch<'9';ch++)
		{
			int count=0;
			for (int i = 0; i < s.length(); i++) 
			{
				if(s.charAt(i)==ch)
				{
					count++;
				}
			}
			if(count!=1)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(numberOfDigits(num)>=3)
		{
			if(facinatingNumber(num))
			{
				System.out.println(num+" is Facinating number");
			}
			else
			{
				System.out.println(num+" is not Facinating number");
			}
		}
		else
		{
			System.out.println(num+" is not contain enough digits");
		}
		
	}

}
