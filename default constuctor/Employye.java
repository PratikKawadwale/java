//create a class emp(eno,ename,sal) accept amp information from user and display using defoult construct
import java.util.*;
class Employye
{
  int eno;
  String ename;
  float sal;
  Employye()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter emp no=");
    int eno=sc.nextInt();
    System.out.println("Enter emp name=");
    String ename=sc.next();
    System.out.println("Enter emp salary=");
    float sal=sc.nextFloat();
    System.out.println("emp no="+eno);
    System.out.println("emp name="+ename);
    System.out.println("emp sal="+sal);
  }
  public static void main(String arg[])
  {
    Employye ob=new Employye();
  }
}
