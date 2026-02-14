package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class Room extends JFrame {

    Room(){



        JPanel panel = new JPanel();
        panel.setBounds(5,5,1010,690);
        panel.setBackground(new Color(155,135,66,85));
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel label = new JLabel(i2);
        label.setBounds(200,500,200,200);
        panel.add(label);


        //setUndecorated(false);
        setLayout(null);
        setLocation(700,150);
        setSize(1020,700);
        setVisible(true);

    }
    public static void main(String[] args){
        new Room();
    }
}
