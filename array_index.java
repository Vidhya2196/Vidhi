import java.util.*;
import java.util.Scanner;
class arrind
{


public static void main(String args[])
{
int i,j;
int a[]=new int[5];
Scanner s=new Scanner(System.in);
System.out.println("enter the array in ascending order:");
 for(i=0;i<5;i++)
a[i]=s.nextInt();
 System.out.println("Array elements are : ");
        for (j=0;j<a.length;j++)
            System.out.println(a[j]);
System.out.println("enter any number from the array:");
int n=s.nextInt();

if(n==a[n])
System.out.println("number is"+n);
else
System.out.println("number is not in index");
}
