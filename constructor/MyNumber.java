/*Define a class MyNumber having one private int data member write a default constructor to initialize it to 0 and another constructor to initialize it to a value (use this).write methods isNegative,isPositive,isZero,isOdd,isEven. create an object in main*/
class MyNumber
{
  private int n;
  MyNumber()
  {
    n=0;
  }
  MyNumber(int n)
  {
    this.n=n;
  }
  int isNegative()
  {
     if(n<0)
      return 1;
     else
      return 0;
  }
  boolean isPositive()
  {
    if(n>0)
     return true;
    else
     return false;
  }
   boolean isZero()
  {
    if(n==0)
     return true;
    else
     return false;
  }
   boolean isOdd()
  {
    if(n%2==1)
     return true;
    else
     return false;
  }
  boolean isEven()
  {
    if(n%2==0)
     return true;
    else
     return false;
  }
  public static void main(String arg[])
  {
    MyNumber ob=new MyNumber();
    if(ob.isNegative()==1)
    System.out.println("Number is -tive");
    if(ob.isPositive())
    System.out.println("Number is +tive");
    if(ob.isZero())
    System.out.println("Number is Zero");
    if(ob.isOdd())
    System.out.println("Number is Odd");
    if(ob.isEven())
    System.out.println("Number is Even");
    
    System.out.println("colling pc");
    MyNumber ob1=new MyNumber(5);
    if(ob1.isNegative()==1)
    System.out.println("Number is -tive");
    if(ob1.isPositive())
    System.out.println("Number is +tive");
    if(ob1.isZero())
    System.out.println("Number is Zero");
    if(ob1.isOdd())
    System.out.println("Number is Odd");
    if(ob1.isEven())
    System.out.println("Number is Even");
  }
}
