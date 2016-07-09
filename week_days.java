import java.io.*;
import java.util.Scanner;
class Week
{
public static void main(String[] args)
{
String ch="";
System.out.println("enter the choice");
Scanner s=new Scanner(System.in);
ch=s.nextLine();
switch(ch)
{
case "monday":
System.out.println("true");
break;
case "tuesday":
System.out.println("true");
break;
case "wednesday":
System.out.println("true");
break;
case "thursday":
System.out.println("true");
break;
case "friday":
System.out.println("true");
default:
System.out.println("false");
break;
}
}
}
