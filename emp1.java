/*create a class emp(eno,name,sal) accept employe information from user and display*/
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
void disp()
{
   System.out.println("Emp no="+eno);
   System.out.println("Emp no="+ename);
   System.out.println("Emp no="+sal);
}
public static void main(String arg[])
{
   emp ob=new emp();
   ob.accept(101,"om",50000);
   ob.disp();
}
}