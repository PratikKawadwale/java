/* write a java program to accept a no. from user if its Zero then throw user defined Exception "No is Zero " if it is non numeric then generate an error "No is invalid " otherwise check whether it is palindrome or not */
import java.util.*;
class NumberIsZeroException extends Exception
{
  public String toString()
  {
    return "Number is Zero Error .. !!";
  }
}
class PalDemo
{
  public static void main(String arg[])
  {
    try
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number:");
      int n=sc.nextInt();
      if(n==0)
        throw new NumberIsZeroException();
      int n1=n;
      int r=0;
      while(n>0)
      {
        int d=n%10;
        r=(r*10)+d;
        n/=10;
      }
      if(r==n1)
        System.out.println("Number is palindrome");
      else
        System.out.println("Number is not palindrome");
    }
    catch(NumberIsZeroException e)
    {
      System.out.println(e);
    }
  catch(Exception e1)
    {
      System.out.println("Number is invalid...");
    }
  }
}
