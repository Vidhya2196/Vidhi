#include<stdio.h>
struct stu
{
int m1,m2,m3,tot;
char name[15];
float avg;
}
main()
{
struct stu s[5];
int i,j;
for(i=0;i<2;i++)
{
printf("Enter the name");
scanf("%s",s[i].name);
printf("\n Enter the m1");
scanf("%d",&s[i].m1);
printf("\n Enter the m2");
scanf("%d",&s[i].m2);
printf("\n Enter the m3");
scanf("%d",&s[i].m3);
s[i].tot=s[i].m1+s[i].m2+s[i].m3;
s[i].avg=(float)s[i].tot/3.0;
}
printf("\n Student Result");
printf("\n Name\t\ttot\tavg");
for(i=0;i<2;i++)
{
printf("\n %s\t\t%d\t%.2f",s[i].name,s[i].tot,s[i].avg);
j=((s[0].tot)>(s[1].tot))?(s[0].tot):(s[1].tot);
printf("The max mark is %d",j);
}
}
