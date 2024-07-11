import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ImgDemo extends Applet implements ItemListener
{
   Choice c1;
   Image img;
   public void init()
    {
       c1=new Choice();
	c1.add("banner1");
	c1.add("logo");
	c1.add("pk");
        add(c1);
c1.addItemListener(this);
    }
public void itemStateChanged(ItemEvent ie)
{
   if(ie.getSource()==c1)
   {
       String s1=c1.getSelectedItem();
       img=getImage(getDocumentBase(),s1+".jpg");
       repaint();
  }
}
  public void paint(Graphics g)
  {
      g.drawImage(img,500,500,this);
   }
}
/* <applet code="ImgDemo" width="600" height="500">
  </applet> */