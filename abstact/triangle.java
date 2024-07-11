//create abstract class shape with abstact method area().write a java program to calculate area of rectriangle and triangle (inherit shap class rectriangle and triangle)
import java.util.*;
abstract class Shape
{
  Scanner sc=new Scanner(System.in);
  abstract void area();
}
class Rectangle extends Shape
{
  void area()
  {
    System.out.println("Enter length & breath");
    float l=sc.nextFloat();
    float b=sc.nextFloat();
    float a=l*b;
    System.out.println("Area of Rectangle="+a);
    }
}
class Triangle extends Shape
{
  void area()
  {
    System.out.println("Enter base and height");
    float b=sc.nextFloat();
    float h=sc.nextFloat();
    float a=0.5f*b*h;
    System.out.println("Area of triangle="+a);
  }
}
class MD
{
  public static void main(String arg[])
  {
    Rectangle ob=new Rectangle();
    ob.area();
    Triangle ob1=new Triangle();
    ob1.area();
  }
}
