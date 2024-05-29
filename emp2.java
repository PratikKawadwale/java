/*create a class emp employe information from user password to the accept function and then display*/
import java.util.*;
class emp
{
  int eno;
  String ename;
  float sal;
void accept()
 {
    Scanner sc=new Scanner(System.in);
  System.out.println("Enter emp no:");
  eno=sc.nextInt();
  System.out.println("Enter emp name:");
  ename=sc.next();
  System.out.println("Enter Salary:");
  sal=sc.nextFloat();
}
void display()
{
   System.out.println("Emp no="+eno);
   System.out.println("Emp no="+ename);
   System.out.println("Emp no="+sal);
}
public static void main(String arg[])
{
   emp ob=new emp();
  ob.accept();
  ob.display();
}
}