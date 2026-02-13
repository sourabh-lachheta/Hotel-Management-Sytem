package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class Room extends JFrame {

    Room(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,995,664);
        panel.setBackground(new Color(155,135,66,85));
        add(panel);

        setLayout(null);
        setLocation(700,150);
        setSize(1020,700);
        setVisible(true);

    }
    public static void main(String[] args){
        new Room();
    }
}
