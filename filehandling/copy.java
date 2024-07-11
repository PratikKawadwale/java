//copy file program
import java.io.*;
import java.util.*;
class Demo
{
  public static void main(String arg[])throws Exception
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter String:");
     String s1=sc.nextLine();
     FileOutputStream f1=new FileOutputStream("cdj.txt");
     for(int i=0;i<s1.length();i++)
     {
       int ch=s1.charAt(i);
       f1.write(ch);
     }
     f1.close();
     System.out.println("File copy succesfully");
  }
}
