/*create a class emp (eno,ename,sal) accept emp information from user pass the accept() function & then display*/
import java.util.*;
class emp
{
  int eno;
  String ename;
  double sal;
  void accept(int eno1,String ename1,double s)
  {
     eno=eno1;
     ename=ename1;
     sal=s;
  }
  void display()
  {
     System.out.println("Empno="+eno);
     System.out.println("Empno="+ename);
     System.out.println("Empno="+sal);
  }
  public static void main(String arg[])
  {
    emp ob=new emp();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter emp no");
    int eno=sc.nextInt();
    System.out.println("Enter emp name");
    String ename=sc.next();
    System.out.println("Enter emp sal");
    double sal=sc.nextDouble();
    ob.accept(eno,ename,sal);
    ob.display();
  }
}

