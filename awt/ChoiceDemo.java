import java.util.*;
import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
  TextField t1;
  Label l1,l2,l3;
  Button b1;
  Demo()
  {
    setVisible(true);
    setSize(600,500);
    setLayout(new GridLayout(5,1));//GridLayout la row col chi value dili
    l1=new Label("Enter User:");
    l2=new Label("Grid MSG:");
    l3=new Label("Date & Time:");
    t1=new TextField(10);
    b1=new Button("Ok");
    add(l1);add(t1);
    add(l2);add(l2);
    add(b1);
    b1.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    {
      String s1=t1.getText();
      Date d1=new Date();
      int hr=d1.getHours();
      if(hr>=12 && hr<=17)
        l2.setText("Greet MSG=Good Afternoon"+s1);
      else if(hr>17 && hr<=20)
        l2.setText("Greet MSG=Good Evening"+s1);
      else if(hr>20 && hr<=24)
        l2.setText("Greet MSG=Good Night"+s1);
     else
        l2.setText("Greet MSG=Good Mornings"+s1);
    
     l3.setText("Date & Time:"+d1);
    }
  }
  public static void main(String arg[])
  {
    new Demo();
  }
}
