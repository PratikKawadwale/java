import java.awt.*;
class FontDemo extends Frame
{
  Choice c1,c2;
  List l1;
  Button b1;
  TextArea ta;
  FontDemo()
  {
    setVisible(true);
    setSize(500,600);
    setTitle("Font Demo");
    setLayout(new FlowLayout());
    c1=new Choice();
    c1.add("Arial");
    c1.add("Gigi");
    c1.add("verdana");
    c2=new Choice();
    for(int i=10;i<=100;i++)
    {
      c2.add(""+i);
    }
    l1=new List();
    l1.add("Regular");
    l1.add("Bold");
    l1.add("Italic");
    b1=new Button("Ok");
    ta=new TextArea();
    add(c1);
    add(l1);
    add(c2);
    add(b1);
    add(ta);
  }
  public static void main(String arg[])
  {
    FontDemo ob=new FontDemo();
  }
}
