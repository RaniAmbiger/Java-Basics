
import java.util.Scanner;

/* wap to get cube root of number */
public class cubeRoot  {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		double num=sc.nextInt();
		
		double cube=num/3;
		double temp=0;
	
		while(cube!=temp)
		{
			temp=cube;
			cube=((2*temp)+(num/(temp*temp)))/3;
			
		}
		System.out.println("The cube root of "+num+" is "+cube);
		
	}

}

