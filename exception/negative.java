//negativeArraySize exception classes
class Demo
{
  public static void main(String arg[])
  {
    try
    {
      int a[]=new int[-5];
      System.out.println("Array create succesfully");
      a[0]=10;
      a[1]=20;
      a[2]=30;
      System.out.println("Value insert succesfully");
      System.out.println("Value Display"+a[1]);
    }
    catch(Exception e)
    {
       System.out.println("Error ali print keli="+e);
    }
  }
}
