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
        panel.setLayout(null);
        panel.setBounds(5,5,1010,690);
        panel.setBackground(new Color(155,135,66,85));
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel label = new JLabel(i2);
        label.setBounds(750,200,200,200);
        panel.add(label);

        b1 = new JButton("Back");
        b1.setBounds(300,600,100,30);
        b1.addActionListener(this);
        panel.add(b1);




        JLabel availability = new JLabel("Availability");
        availability.setBounds(180,20,200,20);
        availability.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(availability);

        JLabel clean = new JLabel("Clean Status");
        clean.setBounds(320,20,200,20);
        clean.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(clean);

        JLabel price = new JLabel("Price");
        price.setBounds(460,20,200,20);
        price.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(price);

        JLabel bed = new JLabel("Bed Type");
        bed.setBounds(600,20,200,20);
        bed.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(bed);

        JLabel roomN = new JLabel("Room No");
        roomN.setBounds(40,20,200,20);
        roomN.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(roomN);






        table = new JTable();
         table.setBounds(40,40,700,600);
        table.setBackground(new Color(155,135,66,85));
        table.setFont(new Font("GC Omega",Font.BOLD,12));
         panel.add(table);

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
