//final keyword use
class A
{
  final void add(int a,int b)
  {
    int c=a+b;
    System.out.println("Addition1="+c);
  }
}
class B extends A
{
  void add(int a,int b)
  {
         int c=a+b;
    System.out.println("Addition2="+c);
  }
}
class MD
{
  public static void main(String arg[])
  {
     A ob=new A();
     ob.add(11,22);
     B ob1=new B();
     ob1.add(15,35);
  }
}
//Error ahe final method can not be override
