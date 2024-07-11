import java.io.*;
class Demo
{
  public static void main(String arg[])throws Exception
  {
    FileReader f1=new FileReader(arg[0]);
    FileWriter f2=new FileWriter(arg[1]);
  BufferedReader br=new BufferedReader(f1);
  BufferedWriter bw=new BufferedWriter(f2);
   String s1="";
    while((s1=br.readLine())!=null)
    {
      bw.write(s1+"\n");
    }
    br.close();
    bw.close();
    f1.close();
    f2.close();
    System.out.println("File copy succesfully");
  }
}
//at runtime :-java Demo file1.java rbnb.txt
