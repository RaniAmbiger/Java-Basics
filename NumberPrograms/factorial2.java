public class factorial2 
import java.util.Scanner;

/* wap to calculate the factorial of the number using method recurssion */
public class factorial2  {
	
	public static int factorial(int num)
	{
		if(num==1)
		{
			return 1;
		}
		else
		{
			return num*factorial(num-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numer");
		int num=sc.nextInt();
		
		System.out.println(factorial(num));
	}
}
