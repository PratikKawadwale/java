import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MM extends Applet implements MouseMotionListener 
{
    int x, y;

    public void init()
    {
        addMouseMotionListener(this);
    }

    public void update(Graphics g) 
   {
        g.fillOval(x, y, 3, 5);
    }

    public void mouseMoved(MouseEvent me) 
    {
        // Implement this method if needed
    }

    public void mouseDragged(MouseEvent me) 
     {
        x = me.getX();
        y = me.getY();
        repaint();
    }
}

/* <applet code="MM"   width="500" height="500">
</applet>
*/