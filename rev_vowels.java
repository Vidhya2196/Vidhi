import java.io.*;
import java.util.Scanner;
class Rever
{
public static void main(String[] args)
{
String n,m;
String d="";
int i;
System.out.println("enter the string");
Scanner s=new Scanner(System.in);
n=s.nextLine();
int length=n.length();
for(i=length-1;i>=0;i--)
d=d+n.charAt(i);
System.out.println("reverse value = "+d);
m=d.replaceAll("[AEIOUaeiou]","");
System.out.print("successfully vowels removed = ");
System.out.println(m);
}
}
