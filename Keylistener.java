
import java.awt.*;
import  java.awt.event.*;

public class KeyboardEvent extends KeyAdapter{
    Label l;
    TextArea a;
    Frame f;
    KeyboardEvent(){
        f = new Frame("Key Adapter");
        l = new Label();
        l.setBounds(50,50,200,20);
        a = new TextArea();
        a.setBounds(20,80,300,300);
        a.addKeyListener(this);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        f.add(l);
        f.add(a);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public void keyReleased(KeyEvent e){
        String txt1 = a.getText();
        String words[] = txt1.split(" ");
        l.setText("Words: "+words.length+"Characters: "+txt1.length());
    }

    public static void main(String[] args) {
        new KeyboardEvent();
    }
}