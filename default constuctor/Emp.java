//emp data default construct
class Emp
{
  int eno;
  String ename;
  float sal;
  Emp()
  {
    eno=101;
    ename="sai";
    sal=7800044;
    System.out.println("Emp no="+eno);
    System.out.println("Emp name="+ename);
    System.out.println("Emp salary="+sal);
  }
  public static void main(String arg[])
  {
     Emp ob=new Emp(); 
  }
}
