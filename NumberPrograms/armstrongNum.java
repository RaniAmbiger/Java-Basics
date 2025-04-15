 
import java.util.Scanner;

/* wap to check whether a number is armstrong number */
public class armstrongNum {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int temp=num;
		int sum=0;
		int nodigits=0;
		
		// code for counting the number of digits
		while(temp>0)
		{
			nodigits++;
			temp/=10;
		}
		
		// code for calculating the sum of digits raised to power
		temp=num;
		while(temp>0)
		{
			int lastdigit=temp%10;
			int power=1;
			for (int i = 0; i < nodigits; i++) 
			{
				power*=lastdigit;
			}
			sum+=power;
			temp/=10;
		}
		
		if(num==sum)
		{
			System.out.println(num+" is a armstrong number");
		}
		else
		{
			System.out.println(num+" is not a armstrong number");
		}
	}
}


//
//5		=5(1)				=5				1 is number of digits in num

//153	=1(3 times multiply 1)+5(3 times multiply 5)+3(3 times multiply 3)		=153			3 is number of digits in num
