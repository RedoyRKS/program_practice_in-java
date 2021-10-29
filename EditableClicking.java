import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditableClicking {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Counter") ;
        FlowLayout layout = new FlowLayout() ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(250, 300);
        frame.getContentPane().setBackground(Color.lightGray);
        JLabel labe = new JLabel("Counter:") ;
        JTextField tf = new JTextField(15) ;
        JButton btn = new JButton("Count") ;
        btn.setForeground(Color.black);
        btn.setBackground(Color.green);
        JButton btn2 = new JButton("Reset") ;
        btn2.setForeground(Color.black);
        btn2.setBackground(Color.red);

        frame.setLayout(layout);
        frame.add(labe) ;frame.add(tf); frame.add(btn) ; frame.add(btn2) ;

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(String.valueOf(Integer.parseInt(tf.getText())+1));
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("0");
            }
        });
        tf.setText("0");
        tf.setEditable(false);
        frame.setVisible(true);
    }
}
