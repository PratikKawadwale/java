//emp data  using parametric construct display
class Emp
{
  int eno;
  String ename;
  float sal;
  Emp(int eno,String ename,float sal)
  {
    this.eno=eno;
    this.ename=ename;
    this.sal=sal;
  }
  void disp()
  {
    System.out.println("Emp no="+eno);
    System.out.println("Emp name="+ename);
    System.out.println("Emp salary="+sal);

  }
public static void main(String arg[])
  {
     Emp ob=new Emp(1,"om",500000);
     ob.disp();
  }
}
