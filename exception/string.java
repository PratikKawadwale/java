//Stringindexout of bounded exception classes
class Demo
{
  public static void main(String arg[])
  {
    try
    {
      String s1="pratik";
      System.out.println("String="+s1);
      System.out.println("Character="+s1.charAt(7));
    }
    catch(Exception e)
    {
       System.out.println("Error ali print keli="+e);
    }
  }
}
