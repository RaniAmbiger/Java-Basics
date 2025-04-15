
import java.util.Scanner;

/* wap to check whether a number is spy number */
public class spyNum  {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int temp=num;
		int sum=0;
		int prod=1;

		while(temp>0)
		{
			sum+=temp%10;
			prod*=temp%10;
			temp/=10;
		}
		if(sum==prod)
		{
			System.out.println(num+" is a spy number");
		}
		else
		{
			System.out.println(num+" is not a spy number");
		}
	}
}

/* 123		sum=1+2+3=6		prod=1*2*3=6
 * 
 * 132		sum=1+3+2=6		prod=1*3*2=6
 * 
 * 1142		sum=1+1+4+2=8	prod=1*1*4*2=8
 * 
 * if(sum==prod) then it is spy number
 * 
 */
