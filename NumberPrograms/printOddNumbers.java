 /* wap to print odd number from 1 to 100 */
public class printOddNumbers {

	public static void main(String[] args) {
		
		for (int num=1; num <= 100; num++) 
		{
			if(num%2!=0)					//num%2==1
				System.out.println(num);
		}
	}
}
