 
import java.util.Scanner;

/* wap to check whether a number is emirp number */
public class emirpNum {
	
	public static boolean isPrime(int num)
	{
		boolean flag=true;
		for (int i = 2; i <= num/2; i++) 
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
			
		}
		return flag;
	}
	
	public static int reverseNumber(int num)
	{
		int temp=num;
		int rem=0,rev=0;
		
		while(temp>0) 
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numer");
		int num=sc.nextInt();
		
		if(isPrime(num))
		{
			
			if(isPrime(reverseNumber(num)))
			{
				System.out.println(num+" is a emirp number");
			}
			else
			{
				System.out.println(num+" is not a emirp number");
			}
			
		}
		else
		{
			System.out.println(num+" is not a emirp number");
		}
	}
	

}

/* chech num is prime		=13
 * if yes then reverse it	=31
 * 
 * then check reverse number is prime
 * 
 */
