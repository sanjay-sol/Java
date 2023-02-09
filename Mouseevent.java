import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample extends Frame implements MouseListener
{
  Label l;
  MouseListenerExample()
  {
    addMouseListener(this);
    l=new Label();
    l.setBounds(20,50,100,20);
    add(l);
    setSize(300,300);
    setLayout(null);
    setVisible(true);
  }
  public void mouseClicked(MouseEvent e)
  {
    l.setText("mouse clicked");
  }
  public void mouseEntered(MouseEvent e)
  {
    l.setText("Mouse entered");
  }
  
  public void mouseExited(MouseEvent e)
  {
    l.setText("Mouse exited");
  }
  public void mousePressed(MouseEvent e)
  {
    l.setText("Mouse Pressed");
  }
  public void mouseReleased(MouseEvent e)
  {
    l.setText("Mouse released");
  }
  public static void main(String[] args) 
  {
    new MouseListenerExample();
  }

}
