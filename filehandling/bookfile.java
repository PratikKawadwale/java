/* Accept the names of two files and copy the contents of the first to the second. First file having Book name and Author name in file. Seconds file having the contents of first file and also add the comment 'end of file' at the end */
import java.io.*;
import java.util.*;
class Demo
{
  public static void main(String arg[])throws Exception
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter source File:");
    String s1=sc.nextLine();
    System.out.println("enter Destination File:");
    String s2=sc.nextLine();
      FileReader f1=new FileReader(s1);
      FileWriter f2=new FileWriter(s2);
    BufferedReader br=new BufferedReader(f1);
    BufferedWriter bw=new BufferedWriter(f2);
    String s="";
    while((s=br.readLine())!=null)
    {
      bw.write(s+"\n");
    }
    bw.write("Comment:END OF FILE");
  br.close();
  bw.close();
  f1.close();
  f2.close();
  System.out.println("File copy succesfully");
  }  
}
