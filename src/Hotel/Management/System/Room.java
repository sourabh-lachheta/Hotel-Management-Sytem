package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class Room extends JFrame implements ActionListener {

    JTable table;
    JButton b1;

    Room(){



        JPanel panel = new JPanel();
        panel.setBounds(5,5,1010,690);
        panel.setBackground(new Color(155,135,66,85));
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel label = new JLabel(i2);
        label.setBounds(750,200,200,200);
        add(label);

        b1 = new JButton("Back");
        b1.setBounds(300,600,100,30);
        b1.addActionListener(this);
        add(b1);

         table = new JTable();
         table.setBounds(40,20,700,650);
        // table.setBackground(new Color(155,135,66,85));
         add(table);

         try{
             Temp c = new Temp();
             String roomInfo = "select * from room";
             ResultSet resultset = c.statement.executeQuery(roomInfo);
             table.setModel(DbUtils.resultSetToTableModel(resultset));

         }catch(Exception e){
             e.printStackTrace();
         }





        setUndecorated(true);
        setLayout(null);
        setLocation(700,150);
        setSize(1020,700);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new Room();
    }
}
