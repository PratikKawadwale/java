import java.io.*;
class FileDemo
{
  public static void main(String arg[])throws Exception
  {
    File f1=new File("d:\\tybcs");
    if(f1.isDirectory())
    {
      String s1[]=f1.list();
      for(int i=0;i<s1.length;i++)
      {
        String fname=s1[i];
        if(fname.endsWith(".java"))
        System.out.println(s1[i]);
      }
    }
  }
}
