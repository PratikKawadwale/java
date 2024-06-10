//Define an interface integer with a abstract method check() write a java program to check whether a given no is positive or negative
import java.util.*;
interface Integer
{
  void check(int n);
}
class Demo implements Integer
{
  public void check(int n)
  {
    if(n>0)
     System.out.println("Number is positive");
    else
     System.out.println("Number is Negitive");
  }
}
class MD
{
  public static void main(String arg[])
  {
    Demo ob=new Demo();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number:");
    int n=sc.nextInt();
    ob.check(n);
  }
}
