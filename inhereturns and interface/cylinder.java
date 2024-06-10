import java.util.*;
interface operation
{
  float pi=3.14f;
  void area(float r,float h);
}
class Cylinder implements operation
{
  public void area(float r,float h)
  {
    float a=2*pi*r*(r+h);
    System.out.println("Area="+a);
  }
  public void volume(float r, float h)
  {
    float v=pi*(r*r)*h;
    System.out.println("Volume="+v);
  }
}
class Demo
{
  public static void main(String arg[])
  {
     Cylinder ob=new Cylinder();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter redius:");
     float r=sc.nextFloat();
     System.out.println("Enter Height:");
     float h=sc.nextFloat();
     ob.area(r,h);
     ob.volume(r,h);
  }
}
