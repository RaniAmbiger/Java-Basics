import java.util.*;
public class ExpressionEvaluator
{
    static void prob(int x,int y)
    {
        if(x>y && x>=0 && y>=1000000)
        {
           
            double fx=(Math.tan(Math.cbrt(x)+Math.cbrt(y)))+(Math.sin(x-y));
            double gx=(Math.cos(x*y))+(Math.sin(x-y));
            if(fx==gx)
            {
                System.out.println(fx);
               
                System.out.println(1);
               
            }
            else{
                System.out.println(fx);
                System.out.println(gx);
                System.out.println(0);
            }
        }
    }
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
  // Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   int y=sc.nextInt();
  // int =sc.nextInt();
  prob(x,y);
   System.out.println();
// System.out.println("Hello World");
}
}