#include <stdio.h>
int main()
{
    double n1, n2, n3;
   
    scanf("%lf,%lf,%lf", &n1, &n2, &n3);
    if( n1>=n2 && n1>=n3 )
        printf("%.f", n1);
    if( n2>=n1 && n2>=n3 )
        printf("%.f", n2);
    if( n3>=n1 && n3>=n2 )
        printf("%.f", n3);
    return 0;
}