#include <math.h>
#include <stdio.h>
 
int main()
{
 
    float f,e;
     double H;
 scanf("%f",&e);
   scanf("%f",&f);
     H = hypotf(e,f);
     printf("%.2f", H);
     return 0;
 }