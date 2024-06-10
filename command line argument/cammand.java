//commond line argument
class Emp
{
  public static void main(String arg[])
  {
    int eno=Integer.parseInt(arg[0]);
    String name=arg[1];
    float sal=Float.parseFloat(arg[2]);
    System.out.println("Emp no="+eno);
    System.out.println("Emp name="+name);
    System.out.println("Emp sal="+sal);
  }
}
//run cammand java Emp 101 om 230000
