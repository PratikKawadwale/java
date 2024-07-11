/* create an abstract class "order" having member ,id,description  create two subclasses "purchase order" & "sales order" having member customer name & vender name respectively . Define methods accepts and display in all case . create 3 objects each of purchase order and sales order and accept and display details */
import java.util.*;
abstract class order
{
  Scanner sc=new Scanner(System.in);
  int id;
  String description;
  abstract void accept();
  abstract void disp();
}
class parchaseorder extends order 
{
  String cname;
  void accept()
  {
    System.out.println("sales order purchase id ");
    id=sc.nextInt();
    System.out.println("order description");
    description=sc.next();
    System.out.println("Enter cust name");
    cname=sc.next();
  }
  void disp()
  {
     System.out.println("sales order purchase id "+id);
     System.out.println("order description"+description);
     System.out.println("Enter cust name"+cname);
  }
}
class salesorder extends order
{
  String vname;
   void accept()
   {
        System.out.println("Enter sales order ID: ");
        id = sc.nextInt();
        System.out.println("Enter order description: ");
        description = sc.next();
        System.out.println("Enter vendor name: ");
        vname = sc.next();
    } 
      void disp()
      {
        System.out.println("Sales Order ID: " + id);
        System.out.println("Order Description: " + description);
        System.out.println("Vendor Name: " + vname);
    }
}
class MD
{
    public static void main(String[] args) 
    {
      parchaseorder ob1=new parchaseorder();
      parchaseorder ob2=new parchaseorder();
      parchaseorder ob3=new parchaseorder();
      
      ob1.accept();
      ob2.accept();
      ob3.accept();
      
      ob1.disp();
      ob2.disp();
      ob3.disp();
      
      salesorder ob4=new salesorder();
      salesorder ob5=new salesorder();
      salesorder ob6=new salesorder();
      
      ob4.accept();
      ob5.accept();
      ob6.accept();
      
      ob4.disp();
      ob5.disp();
      ob6.disp();
    }
}
