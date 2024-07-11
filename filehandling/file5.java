import java.io.*;
class FileDemo
{
  public static void main(String arg[])throws Exception
  {
    File f1=new File("d:\\cdjrbnb");
    if(f1.isDirectory())
    {
      int cnt=0;
      String s1[]=f1.list();
      for(int i=0;i<s1.length;i++)
      {
        String fname=s1[i];
        if(fname.endsWith(".class"))
        {
        File f2=new File(fname);
        f2.delete();
         cnt+=1;
        }
      }
      System.out.println("Number of Files to Deleted:"+cnt);
    }
  }
}
