import java.util.*;

class Leastcomb
{
  public static void main(String []args)
 
{
    int num, i, j, temp;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter no of digits:");
    num = s.nextInt();

    int a[] = new int[num]; 

    System.out.println("Enter " + num + " integers: ");
 
    for (i = 0; i < num; i++) 
    a[i] = s.nextInt();
 
    for (i = 0; i < ( num - 1 ); i++) 
     {
    for (j = 0; j < num - i - 1; j++)
     {
        if (a[j] > a[j+1]) 
        {
           temp = a[j];
           a[j] = a[j+1];
           a[j+1] = temp;
        }
      }
    }
      System.out.println("output:");
      System.out.printf("%d %d",a[0],a[1]);
  }
}
