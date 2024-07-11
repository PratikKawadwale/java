import java.io.*;
class FileDemo
{
  public static void main(String arg[])throws Exception
  {
    File f1=new File("cdj.txt");
    if(f1.exists())
    {
      System.out.println("found..");
      if(f1.isFile())
        System.out.println("It is File");
      if(f1.isDirectory())
        System.out.println("It is Folder..");
        
        if(f1.canRead())
         System.out.println("File Permission Readable..");
         
        if(f1.canWrite())
         System.out.println("File Permission Writable");
         
       System.out.println("File Name="+f1.getName());
       System.out.println("File Parent Name="+f1.getParentFile());
       System.out.println("File Full Path="+f1.getAbsolutePath());
       System.out.println("File length="+f1.length());
       //f1.delete();
    }
    else
    {
      System.out.println("not found..");
    }
  }
}
