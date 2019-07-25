#include <stdio.h>
int main()
{
    int base, exponent;
    int power = 1;
    int i;
  scanf("%d%d", &base,&exponent);
    if(exponent>=0)
    {
    for(i=1; i<=exponent; i++)
    {
        power = power * base;
    }

    printf("%d", power);
    }
  else
  {
    printf("Wrong input");
  }

}