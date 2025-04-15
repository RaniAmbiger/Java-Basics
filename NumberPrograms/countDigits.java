import java.util.Scanner;

/* wap to count the number of digits in a number */
public class countDigits {
	
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the numer");
		 int num=sc.nextInt();
		 int digits=0;
		 while(num>0)
		 {
			num/=10;
			digits++;
		 }
		 System.out.println("The number of digits ="+digits);
		 
	}

}
