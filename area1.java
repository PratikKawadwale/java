/*write a java  programe to calculate are of circle,Triangle and rectangle(use method overloading)*/
 class Demo
{
  void area(float r)
  {
      float a=3.14f*r*r;
      System.out.println("Area of circle="+a);
  }
  void area(float l,float b)
  {
      float a=l*b;
      System.out.println("Area of rectangle="+a);
 }
 void area(double b,double h)
  {
      double a=0.5*b*h;
      System.out.println("Area of rectangle="+a);
 }
public static void main(String arg[])
{
  Demo ob=new Demo();
   ob.area(10.3,55.4);
   ob.area(6.3f,5.14f);
   ob.area(4.5f);
}
}