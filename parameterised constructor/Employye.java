//create a class emp accept value from user passing to the paramatrised construct and display 
import java.util.*;
class Employye
{
  int eno;
  String ename;
  float sal;
  Employye(int eno,String ename,float sal)
  {
    this.eno=eno;
    this.ename=ename;
    this.sal=sal;
    }
  void disp()
  {
    System.out.println("emp no="+eno);
    System.out.println("emp name="+ename);
    System.out.println("emp sal="+sal);

   }
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter emp no=");
    int eno=sc.nextInt();
    System.out.println("Enter emp name=");
    String ename=sc.next();
    System.out.println("Enter emp salary=");
    float sal=sc.nextFloat(); 
    Employye ob=new Employye(eno,ename,sal);
    ob.disp();
  }
}
