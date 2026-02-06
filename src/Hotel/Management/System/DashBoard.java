package Hotel.Management.System;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashBoard extends JFrame implements ActionListener {
    JButton rec,add;

    DashBoard(){
        super("HOTEL MANAGEMENT SYSTEM");


        rec = new JButton("Reception");
        rec.setBounds(500,485,150,30);
        rec.setFont(new Font("CG Omega", Font.BOLD,15));
        rec.setBackground(new Color(255, 98, 0));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        add(rec);

        add = new JButton("Admin");
        add.setBounds(1000,485,150,30);
        add.setFont(new Font("CG Omega", Font.BOLD,15));
        add.setBackground(new Color(255,98,0));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
        Image i3 = imageIcon1.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel label1 = new JLabel(i4);
        label1.setBounds(325,150,500,500);
        add(label1);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i5 = imageIcon2.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel label2 = new JLabel(i6);
        label2.setBounds(825,150,500,500);
        add(label2);


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon//Dashboard.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(1700,900, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel label = new JLabel(i2);
        label.setBounds(0,0,1700,900);
        add(label);






        setLayout(null);
        setLocation(100,80);
        setSize(1700,900);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rec){

        }else{

        }

    }

    public static void main(String[] args){
        new DashBoard();
    }
}
