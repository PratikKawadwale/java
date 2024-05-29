class Demo
{
  static int a=1;
 void show()
  {
     a++;
  System.out.println("value of a="+a);
  }
public static void main(String arg[])
  {
    Demo ob=new Demo();
    ob.show();
    Demo ob1=new Demo();
   ob1.show();
   Demo ob2=new Demo();
   ob2.show();
    }
}