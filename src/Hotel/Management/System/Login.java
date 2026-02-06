package Hotel.Management.System;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JTextField textField1;
    JPasswordField passwordField1;
    JButton b1, b2;
    Login(){
        JLabel label1 = new JLabel("Username");
        label1.setBounds(60,80, 200,30);
        label1.setFont(new Font("CG Omega",Font.BOLD,20));
        add(label1);

        JLabel label2 = new JLabel("Password");
        label2.setBounds(60,120,200,30);
        label2.setFont(new Font("CG Omega",Font.BOLD,20));
        add(label2);

        textField1 = new JTextField();
        textField1.setBounds(180, 80,250,30);
        textField1.setFont(new Font("CG Omega",Font.PLAIN,19));
        add(textField1);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(180, 120, 250,30);
        passwordField1.setFont(new Font("CG Omega",Font.PLAIN,19));
        add(passwordField1);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/tt.jpeg"));
        Image i2 = imageIcon.getImage().getScaledInstance(583,470,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        //JLabel label = new JLabel(imageIcon);
        label.setBounds(465,-35,500,520);
        add(label);

        b1 = new JButton("Login");
        b1.setBounds(75,175,120,30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(240, 175,120,30);
        b2.addActionListener(this);
        add(b2);








        setLayout(null);
        getContentPane().setBackground(new Color(155, 135, 66, 89));
        setLocation(480,200);
        setSize(980,500);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            try{
                Temp c = new Temp();
                String user = textField1.getText();
                String pass = passwordField1.getText();

                String q = "select * from login where username = '"+user+"' and password = '"+pass+"'";
                ResultSet resultSet = c.statement.executeQuery(q);

                if(resultSet.next()){
                    new DashBoard();
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid");
                }


            }catch(Exception E){
                E.printStackTrace();
            }

        }else{
            System.exit(102);

        }

    }

    public static void main(String[] args){
       new Login();
    }
}
