 
import java.util.Scanner;

/* wap to check the number is tech number */
public class techNumber {
	
	public static int numberOfDigits(int num)
	{
		int digits=0;
		while(num>0)
		{
			digits++;
			num/=10;
			
		}
		return digits;
	}
	
	public static boolean isTechNumber(int num)
	{
		boolean flag=false;
		int divisor=1;
		int digit=numberOfDigits(num);
		for (int i = 0; i < digit/2; i++) 
		{
			divisor*=10;													//100
		}
		
		int firstHalf=num/divisor;											//30
		int secondHalf=num%divisor;											//25
		
		int power=(firstHalf+secondHalf)*(firstHalf+secondHalf);			//(55)*(55)	=3025
		
		if(num==power)
		{
			flag=true;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(numberOfDigits(num)%2==0)
		{
			if(isTechNumber(num))
			{
				System.out.println(num+" is a Tech number");
			}
			else
			{
				System.out.println(num+" is not contain even number");
			}
		}
	}

}

/* num=3025
 * 
 * 1.check numberOfDigits is even
 * 			=4
 * 2.find divisor throw numberOfDigits
 * 			=100
 * 3.find firstHalf and secondHalf using divisor
 * 			=3025/100	=30
 * 			=3025%100	=25
 * 
 * 4.find the power 
 * 			=(30+25)*(30+25)
 * 			=(55)*(55)
 * 			=3025
 * 
 *5.compare num with power
 *			3025==3025
 *
 * if they are same then its a tech number
 * 
 * */
