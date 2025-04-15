
import java.util.Scanner;

/* wap to check the year is leap year or not */
public class leapYear  {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		
		boolean flag=true;
		
		if(year%4==0)
		{
			if(year%100==0&&year%400!=0)
			{
				flag=false;
			}
		}
		else
			
		{
			flag=false;
		}
		if(flag)
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println(year+" is not leap year");
		}
	}

}