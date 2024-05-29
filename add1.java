class Demo
{
  static void add(int a,int b)
  {
    int c=a+b;
     System.out.println("Addition="+c);
  }
 static void square(int n)
  {
      int c=n*n;
      System.out.println("square="+c);
  }
 public static void main(String arg[])
  {
  Demo ob=new Demo();
  ob.add(111,322);
   add(11,22);
  Demo.add(100,200);
  ob.square(5);
}
}