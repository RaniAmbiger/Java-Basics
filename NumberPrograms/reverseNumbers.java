import java.util.Scanner;

/* wap to reverse the number */
public class reverseNumbers  {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numer");
		int num=sc.nextInt();
		int rev=0;
		int rem=0;
		int temp=num;
	 
		
		 while(temp>0)
		 {
			 rem=temp%10;
			 rev=rev*10+rem;
			 temp=temp/10;
		 }
		 
		 System.out.println(rev);
		 
	}

}
