import java.awt.*;
class Demo extends Frame
{
  Label l1;
  Checkbox c1,c2,c3,c4,c5;
  Button b1;
 Demo()
  {
      setVisible(true);
      setSize(500,500);
      
    setLayout(new GridLayout(7,1));
    c1=new Checkbox("java");
    c2=new Checkbox("PHP");
    c3=new Checkbox("TCS");
    c4=new Checkbox("Python");
    c5=new Checkbox("Ds");
    l1=new Label("Select Subject:");
    b1=new Button("Submit");
    add(l1); add(c1); add(c2); add(c3); add(c4); add(c5);
    add(b1);
  }
  public static void main(String arg[])
   {
      Demo ob=new Demo();
   }
}
