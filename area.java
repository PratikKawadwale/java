/*the calculate area of circle rectangle square using differnt function*/
class area
{
  float a;
  void circle(float r)
  {
        a=3.14f*r*r;
	     System.out.println("Area of circle="+a);
   }
  void rectangle(float l,float b)
  {
     a=l*b;
      System.out.println("Area of rectangle="+a);
  }
 void square(float s)
  { 
     a=s*s;
   System.out.println("Area of square="+a);
  }
 public static void main(String arg[])
 {
   area ob;
   ob=new area();
  ob.square(5.5f);
  ob.rectangle(5.5f,3.5f);
  ob.circle(4.8f);
  }
}