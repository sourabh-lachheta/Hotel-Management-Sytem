package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateRoom extends JFrame {

    JTextField textRoomN, textA, textClean;
    Choice choice;
    JButton check,update,back;

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

        JLabel id = new JLabel("Guest ID :");
        id.setBounds(90, 100, 200, 30);
        id.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(id);

        choice = new Choice();
        choice.setBounds(330, 100, 300, 30);
        choice.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(choice);

        try {
            Temp c = new Temp();
            ResultSet resultSet = c.statement.executeQuery("select * from customer");
            while (resultSet.next()) {
                choice.add(resultSet.getString("number"));

            }

        } catch (Exception E) {
            E.printStackTrace();
        }

        JLabel num = new JLabel("Room Number :");
        num.setBounds(90, 150, 300, 30);
        num.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(num);

        textRoomN = new JTextField();
        textRoomN.setBounds(330, 150, 300, 30);
        textRoomN.setFont(new Font("GC Omega", Font.BOLD, 16));
        panel.add(textRoomN);

        JLabel Ava = new JLabel("Availability :");
        Ava.setBounds(90, 200, 300, 30);
        Ava.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(Ava);

        textA = new JTextField();
        textA.setBounds(330, 200, 300, 30);
        textA.setFont(new Font("GC Omega", Font.BOLD, 16));
        panel.add(textA);

        JLabel cStatus = new JLabel("Clean Status :");
        cStatus.setBounds(90, 250, 300, 30);
        cStatus.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(cStatus);

        textClean = new JTextField();
        textClean.setBounds(330, 250, 300, 30);
        textClean.setFont(new Font("GC Omega", Font.BOLD, 16));
        panel.add(textClean);

        check = new JButton("Check");
        check.setBounds(130, 450, 100, 30);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = choice.getSelectedItem();
                String q = "select * from customer where number = '"+id+"'";

                try{
                    Temp c = new Temp();
                    ResultSet resultSet = c.statement.executeQuery(q);

                    while(resultSet.next()){
                        textRoomN.setText(resultSet.getString("room"));
                    }

                    ResultSet resultSet1 = c.statement.executeQuery("select * from room where roomnumber = '"+textRoomN.getText()+"' ");
                    while(resultSet1.next()){
                        textA.setText(resultSet1.getString("availability"));
                        textClean.setText(resultSet1.getString("cleaning_status"));

                    }

                }catch(Exception E){
                    E.printStackTrace();
                }

            }
        });

        update = new JButton("Update");
        update.setBounds(290, 450, 100, 30);
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Temp c = new Temp();
                    String s1 = textClean.getText();
                    c.statement.executeUpdate("update room set cleaning_status = '"+s1+"' where roomnumber = " + textRoomN.getText());
                    JOptionPane.showMessageDialog(null,"Updated Successfully");
                    setVisible(false);


                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        back = new JButton("Back");
        back.setBounds(450, 450, 100, 30);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel label = new JLabel(i2);
        label.setBounds(730, 110, 200, 200);
        panel.add(label);

        setUndecorated(true);
        setLayout(null);
        setLocation(700, 150);
        setSize(1020, 700);
        setVisible(true);
    }
    public static void main(String[] args){
        new UpdateRoom();
    }
}
