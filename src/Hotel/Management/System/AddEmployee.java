package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class AddEmployee extends JFrame {
    JTextField H,name,age,salary,phone,aadhar,email;
    JButton save,back;
    JRadioButton genderM, genderF;
    JComboBox job;


    AddEmployee(){

        JLabel heading = new JLabel("Add Employee Details");
        heading.setBounds(400,10,400,200);
        heading.setFont(new Font("GC Omega",Font.BOLD,30));
        add(heading);

        JLabel Name  = new JLabel("Name");
        Name.setBounds(250,90,300,200);
        Name.setFont(new Font("GC Omega",Font.BOLD,20));
        add(Name);

        H = new JTextField();
        H.setBounds(500,170,300,30);
        H.setFont(new Font("GC Omega",Font.BOLD,18));
        add(H);


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

        genderM = new JRadioButton("male");
        genderM.setBounds(500,290,100,30);
        genderM.setFont(new Font("GC Omega",Font.BOLD,18));
        genderM.setBackground(new Color(155,135,66,85));
        add(genderM);

        genderF = new JRadioButton("Female");
        genderF.setBounds(620,290,100,30);
        genderF.setFont(new Font("GC Omega",Font.BOLD,18));
        genderF.setBackground(new Color(155, 135, 66,85));
        add(genderF);

        JLabel Job  = new JLabel("Job");
        Job.setBounds(250,270,300,200);
        Job.setFont(new Font("GC Omega",Font.BOLD,20));
        add(Job);

        job = new JComboBox(new String[] {"Front Desk", "HouseKeeping", "Kitchen Staff", "Room Service", "Manger", "Accountant", "Chef"});
        job.setBounds(500,350,300,30);
        job.setFont(new Font("GC Omega",Font.BOLD,18));
        add(job);

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

        JLabel AAdhar  = new JLabel("Aadhar ");
        AAdhar.setBounds(250,450,300,200);
        AAdhar.setFont(new Font("GC Omega",Font.BOLD,20));
        add(AAdhar);

        aadhar = new JTextField();
        aadhar.setBounds(500,530,300,30);
        aadhar.setFont(new Font("GC Omega",Font.BOLD,18));
        add(aadhar);

        JLabel Email  = new JLabel("Email");
        Email.setBounds(250,510,300,200);
        Email.setFont(new Font("GC Omega",Font.BOLD,20));
        add(Email);

        email = new JTextField();
        email.setBounds(500,590,300,30);
        email.setFont(new Font("GC Omega",Font.BOLD,18));
        add(email);






        setLayout(null);
        setLocation(100,80);
        setSize(1700,900);
        getContentPane().setBackground(new Color(155,135,66,85));
        setVisible(true);

    }
    public static void main(String[] args){
        new AddEmployee();
    }
}
