import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickingButton{

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyApp") ;
        FlowLayout layout = new FlowLayout() ;
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);
        JCheckBox box = new JCheckBox();
        JButton btn = new JButton("Select") ;
        btn.setForeground(Color.black);
        btn.setBackground(Color.YELLOW);
        

        frame.setLayout(layout);
        frame.add(btn) ; frame.add(box) ;
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!box.isSelected()) {
                    box.setSelected(true);
                    btn.setText("Unselect");
                }else {
                    box.setSelected(false);
                    btn.setText("Select");
                }
            }
        });

        frame.setVisible(true);
    }
}

