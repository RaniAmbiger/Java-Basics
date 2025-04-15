
import java.util.Scanner;

/* wap to get square root of number */
public class squareRoot  {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		double num=sc.nextDouble();
		
		double sqrt=num/2;
		double temp=0;
	
		while(sqrt!=temp)
		{
			temp=sqrt;
			sqrt=(temp+num/temp)/2;
			
		}
		System.out.println("The square root of "+num+" is "+sqrt);
		
	}

}

