import java.util.Scanner;

/* wap to check whether number is prime no using method */
public class primeNumber2 {
	
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
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numer");
		int num=sc.nextInt();
		
		if(isPrime(num))
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}
	}
}
