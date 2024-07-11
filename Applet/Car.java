import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Car extends Applet implements ActionListener
{
   int i=0;
Button b1,b2;
public void init()
{
  setLayout(new FlowLayout());
  b1=new Button("next");
  b2=new Button("exit");
  add(b1);
  add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void paint(Graphics g)
{
  g.drawRect(100+i,100,100,50);
  g.fillOval(120+i,150,30,30);
  g.fillOval(150+i,150,30,30);
}
public void actionPerformed(ActionEvent ae)
{
  if(ae.getSource()==b1)
  {
      i=i+10;
      repaint();
   }
   if(ae.getSource()==b2)
   {
      stop();
    }
}
}
/*
<applet code="Car"  width="500" height="500">
</applet>
*/