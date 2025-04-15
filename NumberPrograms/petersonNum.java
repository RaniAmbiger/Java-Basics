 
import java.util.Scanner;

/* wap to check whether a number is peterson number or strong number or krishnamurthy number */
public class petersonNum {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int temp=num;
		
		int sum=0;
		
		while(temp>0)
		{
			int fact=1;
			int lastdigit=temp%10;
			temp/=10;
			for (int i = 1; i <= lastdigit; i++) 
			{
				fact=fact*i;
			}
		
			sum+=fact;
		}
		if(num==sum)
		{
			System.out.println(num+" is a peterson number");
		}
		else
		{
			System.out.println(num+" is not a peterson number");
		}
		
	}
}

/* 145= 	1!+4!+5!=1+24+120=145 factorial of each digit then sum of them is eqal to num
 */
