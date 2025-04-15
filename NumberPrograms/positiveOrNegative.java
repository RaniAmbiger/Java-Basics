import java.util.Scanner;

/* wap to check whether a number is positive or negative */
public class positiveOrNegative {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numer");
		int num=sc.nextInt();
		
		if(num>0)
			System.out.println(num+" is a Positive number");
		else
			System.out.println(num+" is a Negative number");
	}
}