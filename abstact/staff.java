/*Define an abstract class staff with member name and address. Define two sub classes full_time_staff(Department salary) and partTimeStaff(no.ofHours,ratePerHours) Define appropriate consructor create n object which clude be bof either Fulltime Staff or parttimeStaff class by asking the users choice choice.display details of FulltimeStaff and partTimeStaff */
import java.util.*;
abstract class Staff
{
  String name,add;
  abstract void disp();
}
class FullTimeStaff extends Staff
{
  String dept;
  int sal;
  FullTimeStaff(String name,String add,String Dept,int sal)
  {
     this.name=name;
     this.add=add;
     this.dept=dept;
     this.sal=sal;
  }
  void disp()
  {
    System.out.println("Staff name="+name);
    System.out.println("Staff address="+add);
    System.out.println("Staff department="+dept);
    System.out.println("Staff salary="+sal);
  }
}
class PartTimeStaff extends Staff
{
  int hours,rate;
  PartTimeStaff(String name,String add,int hours,int rate)
  {
     this.name=name;
     this.add=add;
     this.hours=hours;
     this.rate=rate;
  }
  void disp()
  {
    System.out.println("Staff name="+name);
    System.out.println("Staff address="+add);
    System.out.println("rate per hours="+hours);
    System.out.println("salary="+rate);
  }
}
class MD
{
  public static void main(String arg[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter limit:");
     int n=sc.nextInt();
     
     FullTimeStaff ob[]=new FullTimeStaff[n];
     PartTimeStaff ob1[]=new PartTimeStaff[n];
     
     int ch;
     do{
      System.out.println("Enter choice \n 1-FullTime\n2-PartTime");
      ch=sc.nextInt();
      switch(ch)
      {
        case 1:for(int i=0;i<n;i++)
                {
                  System.out.println("Enter name:");
                  String name=sc.next();
                  System.out.println("Enter Add:");
                  String add=sc.next();
                  System.out.println("Enter Department:");
                  String dept=sc.next();
                  System.out.println("Enter salary:");
                  int sal=sc.nextInt();
                  ob[i]=new FullTimeStaff(name,add,dept,sal);
                }
                for(int i=0;i<n;i++)
                {
                  ob[i].disp();
                }
                break;
       case 2:for(int i=0;i<n;i++)
              {
                System.out.println("Enter name:");
                String name=sc.next();
                System.out.println("Enter add:");
                String add=sc.next();
                System.out.println("Enter no of hours:");
                int hr=sc.nextInt();
                System.out.println("Enter rate pr hours:");
                int rate=sc.nextInt();
                ob1[i]=new PartTimeStaff(name,add,hr,rate);
              }
              for(int i=0;i<n;i++)
              {
                 ob1[i].disp();
              }
              break;
      }
     }while(ch<3);
  }
}
