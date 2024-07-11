import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class LineDemo1 extends Applet implements MouseListener
{
   int x1,y1,x2,y2;
  public void init()
  {
     addMouseListener(this);
   }
public void mousePressed(MouseEvent me)
{
   x1=me.getX();
   y1=me.getY();
}
public void mouseReleased(MouseEvent me)
{
   x2=me.getX();
   y2=me.getY();
   repaint();
}
  public void mouseClicked(MouseEvent me){}
  public void mouseEntered(MouseEvent me){}
  public void mouseExited(MouseEvent me){}
  public void update(Graphics g)
  {
     g.drawRect(x1,y1,x2-x1,y2-y1);
   }
}
/*
<applet code="LineDemo1.class" width="500" height="500">
</applet>
*/