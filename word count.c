#include<stdio.h>
#include<string.h>
#include<conio.h>
void main()
{
int l,i,count=0;
char s[100];
printf("\n enter the string");
gets(s);
l=strlen(s);
for(i=0;i<l;i++)
{
if(s[i]==' ')
count=count+1;
}
printf("\n the count is %d",count+1);
getch();
}
