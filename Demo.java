//static method example three types
class Demo
{
  static void add(int a,int b)
  {
      int c=a+b;
      System.out.println("Addition="+c);
  }
  public static void main(String arg[])
  {
     add(11,22);
     Demo.add(11,55);
     Demo ob=new Demo();
     ob.add(11,33);
  }
}