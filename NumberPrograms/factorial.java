 
import java.util.Scanner;

/* wap to calculate the factorial of the number */
public class factorial {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numer");
		int num=sc.nextInt();
		int fact=1;
		for (int i = 1; i <= num; i++)		 //for(int i=num;i>=1;i--)	//sir
		{
			fact=fact*i;
		}
		System.out.println("The factorial of the given number is"+fact);
	}

}
