
import java.awt.*;
import java.awt.event.*;
public class MouseAdapterEx extends MouseAdapter {
    Frame f;
    MouseAdapterEx(){
        f = new Frame("Mouse Adapter");
        f.addMouseListener(this);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.cyan);
        g.fillArc(e.getX(),e.getY(),30,30,45,45);
    }

    public static void main(String[] args) {
        MouseAdapterEx em = new MouseAdapterEx();
    }
}