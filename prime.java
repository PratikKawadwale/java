import java.util.*;
class PrimeDemo
{
  public static void main(String arg[])
  {
    int i,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    n=sc.nextInt();
    for(i=2;i<n;i++)
    {
      if(n%i==0)
	break;
   }
	if(i==n)
	System.out.print("Number is prime");
	else
         System.out.print("Number is not prime");
  }
}