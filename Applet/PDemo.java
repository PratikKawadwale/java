import java.applet.*;
import java.awt.*;
public class PDemo extends Applet
{
   int no1,no2,ans;
   public void init()
   {
      no1=Integer.parseInt(getParameter("a"));
      no2=Integer.parseInt(getParameter("b"));
      ans=no1+no2; 
   }
   public void paint(Graphics g)
   {
       g.drawString("Addition="+ans,100,100);
    }
}
/*
 <html>
    <body>
        <applet code="PDemo"  width="400" height="500">
           <param name="a" value="10">
	   </param>
	   <param name="b" value="20">  
	   </param>
      </applet>
   </body>
 </html>
*/