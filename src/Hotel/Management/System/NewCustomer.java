package Hotel.Management.System;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class NewCustomer extends JFrame implements ActionListener {
    JTextField textFieldnumber,textname,textcountry, textDeposit;
    JComboBox comboBox1,gender1;
    Choice c1;
    JLabel date;
    JButton add,back;

    NewCustomer(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,5,1010,690);
        panel.setBackground(new Color(155,135,66,85));
        add(panel);

        JLabel H = new JLabel("New Customer Form");
        H.setBounds(200,10,300,50);
        H.setFont(new Font("GC Omega",Font.BOLD,20));
        panel.add(H);

        JLabel id = new JLabel("ID :");
        id.setBounds(90,70,300,30);
        id.setFont(new Font("GC Omega",Font.BOLD,18));
        panel.add(id);

        comboBox1 = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id","Driving License"});
        comboBox1.setBounds(330,70,300,30);
        panel.add(comboBox1);

        JLabel num = new JLabel("Number :");
        num.setBounds(90,120,300,30);
        num.setFont(new Font("GC Omega",Font.BOLD,18));
        panel.add(num);

        textFieldnumber = new JTextField();
        textFieldnumber.setBounds(330,120,300,30);
        panel.add(textFieldnumber);

        JLabel name = new JLabel("Name :");
        name.setBounds(90,170,300,30);
        name.setFont(new Font("GC Omega",Font.BOLD,18));
        panel.add(name);

        textname = new JTextField();
        textname.setBounds(330,170,300,30);
        panel.add(textname);

        JLabel gender = new JLabel("Gender :");
        gender.setBounds(90,220,300,30);
        gender.setFont(new Font("GC Omega",Font.BOLD,18));
        panel.add(gender);

        gender1 = new JComboBox(new String[] {"Male","Female","Other"});
        gender1.setBounds(330,220,300,30);
        panel.add(gender1);

        JLabel country = new JLabel("Country :");
        country.setBounds(90,270,300,30);
        country.setFont(new Font("GC Omega",Font.BOLD,18));
        panel.add(country);

        textcountry = new JTextField();
        textcountry.setBounds(330,270,300,30);
        panel.add(textcountry);

        JLabel Aroom = new JLabel("Allocated Room Number :");
        Aroom.setBounds(90,320,230,30);
        Aroom.setFont(new Font("GC Omega",Font.BOLD,18));
        panel.add(Aroom);

        c1 = new Choice();
        try{

            Temp c = new Temp();
            ResultSet resultSet = c.statement.executeQuery("select * from room");
            while(resultSet.next()){
                c1.add(resultSet.getString("roomnumber"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        c1.setBounds(330,320,300,30);
        c1.setFont(new Font("GC Omega",Font.BOLD,15));
        panel.add(c1);

        JLabel c_in = new JLabel("Checked-In :");
        c_in.setBounds(90,370,300,30);
        c_in.setFont(new Font("GC Omega",Font.BOLD,18));
        panel.add(c_in);

        Date date1 = new Date();

        date = new JLabel(""+date1);
        date.setBounds(330,370,300,30);
        date.setFont(new Font("GC Omega",Font.BOLD,18));
        panel.add(date);

        JLabel d = new JLabel("Deposit :");
        d.setBounds(90,420,300,30);
        d.setFont(new Font("GC Omega",Font.BOLD,18));
        panel.add(d);

        textDeposit = new JTextField();
        textDeposit.setBounds(330,420,300,30);
        panel.add(textDeposit);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel label = new JLabel(i2);
        label.setBounds(750,170,200,200);
        panel.add(label);

        add = new JButton("Add");
        add.setBounds(150,500,100,30);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("Back");
        back.setBounds(300,500,100,30);
        back.addActionListener(this);
        panel.add(back);



        //setUndecorated(true);
        setLayout(null);
        setLocation(700,150);
        setSize(1020,700);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
                Temp c = new Temp();
                String s1 = (String)comboBox1.getSelectedItem();
                String s2 = textFieldnumber.getText();
                String s3 = textname.getText();
                String s4 = (String)gender1.getSelectedItem();
                String s5 = textcountry.getText();
                String s6 = c1.getSelectedItem();
                String s7 = date.getText();
                String s8 = textDeposit.getText();

                try{

                String q = "insert into customer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"', '"+s5+"', '"+s6+"','"+s7+"' ,'"+s8+"')";
                String q1 = "update room set availability = 'Occupied' where roomnumber = "+s6;
                 c.statement.executeUpdate(q);
                 c.statement.executeUpdate(q1);

                JOptionPane.showMessageDialog(null,"Added Successfully ");
                setVisible(false);


            }catch(Exception E){
                E.printStackTrace();
            }

        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new NewCustomer();

    }
}
