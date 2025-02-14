import javax.swing.*;
import java.awt.*;
public class NullLayoutExample extends JFrame {
    NullLayoutExample(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,600,300);
        Container c=getContentPane();
        c.setLayout(null);

        JButton b1=new JButton("Btn1");
        JButton b2=new JButton("Btn2");
        JButton b3=new JButton("Btn3");
        JButton b4=new JButton("Btn4");
        JButton b5=new JButton("Btn5");

        b1.setBounds(20,20,80,30);
        b2.setBounds(120,20,80,30);
        b3.setBounds(220,20,80,30);
        b4.setBounds(20,100,80,30);
        b5.setBounds(120,100,80,30);

        c.add(b1);c.add(b2);c.add(b3);c.add(b4);c.add(b5);
    }

    public static void main(String[] args) {
        NullLayoutExample n=new NullLayoutExample();
    }
}