import java.util.Scanner;

/*wap to check whether a number is palindrom */
public class palindrom {
	
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
		 if(rev==num)
			 System.out.println("The number is a Palindrom");
		 else
			 System.out.println("The number is not a Palindrom");
	}

}