import java.awt.*;
import java.awt.event.*;
public class MouseDemo extends Frame implements MouseListener,MouseMotionListener
{
int x=0, y=0;
String msg= "";
MouseDemo(String title)
{
super(title);
addMouseListener(this);
addMouseMotionListener(this);
setSize(500,500);
setVisible(true);
//window close
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
    dispose();
}
} );
}
public void mouseClicked(MouseEvent e)
{
msg= "MouseClicked";
x = e.getX();
y = e.getY();
repaint();
}
public void mousePressed(MouseEvent e)
{
msg= "MousePressed";
x = e.getX();
y = e.getY();
repaint();
}
public void mouseReleased(MouseEvent e)
{
msg = "MouseReleased";
x = e.getX();
y = e.getY();
repaint();
}
public void mouseEntered(MouseEvent e)
{
msg= "MouseEntered";
x = e.getX();
y = e.getY();
repaint();
}
public void mouseExited(MouseEvent e)
{
msg= "MouseExited";
x = e.getX();
y = e.getY();
repaint();
}
public void mouseMoved(MouseEvent e)
{
msg= "*";
x = e.getX();
y = e.getY();
repaint();
}

public void mouseDragged(MouseEvent e)
{
msg= "#";
x = e.getX();
y = e.getY();
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg + " at " + x + "," + y, 100,50);
}
public static void main(String[] args)
{
MouseDemo f = new MouseDemo("Mouse Events Handling");
}
}