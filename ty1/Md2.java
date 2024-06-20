import series.*;
import java.util.Scanner;
class Md
{ 
    public static void main(String arg[])
     {
        fibonacci ob=new fibonacci();
       square ob1=new square();
       cube ob2=new cube();

       Scanner sc=new Scanner(System.in);
	System.out.println("Enter limit:");
	int n=sc.nextInt();
  	ob.print(n);
        ob1.print(n);
	ob2.print(n);
    }
}