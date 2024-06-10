//
import java.util.*;
class college
{
  int cno;
  String cname;
  Scanner sc=new Scanner(System.in);
  void acceptc()
  {
     
     System.out.println("Enter college no:");
     cno=sc.nextInt();
     System.out.println("Enter college name:");
     cname=sc.next();
   }
   void dispc()
   {
     System.out.println("College no="+cno);
     System.out.println("College name="+cname);
   }
}
class student extends college
{
  int rno;
  String sname;
  float per;
  void accept()
  {
     System.out.println("Enter roll no:");
     rno=sc.nextInt();
     System.out.println("Enter name:");
     sname=sc.next();
     System.out.println("Enter per:");
     per=sc.nextFloat();
  }
  void disp()
   {
     System.out.println("Roll no="+rno);
     System.out.println("sname="+sname);
     System.out.println("per="+per);
   }
}
class teacher extends college
{
   int tno;
   String tname;
   float sal;
   void accept()
   { 
     System.out.println("Enter teacher no:");
     tno=sc.nextInt();
     System.out.println("Enter name:");
     tname=sc.next();
     System.out.println("Enter sal:");
     sal=sc.nextFloat();
    }
    void disp()
    {
      System.out.println("Enter teacher no:"+tno);
      System.out.println("name:"+tname);
      System.out.println("sal:"+sal);
    }
}
class MD
{
  public static void main(String arg[])
  {
    student ob=new student();
    ob.acceptc();
    ob.accept();
    ob.dispc();
    ob.disp();
    teacher ob1=new teacher();
    ob1.acceptc();
    ob1.accept();
    ob1.dispc();
    ob1.disp();
  }
}
