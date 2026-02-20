package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class AddRoom extends JFrame implements ActionListener {

    JTextField Ar,P;
    JComboBox av,cs,bt;
    JButton b1,b2;

    AddRoom(){





        JLabel heading = new JLabel("ADD ROOM");
        heading.setBounds(400,20,300,300);
        heading.setFont(new Font("GC Omega",Font.BOLD,30));
        add(heading);

        JLabel t1 = new JLabel("Room Number");
        t1.setBounds(250,100,300,300);
        t1.setFont(new Font("GC Omega",Font.BOLD,20));
        add(t1);

        Ar = new JTextField();
        Ar.setBounds(500,233,300,30);
        Ar.setFont(new Font("GC Omega",Font.BOLD,18));
        add(Ar);

        JLabel t2 = new JLabel("Availability");
        t2.setBounds(250,160,300,300);
        t2.setFont(new Font("GC Omega",Font.BOLD,20));
        add(t2);

        av = new JComboBox(new String[] {"Available","Occupied"});
        av.setBounds(500,290,300,30);
        av.setFont(new Font("GC Omega",Font.BOLD,18));
        add(av);

        JLabel t3 = new JLabel("Cleaning Status");
        t3.setBounds(250,220,300,300);
        t3.setFont(new Font("GC Omega",Font.BOLD,20));
        add(t3);

        cs = new JComboBox(new String[] {"Cleaned","dirty"});
        cs.setBounds(500,350,300,30);
        cs.setFont(new Font("GC Omega",Font.BOLD,18));
        add(cs);

        JLabel t4 = new JLabel("Price");
        t4.setBounds(250,280,300,300);
        t4.setFont(new Font("GC Omega",Font.BOLD,20));
        add(t4);


        

        P = new JTextField();
        P.setBounds(500,410,300,30);
        P.setFont(new Font("GC Omega",Font.BOLD,18));
        add(P);

        JLabel t5 = new JLabel("Bed Type");
        t5.setBounds(250,340,300,300);
        t5.setFont(new Font("GC Omega",Font.BOLD,20));
        add(t5);





        bt = new JComboBox(new String[] {"Single","Double"});
        bt.setBounds(500,470,300,30);
        bt.setFont(new Font("GC Omega",Font.BOLD,18));
        add(bt);

         b1 = new JButton("Add");
        b1.setBounds(250,600,100,30);
        b1.setFont(new Font("GC Omega",Font.BOLD,15));
        b1.addActionListener(this);
        add(b1);

         b2 = new JButton("Back");
        b2.setBounds(400,600,100,30);
        b2.setFont(new Font("GC Omega",Font.BOLD,15));
        b2.addActionListener(this);
        add(b2);


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel label = new JLabel(i2);
        label.setBounds(1080,180,400,400);
        add(label);





        setUndecorated(true);
        setLayout(null);
        setLocation(100,80);
        getContentPane().setBackground(new Color(155,135,66,85));
        setSize(1700,900);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            try{
                Temp c = new Temp();
                String room = Ar.getText();
                String ava = (String)av.getSelectedItem();
                String status = (String)cs.getSelectedItem();
                String price = P.getText();
                String bed = (String)bt.getSelectedItem();

                String q = "insert into room values( '"+room+"','"+ava+"','"+status+"', '"+price+"', '"+bed+"')";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Room Successfully Added");
                setVisible(false);


            }catch(Exception E){
                E.printStackTrace();
            }

        }else{
            //new Admin();
            setVisible(false);

        }

    }
    public static void main(String[] args){
        new AddRoom();

    }
}
