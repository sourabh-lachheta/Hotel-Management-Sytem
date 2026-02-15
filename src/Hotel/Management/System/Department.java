package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame implements ActionListener {
    JTable table;
    JButton b1;

    Department(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,5,1010,690);
        panel.setBackground(new Color(155,135,66,85));
        add(panel);

        JLabel department = new JLabel("Department");
        department.setBounds(45,19,200,20);
        department.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(department);

        JLabel budget = new JLabel("Budget");
        budget.setBounds(490,19,200,20);
        budget.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(budget);

        b1 = new JButton("Back");
        b1.setBounds(450,600,100,30);
        b1.addActionListener(this);
        panel.add(b1);




        table = new JTable();
        table.setBounds(40,40,900,600);
        table.setBackground(new Color(155,135,66,85));
        table.setFont(new Font("GC Omega",Font.BOLD,12));
        panel.add(table);

        try{
            Temp c = new Temp();
            String departmentInfo = "select * from department";
            ResultSet resultset = c.statement.executeQuery(departmentInfo);
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
        new Department();
    }
}
