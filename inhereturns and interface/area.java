//define an interface shape with abstract method area(); write a java program to calculate on area of circle and sphere (use final keyword)
import java.util.*;
interface Shape
{
  final float pi=3.14f;
  void area_circle(float r);
  void area_sphere(float r);
}
class Area implements Shape
{
  public void area_circle(float r)
  {
    float a=pi*r*r;
    System.out.println("Area of circle="+a);
  }
  public void area_sphere(float r)
  {
    float s=4*pi*r*r;
    System.out.println("Area of Sphere="+s);
  }
}
class Demo
{
  public static void main(String arg[])
  {
    Area ob=new Area();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter redius:");
    float r=sc.nextFloat();
    ob.area_circle(r);
    ob.area_sphere(r);
  }
}
