//write a java program to count no of digit,spaces and character from a file
import java.io.*;
class Demo
{
  public static void main(String arg[])throws Exception
  {
    FileInputStream f1=new FileInputStream("abc.txt");
    int k,d=0,ch=0,sp=0,sym=0;
    while(true)
    {
      k=f1.read();
      if(k==-1)
        break;
      if(k>='0' && k<='9')
       d++;
      else if((k>='A' && k<='Z')||(k>='a' && k<='z'))
       ch++;
     else if(k==' ')
       sp++;
     else
       sym++;
    }
    System.out.println("No of Digit="+d);
    System.out.println("No of spaces="+sp);
    System.out.println("No of char="+ch);
    System.out.println("No of symbol="+sym);
    f1.close();
  }
}
