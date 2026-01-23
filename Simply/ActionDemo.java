package Simply;

import javax.swing.*;
import java.awt.event.*;

public class ActionDemo implements ActionListener {

    JLabel label;

    public ActionDemo() {
        JFrame frame = new JFrame("Action Listener Example");
        JButton button = new JButton("Click Me");
        label = new JLabel("Button not clicked yet.");

        button.setBounds(100, 100, 150, 40);
        label.setBounds(100, 160, 200, 30);

        button.addActionListener(this);

        frame.add(button);
        frame.add(label);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new ActionDemo();
    }
    
}
