//write a java program to display each word from a file in reverse order
import java.io.*;
class Demo
{
  public static void main(String arg[])throws Exception
  {
    FileReader f1=new FileReader("file.java");
    BufferedReader br=new BufferedReader(f1);
    String s1="";
    while((s1=br.readLine())!=null)
    {
      String s2[]=s1.split("");
      for(int i=0;i<s2.length;i++)
      {
        StringBuffer sbr=new StringBuffer(s2[i]);
        sbr.reverse();
        System.out.print(sbr+" ");
      }
      System.out.println();
    }
    f1.close();
  }
}
