 
import java.util.Scanner;

/* wap to print the first 10 numbers in fibonocci series */
public class fibonocci2 {
	
	static int first_no=0;
	static int second_no=1;
	static int next_no;
	public static void printFibonocci(int count)
	{
		next_no=first_no+second_no;
		System.out.print(","+next_no);
		first_no=second_no;
		second_no=next_no;
		if(count>1)
			printFibonocci(count-1);
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the count");
		int count=sc.nextInt();
		
		System.out.print(first_no+","+second_no);
		printFibonocci(count-2);
		
	}

}