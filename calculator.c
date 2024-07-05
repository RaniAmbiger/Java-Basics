#include <stdio.h>

int main() {
    int a,b,c;
    char choice;
    printf("Enter Your choice:-");
    scanf("%c",&choice);
   
   
   
    switch(choice)
    {
        case '+' :
        printf("Enter the two numbers A and B");
        scanf("%d %d",&a,&b);
        c=a+b;
        printf("%d",c);
        break;
        case '-' :
        printf("Enter the two numbers A and B");
        scanf("%d %d",&a,&b);
        c=a-b;
        printf("%d",c);
        break;
        case '*' :
        printf("Enter the two numbers A and B");
        scanf("%d %d",&a,&b);
        c=a*b;
        printf("%d",c);
        break;
        case '/' :
        printf("Enter the two numbers A and B");
        scanf("%d %d",&a,&b);
        c=a/b;
        printf("%d",c);
        break;
        default :printf("Enter valid input");
    }
}
