package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {
    JButton empB, roomB, driverB, logOut, back;
    Admin(){

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel label = new JLabel(i2);
        label.setBounds(20,20,400,400);
        add(label);

        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image i3 = imageIcon1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel label1 = new JLabel(i4);
        label1.setBounds(20,170,400,400);
        add(label1);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image i5 = imageIcon2.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel label2 = new JLabel(i6);
        label2.setBounds(20,320,400,400);
        add(label2);

        empB = new JButton("Add employee");
        empB.setBounds(350,210,370,30);
        empB.setFont(new Font("GC Oemga",Font.BOLD,15));
        empB.addActionListener(this);
        add(empB);

        roomB = new JButton("Add rooms");
        roomB.setBounds(350,360,370,30);
        roomB.setFont(new Font("GC Oemga",Font.BOLD,15));
        roomB.addActionListener(this);
        add(roomB);

        driverB = new JButton("Add driver");
        driverB.setBounds(350,510,370,30);
        driverB.setFont(new Font("GC Oemga",Font.BOLD,15));
        driverB.addActionListener(this);
        add(driverB);

        logOut = new JButton("Logout");
        logOut.setBounds(20,800,170,30);
        logOut.setFont(new Font("GC Oemga",Font.BOLD,15));
        logOut.addActionListener(this);
        add(logOut);

        back = new JButton("Back");
        back.setBounds(200,800,170,30);
        back.setFont(new Font("GC Oemga",Font.BOLD,15));
        back.addActionListener(this);
        add(back);






        setLayout(null);
        setLocation(100,80);
        setSize(1700,900);
        getContentPane().setBackground(new Color(155,135,66,85));
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        try{
            if (e.getSource() == empB) {


            }else if(e.getSource() == roomB){

            }else if(e.getSource() == driverB){

            }else if(e.getSource() == logOut){
                //System.exit(102);
                new Login();
                setVisible(false);

            }else{

                new DashBoard();
                setVisible(false);

            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Admin();

    }
}
