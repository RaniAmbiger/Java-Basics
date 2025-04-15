/* wap to print even number from 1 to 100 */
public class printEvenNumbers {

	public static void main(String[] args) {
		
		for (int num=1; num <= 100; num++) 
		{
			if(num%2==0)
				System.out.println(num);
		}
	}
}