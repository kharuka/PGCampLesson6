import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;

public class JFrame01 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("title");
        frame.setBounds(100,100,400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button=new JButton("Push");

        frame.getContentPane().add(button, BorderLayout.NORTH);
        frame.setVisible(true);
    }
}
