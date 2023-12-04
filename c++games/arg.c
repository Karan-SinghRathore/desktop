#include<stdio.h>
#include<stdlib.h>

int main(int argc, char* argv[])
{
    int a,b,sum;
    if(argc!=3)
    {
        printf("please use \"prg_name value1 value2\"\n");
        return -1;
    }
    a = atoi(argv[1]);
    b = atoi(argv[2]);
    sum= a+b;

    printf("Sum of %d,%d is: %d\n",a,b,sum);    


    // printf("argc is %d\n",argc);
    // if(argc >= 2)
    // {
    //     printf("The arguments supplied are:\n");
    //     for(int i =0; i<argc; i++)
    //     {
    //         printf("%s\t", argv[i]);
    //     }
    // }
    return 0;
}
