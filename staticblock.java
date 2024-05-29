//static block eg
class Demo
{
   static int a;
   void show()
    {
     System.out.println("I am show");
    }
   static
   {
       System.out.println("I am static block");
      a=55;
      System.out.println("Value of a="+a);
   }
  public static void main(String arg[])
  {
    System.out.println("I am main");
    Demo ob=new Demo();
    ob.show();
}
}