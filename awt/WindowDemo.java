import java.awt.*;
import java.awt.event.*;

class WindowDemo extends Frame implements WindowListener
{
    WindowDemo()
    {
        setVisible(true);
        setSize(500,500);
        addWindowListener(this);
    }

    public void windowOpened(WindowEvent we)
    {
        setTitle("opened");
    }

    public void windowClosing(WindowEvent we)
    {
        setTitle("Closing");
        dispose();
    }

    public void windowClosed(WindowEvent we)
    {
        setTitle("Closed");
    } 

    public void windowIconified(WindowEvent we)
    {
        setTitle("Iconified");
    } 

    public void windowDeiconified(WindowEvent we)
    {
        setTitle("Deiconified");
    } 

    public void windowActivated(WindowEvent we)
    {
        setTitle("Activated");
    } 

    public void windowDeactivated(WindowEvent we)
    {
        setTitle("Deactivated");
    } 

    public static void main(String arg[])
    {
        new WindowDemo();
    }
}

