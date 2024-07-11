import java.awt.*;
class Demo extends Frame
{
 Label l1,l2,l3;
 TextField t1,t2,t3;
 Button b1,b2,b3,b4;
 Demo()
  {
      setVisible(true);
      setSize(500,400);
      setTitle("Addition Program");
      setBackground(Color.pink);
      setLocation(100,300);
      setLayout(new GridLayout(5,2));
      
      l1=new Label("Enter no 1:");
      l2=new Label("Enter no 2:");
      l3=new Label("Result:");
      
      t1=new TextField(10);
      t2=new TextField(10);
      t3=new TextField(10);
      
      b1=new Button("Addition");
      b2=new Button("Sub");
      b3=new Button("clear");
      b4=new Button("Exit");
      
      add(l1);
      add(t1);
      add(l2);
      add(t2);
      add(l3);
      add(t3);
      add(b1);
      add(b2);add(b3);add(b4);
  }
  public static void main(String arg[])
   {
      Demo ob=new Demo();
   }
}
