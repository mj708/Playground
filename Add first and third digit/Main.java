#include<stdio.h>
int main()
{
int n,f,t;
  scanf("%d",&n);
  f=n/100;
  t=n%10;
  printf("%d",f+t);
  return 0;
}