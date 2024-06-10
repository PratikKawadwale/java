//substring
import java.util.*;
class Demo
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");
    String s1=sc.nextLine();
    String s2=s1.substring(4,7);
    String s3=s1.substring(4);
    System.out.println("String="+s2);
    System.out.println("String="+s3);
    }
}
