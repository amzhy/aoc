#include <stdio.h>

int main() { 
    int a, b; int ct=0; 
   scanf("%d", &a);
   while(scanf("%d", &b)==1) {
       if(b>a){ct++;}
        a = b;
   }
    printf("%d\n", ct);
    return 0;
}