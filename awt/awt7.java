import java.awt.*;
import java.awt.event.*;
class ListDemo extends Frame implements ActionListener
{
  Label l1,l2;
  TextField t1;
  List lst;
  Button b1,b2,b3;
  ListDemo()
  {
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());
    l1=new Label("Enter Product:");
    l2=new Label("All Product");
    t1=new TextField(10);
    lst=new List(10);
    b1=new Button("Add");
    b2=new Button("Remove");
    b3=new Button("Remove All");
    add(l1);add(t1);add(l2);add(lst);add(b1);add(b2);add(b3);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    {
      String s1=t1.getText();
      lst.add(s1);
    }
    if(ae.getSource()==b2)
    {
      lst.remove(lst.getSelectedItem());
      }
    if(ae.getSource()==b3)
    {
       lst.clear();
    }
  }
  public static void main(String arg[])
  {
    ListDemo ob=new ListDemo();
  }
}
