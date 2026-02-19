package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class PickUp extends JFrame implements ActionListener {
    JTable table;
    JButton display, back;
    Choice choice;

    PickUp(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,5,1010,690);
        panel.setBackground(new Color(155,135,66,85));
        add(panel);

        JLabel H = new JLabel("Pick-Up Service");
        H.setBounds(400,10,300,50);
        H.setFont(new Font("GC Omega",Font.BOLD,20));
        panel.add(H);

        JLabel carType = new JLabel("Type of Car");
        carType.setBounds(50,80, 120,30);
        carType.setFont(new Font("GC Omega", Font.BOLD,18));
        panel.add(carType);

        choice = new Choice();
        choice.setBounds(170,80,150,30);
        choice.setFont(new Font("GC Omega", Font.BOLD,16));
        panel.add(choice);

        try{
            Temp c = new Temp();
            ResultSet resultSet = c.statement.executeQuery("select * from driver");
            while(resultSet.next()){
                choice.add(resultSet.getString("carname"));
            }

        }catch(Exception E){
            E.printStackTrace();
        }

        JLabel Name  = new JLabel("Name");
        Name.setBounds(60,150,300,30);
        Name.setFont(new Font("GC Omega",Font.BOLD,15));
        add(Name);

        JLabel Age  = new JLabel("Age");
        Age.setBounds(170,150,300,30);
        Age.setFont(new Font("GC Omega",Font.BOLD,15));
        add(Age);

        JLabel Gender  = new JLabel("Gender");
        Gender.setBounds(280,150,300,30);
        Gender.setFont(new Font("GC Omega",Font.BOLD,15));
        add(Gender);

        JLabel CarC  = new JLabel("Car Company");
        CarC.setBounds(395,150,300,30);
        CarC.setFont(new Font("GC Omega",Font.BOLD,15));
        add(CarC);

        JLabel Salary  = new JLabel("Car Name");
        Salary.setBounds(510,150,300,30);
        Salary.setFont(new Font("GC Omega",Font.BOLD,15));
        add(Salary);

        JLabel Phone  = new JLabel("Phone");
        Phone.setBounds(620,150,300,30);
        Phone.setFont(new Font("GC Omega",Font.BOLD,15));
        add(Phone);

        JLabel Available  = new JLabel("Available");
        Available.setBounds(730,150,300,30);
        Available.setFont(new Font("GC Omega",Font.BOLD,15));
        add(Available);

        JLabel Location  = new JLabel("Location");
        Location.setBounds(845,150,300,30);
        Location.setFont(new Font("GC Omega",Font.BOLD,15));
        add(Location);

        display = new JButton("Display");
        display.setBounds(340,500,100,30);
        display.addActionListener(this);
        panel.add(display);

        back = new JButton("Back");
        back.setBounds(510,500,100,30);
        back.addActionListener(this);
        panel.add(back);

        table = new JTable();
        table.setBounds(50,180,900,400);
        //table.setBackground(new Color(155,135,66,85));
        table.setFont(new Font("GC Omega",Font.BOLD,12));
        panel.add(table);

        try{
            Temp c = new Temp();
            String driverInfo = "select * from driver";
            ResultSet resultset = c.statement.executeQuery(driverInfo);
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
        if(e.getSource() == display){
            String q = "select * from driver where carname = '"+choice.getSelectedItem()+"'";

            try{
                Temp c = new Temp();
                ResultSet resultSet = c.statement.executeQuery(q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));

            }catch(Exception E){
                E.printStackTrace();

            }


        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new PickUp();
    }
}
