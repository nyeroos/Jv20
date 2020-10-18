package com.nyeroos.firstlesson.JV20.pr11.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    public App() {
        JFrame frame = new JFrame("example");
        Label label1 = new Label("Choose the font");
        label1.setBounds(30, 10, 320, 20);
        label1.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        frame.add(label1);

        JComboBox faceCombo = new JComboBox();
        faceCombo.setEditable(true);
        faceCombo.addItem("Times New Roman");
        faceCombo.addItem("MS Sans Serif");
        faceCombo.addItem("Courier New");
        faceCombo.setBounds(30, 40, 320, 40);
        frame.add(faceCombo);

        Label label2 = new Label("Choose the colour");
        label2.setBounds(30, 90, 320, 20);
        label2.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        frame.add(label2);

        JComboBox faceCombo2 = new JComboBox();
        faceCombo2.setEditable(true);
        faceCombo2.addItem("Blue");
        faceCombo2.addItem("Red");
        faceCombo2.addItem("Black");
        faceCombo2.setBounds(30, 120, 320, 40);
        frame.add(faceCombo2);



        JTextArea bigField = new JTextArea("Text", 2, 3);
        bigField.setFont(new Font("Dialog", Font.PLAIN, 20));
        bigField.setBackground(Color.WHITE);
        bigField.setForeground(Color.BLUE);
        bigField.setFont(new Font("Times New Roman", Font.BOLD, 15));
        bigField.setBounds(30, 170, 320, 40);
        faceCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (faceCombo.getSelectedIndex()==0) {
                    bigField.setFont(new Font("Times New Roman", Font.BOLD, 15));
                }
                else if (faceCombo.getSelectedIndex()==1) {
                    bigField.setFont(new Font("MS Sans Serif", Font.BOLD, 15));
                }
                else if (faceCombo.getSelectedIndex()==2) {
                    bigField.setFont(new Font("Courier New", Font.BOLD, 15));
                }
            }
        });
        faceCombo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (faceCombo2.getSelectedIndex()==0) {
                    bigField.setForeground(Color.BLUE);
                }
                else if (faceCombo2.getSelectedIndex()==1) {
                    bigField.setForeground(Color.RED);
                }
                else if (faceCombo2.getSelectedIndex()==2) {
                    bigField.setForeground(Color.BLACK);
                }
            }
        });
        frame.add(bigField);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

}
