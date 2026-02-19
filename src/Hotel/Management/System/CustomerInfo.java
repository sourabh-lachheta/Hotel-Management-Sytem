package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame implements ActionListener {

    JTable  table;
    JButton back;
    CustomerInfo(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,5,1010,690);
        panel.setBackground(new Color(155,135,66,85));
        add(panel);

        JLabel H = new JLabel("Customer Info");
        H.setBounds(400,10,300,50);
        H.setFont(new Font("GC Omega",Font.BOLD,20));
        panel.add(H);

        JLabel id = new JLabel("Document");
        id.setBounds(50,60,300,30);
        id.setFont(new Font("GC Omega",Font.BOLD,15));
        panel.add(id);

        JLabel num = new JLabel("Number");
        num.setBounds(165,60,300,30);
        num.setFont(new Font("GC Omega",Font.BOLD,15));
        panel.add(num);

        JLabel name = new JLabel("Name");
        name.setBounds(280,60,300,30);
        name.setFont(new Font("GC Omega",Font.BOLD,15));
        panel.add(name);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(395,60,300,30);
        gender.setFont(new Font("GC Omega",Font.BOLD,15));
        panel.add(gender);

        JLabel country = new JLabel("Country");
        country.setBounds(500,60,300,30);
        country.setFont(new Font("GC Omega",Font.BOLD,15));
        panel.add(country);

        JLabel Aroom = new JLabel("Room No");
        Aroom.setBounds(615,60,230,30);
        Aroom.setFont(new Font("GC Omega",Font.BOLD,15));
        panel.add(Aroom);

        JLabel c_in = new JLabel("Checked-In");
        c_in.setBounds(720,60,300,30);
        c_in.setFont(new Font("GC Omega",Font.BOLD,15));
        panel.add(c_in);

        JLabel d = new JLabel("Deposit");
        d.setBounds(840,60,300,30);
        d.setFont(new Font("GC Omega",Font.BOLD,15));
        panel.add(d);

        back = new JButton("Back");
        back.setBounds(430,500,100,30);
        back.addActionListener(this);
        panel.add(back);

        table = new JTable();
        table.setBounds(50,90,900,400);
        table.setBackground(new Color(155,135,66,85));
        table.setFont(new Font("GC Omega",Font.BOLD,12));
        panel.add(table);

        try{
            Temp c = new Temp();
            String CInfo = "select * from customer";
            ResultSet resultset = c.statement.executeQuery(CInfo);
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
        if(e.getSource() == back){
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new CustomerInfo();
    }
}
