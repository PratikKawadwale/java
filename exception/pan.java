/* write a java program to validate PAN Number and Moblie Number . If It Is invalid then throw user defined Exception. Invalid Data,o.w diplay it pan=AAAAA1111A */
import java.util.*;
class InvalidDataException extends Exception
{
  public String toString()
  {
    return "Invalid pan Number or mobile Number";
  }
}
class PanDemo
{
  public static void main(String arg[])
  {
    try
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter pan number");
      String pan=sc.next();
      int i;
      for(i=0;i<5;i++)
      {
        if(!Character.isUpperCase(pan.charAt(i)))
        throw new InvalidDataException();
      }
      for(i=5;i<9;i++)
      {
         if(!Character.isDigit(pan.charAt(i)))
         throw new InvalidDataException();
      }
      if(!Character.isUpperCase(pan.charAt(9)))
      throw new InvalidDataException();
      
      System.out.println("Enter mobile Number:");
      String mob=sc.next();
       if(mob.length()!=10)
         throw new InvalidDataException();
    for(i=0;i<9;i++)
    {
      if(!Character.isDigit(mob.charAt(i)))
      throw new InvalidDataException();
    }
    System.out.println("pan Number="+pan);
    System.out.println("Mobile Number="+mob);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
