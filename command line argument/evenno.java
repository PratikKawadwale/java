//write a program to display all the even no from an array (use command line arguments)
class EvenDemo
{
  public static void main(String arg[])
  {
    System.out.println("Enter nos:");
    for(int i=0;i<arg.length;i++)
    {
      int n=Integer.parseInt(arg[i]);
      if(n%2==0)
      System.out.print(n+"  ");
    }
  }
}//java EvenDemo 11 22 44 66
