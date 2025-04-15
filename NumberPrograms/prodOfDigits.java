import java.util.Scanner;

/* wap to find the product of all the digits in a number*/
public class prodOfDigits {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the numer");
		 int num=sc.nextInt(); 
		 int prod=1;
		 int lastdigit;
		 while(num>0)
		 {
			lastdigit=num%10;
			num/=10;
			prod*=lastdigit;
			
		 }
		 System.out.println("The product of digits ="+prod);
		 
	}
}
