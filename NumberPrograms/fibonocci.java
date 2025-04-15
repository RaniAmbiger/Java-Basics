 
/* wap to print the first 10 numbers in fibonocci series */
public class fibonocci {
	
	public static void main(String[] args) {
		int first_no=0;
		int second_no=1;
		int next_no;
		int count=10;
		
		System.out.print(first_no+","+second_no);
		
		while(count-2>0)
		{
			next_no=first_no+second_no;
			System.out.print(","+next_no);
			first_no=second_no;
			second_no=next_no;
			count--;
		}
	}
}

