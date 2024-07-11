import java.awt.*;
import java.applet.*;
public class GraphicsDemo extends Applet
{
  public void paint(Graphics g)
  {
      g.drawString("Welcome to java",150,10);
       g.drawLine(10,20,300,500);//x1,y1,x2,y2
       g.drawRect(100,50,100,300);//x,y,width,height
        g.fillRect(250,50,100,300);////x,y,width,height
       g.drawRoundRect(400,50,100,300,50,70);//x,y,width,height
       g.drawOval(100,400,100,100);//x,y,width,height
        g.setColor(Color.cyan);
       g.fillArc(300,300,100,100,200,200);

     g.setColor(Color.red);
int a[]={100,550,300,600,50};
int b[]={100,120,200,300,500};
     g.drawPolygon(a,b,5);
  }
}
/* 
<applet code="GraphicsDemo" width="500" height="500">
</applet>
*/