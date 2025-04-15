import java.util.Scanner;

/* wap to print a prime numbers from 1 to 1000 using method */
public class printPrimeNum {

	public static boolean printPrime(int num)
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
	public static void main(String[] args) {
		
		for (int num = 1; num < 1000; num++) 
		{	
			if(printPrime(num))
			{
				System.out.println(num);
			}
		}
		
	}
}
