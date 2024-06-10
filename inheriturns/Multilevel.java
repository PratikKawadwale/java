//Multilevel inhereturns
class A
{int x,y,z;
 A()
 {
   x=11;
   System.out.println("I am base A");
 }
}
class B extends A
{
  B()
  {
    y=55;
    System.out.println("I am Intermediate B");
  }
}
class C extends B
{
  C()
  {
    z=22;
    System.out.println("I am Derived C");
    System.out.println("Addition="+(x+y+z));
  }
}

class mdemo
{
  public static void main(String arg[])
  {
    C ob=new C();
  }
}
