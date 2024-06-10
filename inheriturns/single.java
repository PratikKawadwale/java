//single inhereturns
class A
{
 A()
 {
   System.out.println("I am base A");
 }
}
class B extends A
{
  B()
  {
    System.out.println("I am Derived B");
  }
}
class mdemo
{
  public static void main(String arg[])
  {
    B ob=new B();
  }
}
