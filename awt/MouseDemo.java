import java.awt.*;
import java.awt.event.*;
class MouseDemo extends Frame implements MouseListener
{
  TextField t1;
  MouseDemo()
  {
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());
    t1=new TextField(20);
    add(t1);
    addMouseListener(this);
  }
  public void mouseClicked(MouseEvent me)
  {
    t1.setText("Mouse Click event zala..");
  }
 public void mousePressed(MouseEvent me)
  {
    t1.setText("Mouse Pressed..");
  }
 public void mouseReleased(MouseEvent me)
  {
    t1.setText("Mouse Released..");
  } 
 public void mouseEntered(MouseEvent me)
  {
    t1.setText("Mouse Entered..");
  } 
   public void mouseExited(MouseEvent me)
  {
    t1.setText("Mouse Exited..");
    //dispose();
  } 
  public static void main(String arg[])
  {
     new MouseDemo();
  }
}
