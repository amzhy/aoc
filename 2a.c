#include <stdio.h>
int strcmp (const char* str1, const char* str2);
int main() { 
    char s[10]; char b[10]="forward", c[10]="up";
    int a=0, x=0, y=0;
   while(scanf("%s", s)==1){
       scanf("%d", &a);
        if(strcmp(s,b)==0){
            x+=a;
        } else if (strcmp(s,c)==0){
            y-=a;
        } else{
            y+=a;
        }
   }
    printf("%d\n",x*y);
    return 0;
}