 
import java.util.Scanner;

/* wap to check the number is sunny number */
public class sunnyNumber {
	
	public static double squareRoot(double num)
	{
		double sqrt=num/2;
		double temp=0;
		while(sqrt-temp!=0)
		{
			temp=sqrt;
			sqrt=(temp+num/temp)/2;
		}
		
		return sqrt;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double num=sc.nextInt();
		
		double x=squareRoot(num+1);
	
		if(x%1==0)
		{
			System.out.println(num+" is Sunny number");
		}
		else
		{
			System.out.println(num+" is not Sunny number");
		}
	}

}
