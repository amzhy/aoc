#include <stdio.h>
int strcmp (const char* str1, const char* str2);
int main() { 
    char s[12], msb[12], lsb[13];
    char str[1000][12]; int ct=0;
    while(scanf("%s", str[ct])==1 && ct<1000) ct++;
    
    for(int j=0;j<12;j++) {
    int m0=0,m1=0;
    for(int i=0;i<1000;i++) {
        if(str[i][j] -'0'==0) { m0++; }
        else m1++;
    }  
    msb[j] = m0>m1?'0':'1';
   }
   for(int i=0; i<12;i++) {
       lsb[i] = msb[i]=='0'?'1':'0';
   }
    lsb[12] ='\0';
    printf("%s %s\n",msb, lsb);
    return 0;
}