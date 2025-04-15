import java.util.Scanner;

/* wap to find the sum of all the digits in a number*/
public class sumOfDigits {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the numer");
		 int num=sc.nextInt();
		 int sum=0;
		 int lastdigit;
		 while(num>0)
		 {
			lastdigit=num%10;
			num/=10;
			sum+=lastdigit;
			
		 }
		 System.out.println("The sum of digits ="+sum);
		 
	}

}