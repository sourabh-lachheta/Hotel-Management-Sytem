package Hotel.Managemet.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/splash2.gif"));
        Image i2 = imageIcon.getImage().getScaledInstance(1083,773,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(0,0,1083, 750);
        add(label);


        setLayout(null);
        setLocation(400,100);
        setSize(1086,796);
        setVisible(true);

        try{
            Thread.sleep(7000);
            setVisible(false);

        }catch(Exception e){
            e.printStackTrace();
        }


    }
    public static void main(String[] args){
        new Splash();
    }
}
