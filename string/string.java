/*write a java program to display all the vowel from a given string*/
import java.util.*;
class Demo
{
  public static void main(String arg[])
  {
    String s1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string:");
    s1=sc.nextLine();
    System.out.println("vowels=");
    for(int i=0;i<s1.length();i++)
    {
      if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='u' || s1.charAt(i)=='o'|| s1.charAt(i)=='i')
      {
        System.out.print(s1.charAt(i));
      }
    }
  }
}
