import java.util.*;
class mul-div {
    static void mult(int a,int b)
    {
        int x=a*b;
        System.out.println(x);
        // a=sc.nextInt();
    }
    static void div(float c,float d)
    {
       
        float y=c/d;
        System.out.println(y);
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float c=sc.nextFloat();
        float d=sc.nextFloat();
        mult(a,b);
        div(c,d);
    }
   
}