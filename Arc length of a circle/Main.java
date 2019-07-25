#include<stdio.h>                                                                
                                                                                
void main()
{
    float radius, central_angle;
    float length=0,PI=3.14;
   
    scanf("%f", &radius);
   
    scanf("%f", &central_angle);

    length = (2*PI*radius*central_angle)/360;

    printf("%.2f", length);
}                                                                      
                                        