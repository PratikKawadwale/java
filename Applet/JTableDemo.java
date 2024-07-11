import javax.swing.*;
import java.awt.*;
class Demo extends JFrame
{
   JTable tbl;
   Demo()
    {
       setVisible(true);
       setSize(500,500);
       setLayout(new FlowLayout());

String head[]={"Roll no","Name" ,"Per"};
String data[][]={{"101","om","55"},
                            {"102","sai","85"},
                              {"106","Ram","95"}};
tbl=new JTable(data,head);
JScrollPane jsp=new JScrollPane(tbl);
add(jsp);
     }
public static void main(String arg[])
{
  new Demo();
}
}