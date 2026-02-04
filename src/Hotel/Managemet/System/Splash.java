package Hotel.Managemet.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/splash2.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,1080, 900);
        add(label);


        setLayout(null);
        setLocation(300,80);
        setSize(1080,900);
        setVisible(true);

        try{
            Thread.sleep(5000);
            setVisible(false);

        }catch(Exception e){
            e.printStackTrace();
        }


    }
    public static void main(String[] args){
        new Splash();
    }
}
