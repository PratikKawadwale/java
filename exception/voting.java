/* write a program to check whether given candidate is eligible for voting or not. Handle user defined as well as system defined Exception */
import java.util.*;
class VotingException extends Exception
{
   public String toString()
   {
     return "candidate is not Eligible for voting..!!";
   }
}
class VoteDemo
{
   public static void main(String arg[])
   {
      try
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        if(age<18)
          throw new VotingException();
      
         System.out.println("You are Eligible for voting Age="+age); 
      }
      catch(VotingException e)
      {
        System.out.println("User Error="+e);
      }
      catch(Exception e1)
      {
        System.out.println("System Error="+e1);
      }
   }
}
