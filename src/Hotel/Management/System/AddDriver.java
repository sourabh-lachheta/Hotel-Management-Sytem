package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDriver extends JFrame implements ActionListener {

    JTextField name, age, carC,salary,phone,location;
    JComboBox gender,available;
    JButton b1,b2;

    AddDriver(){

        JLabel heading = new JLabel("Add Driver Details");
        heading.setBounds(400,10,400,200);
        heading.setFont(new Font("GC Omega",Font.BOLD,30));
        add(heading);

        JLabel Name  = new JLabel("Name");
        Name.setBounds(250,90,300,200);
        Name.setFont(new Font("GC Omega",Font.BOLD,20));
        add(Name);

        name = new JTextField();
        name.setBounds(500,170,300,30);
        name.setFont(new Font("GC Omega",Font.BOLD,18));
        add(name);

        JLabel Age  = new JLabel("Age");
        Age.setBounds(250,150,300,200);
        Age.setFont(new Font("GC Omega",Font.BOLD,20));
        add(Age);

        age = new JTextField();
        age.setBounds(500,230,300,30);
        age.setFont(new Font("GC Omega",Font.BOLD,18));
        add(age);


        JLabel Gender  = new JLabel("Gender");
        Gender.setBounds(250,210,300,200);
        Gender.setFont(new Font("GC Omega",Font.BOLD,20));
        add(Gender);

        gender = new JComboBox(new String[] {"male","female","other"});
        gender.setBounds(500,290,300,30);
        gender.setFont(new Font("GC Omega",Font.BOLD,18));
        add(gender);

        JLabel CarC  = new JLabel("Car Company");
        CarC.setBounds(250,270,300,200);
        CarC.setFont(new Font("GC Omega",Font.BOLD,20));
        add(CarC);

        carC = new JTextField();
        carC.setBounds(500,350,300,30);
        carC.setFont(new Font("GC Omega",Font.BOLD,18));
        add(carC);

        JLabel Salary  = new JLabel("Salary");
        Salary.setBounds(250,330,300,200);
        Salary.setFont(new Font("GC Omega",Font.BOLD,20));
        add(Salary);

        salary = new JTextField();
        salary.setBounds(500,410,300,30);
        salary.setFont(new Font("GC Omega",Font.BOLD,18));
        add(salary);

        JLabel Phone  = new JLabel("Phone");
        Phone.setBounds(250,390,300,200);
        Phone.setFont(new Font("GC Omega",Font.BOLD,20));
        add(Phone);

        phone = new JTextField();
        phone.setBounds(500,470,300,30);
        phone.setFont(new Font("GC Omega",Font.BOLD,18));
        add(phone);

        JLabel Available  = new JLabel("Available ");
        Available.setBounds(250,450,300,200);
        Available.setFont(new Font("GC Omega",Font.BOLD,20));
        add(Available);

        available = new JComboBox(new String[] {"Yes","No"});
        available.setBounds(500,530,300,30);
        available.setFont(new Font("GC Omega",Font.BOLD,18));
        add(available);

        JLabel Location  = new JLabel("Location");
        Location.setBounds(250,510,300,200);
        Location.setFont(new Font("GC Omega",Font.BOLD,20));
        add(Location);


        location = new JTextField();
        location.setBounds(500,590,300,30);
        location.setFont(new Font("GC Omega",Font.BOLD,18));
        add(location);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel label = new JLabel(i2);
        label.setBounds(1000,140,500,500);
        add(label);

        b1 = new JButton("Save");
        b1.setBounds(250,670,100,30);
        b1.setFont(new Font("GC Omega",Font.BOLD,15));
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setBounds(400,670,100,30);
        b2.setFont(new Font("GC Omega",Font.BOLD,15));
        b2.addActionListener(this);
        add(b2);













        setUndecorated(true);
        setLayout(null);
        setLocation(100,80);
        setSize(1700,900);
        getContentPane().setBackground(new Color(155,135,66,85));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            try{
                Temp c = new Temp();
                String N = name.getText();
                String A = age.getText();
                String CC = carC.getText();
                String S = salary.getText();
                String P = phone.getText();
                String L = location.getText();
                String G = (String)gender.getSelectedItem();
                String Av = (String)available.getSelectedItem();

                String q =  "insert into driver values( '"+N+"','"+A+"','"+G+"', '"+CC+"', '"+S+"','"+P+"','"+Av+"','"+L+"' )";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"driver Added ");
                setVisible(false);

            }catch(Exception E){
                E.printStackTrace();
            }

        }else{
            setVisible(false);

        }

    }


    public static void main(String[] args){
        new AddDriver();
    }
}
