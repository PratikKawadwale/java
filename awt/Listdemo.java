/* Write a java program to accept directory name in TextField and Display list of files and subdirectories in list control from that directory by clicking on Button */
import java.io.*;
import java.awt.*;
import java.awt.event.*;
class ListDemo extends Frame implements ActionListener
{
  Label l1,l2;
  TextField t1;
  List lst;
  Button b1;
  ListDemo()
  {
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());
    l1=new Label("Enter Directory:");
    l2=new Label("All Files & sub-Directory:");
    t1=new TextField(10);
    lst=new List(10);
    b1=new Button("Ok");
    add(l1);add(t1);
    add(l2);add(lst);
    add(b1);
  b1.addActionListener(this);  
  }
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    {
      lst.clear();
      String s1=t1.getText();
      File f1=new File(s1);
      if(f1.exists())
      {
        String s2[]=f1.list();
        for(int i=0;i<s2.length;i++)
         lst.add(s2[i]);
      }
      else
        lst.add("Directory Not Found..");
    }
  }
  public static void main(String arg[])
  {
    new ListDemo();
  }
}
