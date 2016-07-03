public class JavaStringToIntExample
{
  public static void main (String[] args)
  {
   
    String s = "100";

    try
    {
      // the String to int conversion happens here
      int i = Integer.parseInt(s.trim());

           System.out.println("int i = " + i);
    }
    catch (NumberFormatException nfe)
    {
      System.out.println("NumberFormatException: " + nfe.getMessage());
    }
  }
}
