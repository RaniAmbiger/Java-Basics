/* wap to swap two number using temporary variable */
public class swapTwoNumbers 
{
    public static void main(String[] args) {
		int num1=500;
		int num2=1000;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("----------------------");
		int temp=0;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
