 
import java.util.Scanner;

/* wap to check whether a number is perfect number */
public class perfectNum {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int temp=num;
		int sum=0;

		for (int i = 1; i <= num/2; i++) 
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}

		if(num==sum)
		{
			System.out.println(num+" is a perfect number");
		}
		else
		{
			System.out.println(num+" is not a perfect number");
		}
	}

}

/* 6	=1,2,3		=1+2+3		=6			numbers which are divide num and those numbers sum 
 * 
 * 28	=1,2,4,7,14	=1+2+4+7+14	=28
 * 
 */
