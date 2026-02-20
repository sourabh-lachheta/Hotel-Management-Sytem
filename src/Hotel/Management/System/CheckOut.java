package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class CheckOut extends JFrame {
    JButton CheckOut, back,check;
    Choice choice;
    CheckOut(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5, 5, 1010, 690);
        panel.setBackground(new Color(155, 135, 66, 85));
        add(panel);

        JLabel H = new JLabel("Check Out");
        H.setBounds(200, 20, 300, 50);
        H.setFont(new Font("GC Omega", Font.BOLD, 20));
        panel.add(H);

        JLabel id = new JLabel("Customer ID :");
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

        JTextField roomN = new JTextField();
        roomN.setBounds(330, 150, 300, 30);
        roomN.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(roomN);

        JLabel checkIn = new JLabel("Check-In Time :");
        checkIn.setBounds(90, 200, 300, 30);
        checkIn.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(checkIn);

        JTextField labelcheckIn = new JTextField();
        labelcheckIn.setBounds(330, 200, 300, 30);
        labelcheckIn.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(labelcheckIn);

        JLabel checkOut = new JLabel("Check-Out Time :");
        checkOut.setBounds(90, 250, 300, 30);
        checkOut.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(checkOut);

        Date date = new Date();

        JTextField labelcheckOut = new JTextField(""+date );
        labelcheckOut.setBounds(330, 250, 300, 30);
        labelcheckOut.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(labelcheckOut);

        CheckOut = new JButton("CheckOut");
        CheckOut.setBounds(130, 450, 100, 30);
        panel.add(CheckOut);
        CheckOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Temp cv = new Temp();
                    cv.statement.executeUpdate("delete from customer where number = '"+choice.getSelectedItem()+"'");
                    cv.statement.executeUpdate("update room set availability = 'Available' where roomnumber = '"+roomN.getText()+"'");
                    JOptionPane.showMessageDialog(null,"Done");
                    setVisible(false);

                }catch (Exception E){
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

        JButton check = new JButton("Check");
        check.setBounds(290, 450, 100, 30);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Temp c = new Temp();

                try{


                    ResultSet resultSet = c.statement.executeQuery("select * from customer where number = "+choice.getSelectedItem());
                    while(resultSet.next()){
                        roomN.setText(resultSet.getString("room"));
                        labelcheckIn.setText(resultSet.getString("checkintime"));
                    }


                }catch(Exception E){
                    E.printStackTrace();
                }

            }
        });

        setUndecorated(true);
        setLayout(null);
        setLocation(700, 150);
        setSize(1020, 700);
        setVisible(true);
    }
    public static void main(String[] args){
        new CheckOut();
    }
}
