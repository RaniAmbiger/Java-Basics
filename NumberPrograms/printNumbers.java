/* wap to print numbers from 1 to 100 without using any loop */
public class printNumbers  {

	static int num=1;
	public static void main(String[] args) {
		
		System.out.println(num++);
		
		if(num<=100)
		{
			main(null);
		}

	}
}
