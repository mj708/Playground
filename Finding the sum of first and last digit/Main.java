#include <stdio.h>
 
main()
{
    int num, last ;

    scanf("%d", &num);
 
    last = num%10;
    
 
    while(num>=10)
    {
        num = num/10;
    }
 
    printf("%d", num+last);
}
 