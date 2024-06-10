//compare to()
import java.util.*;
class Demo
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");
    String s1=sc.nextLine();
    System.out.println("Enter String");
    String s2=sc.nextLine();
    int k=s1.compareTo(s2);
    if(k==0)
     System.out.println("Strin are same");
    else if(k>0)
     System.out.println("String1 is grater");
    else
     System.out.println("String 2 is greater");
  }
}
