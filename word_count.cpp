#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>
#include<conio.h>
void main() {
   int nob, now,pos=high,low;
   char *str;
   nob = now =0;
    clrscr();
 
   printf("Enter any string : ");
   gets(str);
 
   while (*str != '\0') {
 
      if (*str == ' ') {
          pos = high;
         ++nob;
      } else if (pos == high) {
         pos = low;
         ++now;
      }
       printf("\nNumber of words  %d", now);
   printf("\nNumber of spaces %d", nob);
    getch();
}
