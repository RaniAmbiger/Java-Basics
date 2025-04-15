
import java.util.Scanner;

/* wap to check whether a number is automorphic number */
public class automorphicNum  {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int sqrt=num*num;
		boolean flag=true;
		
		while(temp>0)
		{
			if(sqrt%10!=temp%10)
			{
				flag=false;
				break;
			}	
			temp/=10;
			sqrt/=10;
		}
		
		if(flag)
		{
			System.out.println(num+" is a Automorphic number");
		}
		else
		{
			System.out.println(num+" is not a Automorphic number");
		}
		
	}

}



/* 5=25
 * 6=36
 * 25=625
 * 375=141375 square should contain num as last digits are automorphic
 * 
 * 7=49
 * 9=81
 * 
 * */
