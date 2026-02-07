package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class Admin extends JFrame {
    JButton empB, roomB, driverB;
    Admin(){

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel label = new JLabel(i2);
        label.setBounds(20,20,400,400);
        add(label);

        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image i3 = imageIcon1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel label1 = new JLabel(i4);
        label1.setBounds(20,170,400,400);
        add(label1);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image i5 = imageIcon2.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel label2 = new JLabel(i6);
        label2.setBounds(20,320,400,400);
        add(label2);

        empB = new JButton("Add employee");
        empB.setBounds(350,210,370,30);
        add(empB);

        roomB = new JButton("Add rooms");
        roomB.setBounds(350,360,370,30);
        add(roomB);

        driverB = new JButton("Add driver");
        driverB.setBounds(350,510,370,30);
        add(driverB);




        setLayout(null);
        setLocation(100,80);
        setSize(1700,900);
        getContentPane().setBackground(new Color(155,135,66,85));
        setVisible(true);

    }
    public static void main(String[] args){
        new Admin();

    }
}
