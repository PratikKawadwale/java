/* write a menu driven program to perform the following operations
1-calculate the valueme of cylinder(valume:pi*r**2*h)
2-find the factorial of given no
3-check the no is armstrong or not 
4-exit*/
import java.util.*;
class demo
{
    void volume(float r, float h)
    {
       float v=3.14f*r*r*h;
       System.out.println("volume of cylinder="+v);
    }
   void factorial(int n)
  {
     int f=1;
    for(int i=1;i<=n;i++)
   {
      f=f*i;
   }
   System.out.println("Factorial="+f);
   }
void armstrong(int n)
  { 
     int n1=n;
     int s=0;
     while(n>0)
     {
          int d=n%10;
                 s=s+(d*d*d);
                  n=n/10;
     }
      if(s==n1)
       System.out.println("number is armstrong");
     else
        System.out.println("number is not armstrong");
  }
public static void main(String arg[])
{
   demo ob=new demo();
  Scanner sc=new Scanner(System.in);
  int ch;
 do
{
  System.out.println("i-volume of cylinder \n2-factorial \n3-armstrong \n4-Exist");
  System.out.println("Enter choice");
  ch=sc.nextInt();
  switch(ch)
  {
      case 1:System.out.println("Enter redius");
                  float r=sc.nextFloat();
		  System.out.println("Enter Height");
                  float h=sc.nextFloat();
		  ob.volume(r,h);
		  break;
      case 2:System.out.println("Enter number");
		  int n=sc.nextInt();
		  ob.factorial(n);
		  break;
      case 3:System.out.println("Enter number");
		  n=sc.nextInt();
                   ob.armstrong(n);
		  break;
      case 4:System.exit(0);
  }
}while(ch<5);
}
}
