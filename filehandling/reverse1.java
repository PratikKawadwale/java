//write a java program to display contents of a file in reverse order
import java.io.*;
class Demo
{
  public static void main(String arg[])throws Exception
  {
    FileReader f1=new FileReader("abc.txt");
    BufferedReader br=new BufferedReader(f1);
    String s1="";
    StringBuffer sbr=new StringBuffer();
    while((s1=br.readLine())!=null)
    {
      sbr.append(s1+"\n");
    }
    sbr.reverse();
    System.out.println(sbr);
    f1.close();
  }
}
