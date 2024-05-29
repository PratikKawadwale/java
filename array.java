//accept n no in array and display 
import java.util.*;
class Demo
{
   public static void main(String arg[])
    {
   // datatype array name[]=new datatype [size];
    int a[]=new int[10];
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter limit");
   int n=sc.nextInt();
   System.out.println("Enter no:");
   for(int i=0;i<n;i++)
   {
   a[i]=sc.nextInt();
   }
  System.out.println("Numbers:");
  for(int i=0;i<n;i++)
  {
     System.out.println(a[i]+" ");
  }
}
}