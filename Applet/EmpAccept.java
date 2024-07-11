import java.awt.*;
import java.awt.event.*;
class EmpAccept extends Frame implements ActionListener
{
   Label l1,l2,l3;
   TextField t1,t2,t3;
    Button b1;
     EmpAccept()
     {
        setVisible(true);
         setSize(500,500);
         setLayout(new FlowLayout());
         l1=new Label("Enter eno:");
         l2=new Label("Enter ename:");
         l3=new Label("Enter sal:");
         t1=new TextField(10);
         t2=new TextField(10);
         t3=new TextField(10);
         b1=new Button("submit");
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(b1);
b1.addActionListener(this);
       }
public void actionPerformed(ActionEvent ae)
{
  if(ae.getSource()==b1)
  {
        int eno=Integer.parseInt(t1.getText());
        String nm=t2.getText();
        int s=Integer.parseInt(t3.getText());
       EmpDisplay ob=new EmpDisplay(eno,nm,s);    //calling Another Frame using PC
   }
}
public static void main(String arg[])
{
  EmpAccept ob=new EmpAccept();
}
}
class EmpDisplay extends Frame
{
   Label l1,l2,l3;
   EmpDisplay(int eno,String name,int sal)
    {
          setVisible(true);
          setSize(100,300);
          setLocation(500,10);
          setBackground(Color.pink);
           setLayout(new FlowLayout());
           l1=new Label("Emp no="+eno);
           l2=new Label("Emp name="+name);
           l3=new Label("Emp sal="+sal);
add(l1);add(l2);add(l3);
     }
}