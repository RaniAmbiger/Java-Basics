#include <stdio.h>

int add(int x,int y)
{
    int z=x+y;
    return z;
}
int sub(int x,int y)
{
    int z=x-y;
    return z;
}
int mul(int x,int y)
{
    int z=x*y;
    return z;
}
int div(int x,int y)
{
    int z=x/y;
    return z;
}

int main() {
    int a,b,c,d,e,f;
    printf("Enter two number : ");
    scanf("%d%d",&a,&b);
    c=add(a,b);
    d=sub(a,b);
    e=mul(a,b);
    f=div(a,b);
    printf("Addition=%d",c);
    printf("\nSubtraction=%d",d);
    printf("\nMultiplication=%d",e);
    printf("\nDivision=%d",f);
    return 0;
   
   
}
