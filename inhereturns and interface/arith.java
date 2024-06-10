interface I1
{
  void add(int a,int b);
  void square(int n);
}
interface I2
{
  void cube(int n);
}
class Demo implements I1,I2
{
   public void add(int a,int b)
   {
     int c=a+b;
     System.out.println("Addition="+c);
   }
   public void square(int n)
   {
     int s=n*n;
     System.out.println("Square="+s);
   }
   public void cube(int n)
   {
     int c=n*n*n;
     System.out.println("cube="+c);
   }
}
class MD
{
  public static void main(String arg[])
  {
    Demo ob=new Demo();
    ob.add(10,20);
    ob.square(5);
    ob.cube(5);
  }
}
