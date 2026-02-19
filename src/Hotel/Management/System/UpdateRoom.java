package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class UpdateRoom extends JFrame {

    UpdateRoom(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5, 5, 1010, 690);
        panel.setBackground(new Color(155, 135, 66, 85));
        add(panel);

        JLabel H = new JLabel("Update Room Status");
        H.setBounds(200, 10, 300, 50);
        H.setFont(new Font("GC Omega", Font.BOLD, 20));
        panel.add(H);


        setLayout(null);
        setLocation(700, 150);
        setSize(1020, 700);
        setVisible(true);
    }
    public static void main(String[] args){
        new UpdateRoom();
    }
}
