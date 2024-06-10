//splito string
  
class Demo
{
  public static void main(String arg[])
  {
    String s1="java,php,python,c,ds";
    String s2[]=s1.split(",");
    for(int i=0;i<s2.length;i++)
    
    System.out.println("String="+s2[i]);
    
    }
}
