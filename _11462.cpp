#include<stdio.h>

int main()
{
    int n,i,j, v;


    while(1)
    {
        scanf("%d",&n);
        if(n==0)
            break;
        int age[100] = {0};
        for( i = 0 ; i < n; i++)
        {
            scanf("%d",&v);
            age[(v % 101) - 1]++;
        }
        int firstTime = 1;
        for (i = 0; i < 100; i++)
        {
            if (age[i] >= 1)
            {
                for (j = 0; j < age[i]; j++)
                {
                    if(firstTime ==1)
                    {
                        printf("%d",(i + 1));
                        firstTime = 0;
                    }
                    else
                        printf(" %d",(i + 1));
                }

            }
        }
        printf("\n");
    }
    return 0;
}

