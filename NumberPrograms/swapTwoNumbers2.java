/* wap to swap two number without using temporary variable */
public class swapTwoNumbers2 
{
	public static void main(String[] args) {
		
		int num1=500;
		int num2=1000;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("-------------");
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println(num1);
		System.out.println(num2);
	}

}