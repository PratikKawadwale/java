/*create a class student (rno,name, 6 sub marks) calculate total percentage and display result */
import java.util.*;
class student
{
   int rno,m1,m2,m3,m4,m5,m6,t;
  String name;
  float p;
  void accept()
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter roll no");
    rno=sc.nextInt();
    System.out.println("Enter name:");
    name=sc.next();
    System.out.println("Six sub marks:");
    m1=sc.nextInt();
    m2=sc.nextInt();
    m3=sc.nextInt();
    m4=sc.nextInt();
    m5=sc.nextInt();
    m6=sc.nextInt();
  }
void calculate()
{
   t=m1+m2+m3+m4+m5+m6;
   p=(float)t/6;
}
void display()
{
  System.out.println("Roll no="+rno);
  System.out.println("Name="+name);
  System.out.println("Total marks="+t);
  System.out.println("Percentage="+p);
}
public static void main(String arg[])
{
   student ob=new student();
   ob.accept();
   ob.calculate();
   ob.display();
}
}