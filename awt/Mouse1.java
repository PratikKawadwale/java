import java.awt.*;
import java.awt.event.*;
class Fdemo extends Frame
{
  TextField t1;
  Fdemo()
   {
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());
    t1=new TextField(20);
    add(t1);
    addMouseListener(new MouseAdapter()
    {
      public void mouseClicked(MouseEvent me)
      {
        t1.setText("x="+me.getX()+"y="+me.getY());
      }
    }
    );
  }
  public static void main(String arg[])
  {
    new Fdemo();
  }
}
