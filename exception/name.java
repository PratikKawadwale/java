//invalid name
import java.util.*;
class InvalidNameException extends Exception
{
   public String toString()
   {
     return "Invalid Name";
   }
}
class Demo
{
  public static void main(String arg[])
  {
    try
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter name:");
      String s=sc.next();
      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        //if(!character.isAlphabetic(ch))
        if(!((ch>='A' && ch<='Z')||(ch>='a' &&ch<='z')))
        throw new InvalidNameException();
      }
      System.out.println("Name="+s);
    }
    catch(Exception e)
    {
      System.out.println("Error="+e);
    }
  }
}
