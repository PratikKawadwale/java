/* Define an abstract class staff with protected members id and name . Define a parameterised constructor . Define one subclass officestaff with member department create n objects of officestaff and display all details */
import java.util.*;
abstract class staff 
{
   int id;
   String name;
   staff(int id,String name)
   {
     this.id=id;
     this.name=name;
   }
}
class officestaff extends staff
{
  String dept;
  officestaff(int id,String name,String dept)
  {
    super(id,name);
    this.dept=dept;
  }
  void disp()
  {
    System.out.println("Staff id="+id);
    System.out.println("Name="+name);
    System.out.println("Department="+dept);
  }
}
class MD
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter limit:");
    int n=sc.nextInt();
    officestaff ob[]=new officestaff[n];
    for(int i=0;i<n;i++)
    {
      System.out.println("Enter id");
      int id=sc.nextInt();
      System.out.println("Enter name:");
      String name=sc.next();
      System.out.println("Enter dept:");
      String dept=sc.next();
      ob[i]=new officestaff(id,name,dept);
    }
    for(int i=0;i<n;i++)
    {
      ob[i].disp();
    }
  }
}
