package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCheck extends JFrame  {

    JTextField textId,textRoomN,textName,textCin,textPending,textAmount;
    JButton check,update,back;
    Choice choice;
    UpdateCheck() {


        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5, 5, 1010, 690);
        panel.setBackground(new Color(155, 135, 66, 85));
        add(panel);

        JLabel H = new JLabel("Search For Room");
        H.setBounds(200, 10, 300, 50);
        H.setFont(new Font("GC Omega", Font.BOLD, 20));
        panel.add(H);

        JLabel id = new JLabel("ID :");
        id.setBounds(90, 70, 200, 30);
        id.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(id);

        choice = new Choice();
        choice.setBounds(330, 70, 300, 30);
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
        num.setBounds(90, 120, 300, 30);
        num.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(num);

        textRoomN = new JTextField();
        textRoomN.setBounds(330, 120, 300, 30);
        textRoomN.setFont(new Font("GC Omega", Font.BOLD, 16));
        panel.add(textRoomN);

        JLabel name = new JLabel("Name :");
        name.setBounds(90, 170, 300, 30);
        name.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(name);

        textName = new JTextField();
        textName.setBounds(330, 170, 300, 30);
        textName.setFont(new Font("GC Omega", Font.BOLD, 16));
        panel.add(textName);

        JLabel cIn = new JLabel("Checked-In :");
        cIn.setBounds(90, 220, 300, 30);
        cIn.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(cIn);

        textCin = new JTextField();
        textCin.setBounds(330, 220, 300, 30);
        textCin.setFont(new Font("GC Omega", Font.BOLD, 16));
        panel.add(textCin);

        JLabel amount = new JLabel("Amount Paid :");
        amount.setBounds(90, 270, 300, 30);
        amount.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(amount);

        textAmount = new JTextField();
        textAmount.setBounds(330, 270, 300, 30);
        textAmount.setFont(new Font("GC Omega", Font.BOLD, 16));
        panel.add(textAmount);

        JLabel pending = new JLabel("Pending Amount :");
        pending.setBounds(90, 320, 230, 30);
        pending.setFont(new Font("GC Omega", Font.BOLD, 18));
        panel.add(pending);

        textPending = new JTextField();
        textPending.setBounds(330, 320, 300, 30);
        textPending.setFont(new Font("GC Omega", Font.BOLD, 16));
        panel.add(textPending);

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
                        textName.setText(resultSet.getString("name"));
                        textCin.setText(resultSet.getString("checkintime"));
                        textAmount.setText(resultSet.getString("deposit"));

                    }

                    ResultSet resultSet1 = c.statement.executeQuery("select * from room where roomnumber = '"+textRoomN.getText()+"' ");
                    while(resultSet1.next()){
                        String price = resultSet1.getString("price");
                        int amountPaid =Integer.parseInt(price) - Integer.parseInt(textAmount.getText());
                        textPending.setText(""+amountPaid);
                    }

                }catch(Exception E){
                    E.printStackTrace();
                }

            }
        });


        update = new JButton("Update");
        update.setBounds(290, 450, 100, 30);
        //update.addActionListener(this);
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Temp c = new Temp();
                    String q = choice.getSelectedItem();
                    String s1 = textRoomN.getText();
                    String s2 = textName.getText();
                    String s3 = textCin.getText();
                    String s4 = textAmount.getText();
                    c.statement.executeUpdate("update customer set room = '"+s1+"',name = '"+s2+"'   ")


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

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/updated.png"));
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
        new UpdateCheck();
    }
}
