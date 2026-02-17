package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ManagerInfo extends JFrame implements ActionListener {
    JTable table;
    JButton b1;
    JLabel name,age,gender,job,salary,phone,aadhar,email;

    ManagerInfo(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,5,1010,690);
        panel.setBackground(new Color(155,135,66,85));
        add(panel);

        b1 = new JButton("back");
        b1.setBounds(420,600,100,30);
        b1.addActionListener(this);
        panel.add(b1);

        name = new JLabel("Name");
        name.setBounds(40,15,50,30);
        name.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(name);

        age = new JLabel("Age");
        age.setBounds(150,15,50,30);
        age.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(age);

        gender = new JLabel("Gender");
        gender.setBounds(260,15,80,30);
        gender.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(gender);

        job = new JLabel("Job");
        job.setBounds(380,15,80,30);
        job.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(job);

        salary = new JLabel("Salary");
        salary.setBounds(490,15,80,30);
        salary.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(salary);

        phone = new JLabel("Phone");
        phone.setBounds(600,15,80,30);
        phone.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(phone);

        aadhar = new JLabel("Aadhar");
        aadhar.setBounds(710,15,80,30);
        aadhar.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(aadhar);

        email = new JLabel("Email");
        email.setBounds(820,15,80,30);
        email.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(email);






        table = new JTable();
        table.setBounds(30,40,900,600);
        table.setBackground(new Color(155,135,66,85));
        table.setFont(new Font("GC Omega",Font.BOLD,12));
        panel.add(table);

        try{
            Temp c = new Temp();
            String empInfo = "select * from employee where job = 'Manger'";
            ResultSet resultset = c.statement.executeQuery(empInfo);
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
        new ManagerInfo();
    }
}
