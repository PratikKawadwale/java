/* create an emp class(eno,name,deptname,sal) define the default and parametrised constructors use 'this' keywords to initialize instance variables keep a count of object create object using parameterised constructor and display the object count after each object is created using static member and method .also display the contents of each object*/
class Employee
{
  static int cnt=0;
  int id;
  String name,dept;
  float sal;
  Employee()
  {
    cnt++;
    id=1;
    name="sai";
    dept="computer";
    sal=500000;
  }
  Employee(int id,String name,String dept,float sal)
  {
    cnt++;
    this.id=id;
    this.name=name;
    this.dept=dept;
    this.sal=sal;    
  }
  void disp()
  {
    System.out.println("\n object count="+cnt);
    System.out.println("\n Employee id="+id);
    System.out.println("\n Employee name="+name);
    System.out.println("\n Employee department="+dept);
    System.out.println("\n Employee salary="+sal);
  }
  public static void main(String arg[])
  {
    Employee ob=new Employee();
    ob.disp();
    Employee ob1=new Employee(105,"om","sci",506040);
    ob1.disp();
    Employee obj=new Employee(10,"sai","account",40000);
    obj.disp();
  }
} 
