 
import java.util.Scanner;

/* wap to check whether a number is neon number */
public class neonNumber {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int sqrt=num*num;
		int sum=0;
				
		while(sqrt>0)
		{
			sum+=sqrt%10;
			sqrt/=10;
		}

		if(num==sum)
		{
			System.out.println(num+" is a neon number");
		}
		else
		{
			System.out.println(num+" is not a neon number");
		}
	}

}

/* 1=	1(2)=1 		=1=1
 * 9=	9(2)=81		=8+1=9     square numbers digits gives num
 * 
 * 
 * there are only 2 neon numbers whithin 100
 */
