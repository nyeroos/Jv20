package com.nyeroos.firstlesson.JV20.pr11.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Areas extends JFrame {
    public Areas() {
        JFrame frame = new JFrame("example");
        frame.setSize(800, 800);

        JButton Center = new JButton("Center");
        Center.setBounds(300, 300, 200, 200);
        Center.setBackground(Color.lightGray);

        JButton North = new JButton("North");
        North.setBounds(300, 100, 200, 150);
        North.setBackground(Color.CYAN);

        JButton South = new JButton("South");
        South.setBounds(300, 500, 200, 150);
        South.setBackground(Color.RED);

        JButton East = new JButton("East");
        East.setBounds(150, 300, 150, 200);
        East.setBackground(Color.PINK);

        JButton West = new JButton("West");
        West.setBounds(500, 300, 150, 200);
        West.setBackground(Color.ORANGE);

        frame.add(Center);
        frame.add(North);
        frame.add(South);
        frame.add(East);
        frame.add(West);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Добро пожаловать в ЦАО", "Notification", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Добро пожаловать в САО", "Notification", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Добро пожаловать в ЮЗАО", "Notification", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListener4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Добро пожаловать в СВАО", "Notification", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListener5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(frame, "Добро пожаловать в ЗАО", "Notification", JOptionPane.DEFAULT_OPTION);
            }
        };
        Center.addActionListener(actionListener);
        North.addActionListener(actionListener2);
        South.addActionListener(actionListener3);
        East.addActionListener(actionListener4);
        West.addActionListener(actionListener5);
    }
}
