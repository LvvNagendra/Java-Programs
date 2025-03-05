package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleSwingExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Simple Swing Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use no layout manager for simplicity

        // Create a label
        JLabel label = new JLabel("Click the button!");
        label.setBounds(150, 50, 150, 30); // Set position and size
        frame.add(label);

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(150, 100, 100, 30);
        frame.add(button);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}

