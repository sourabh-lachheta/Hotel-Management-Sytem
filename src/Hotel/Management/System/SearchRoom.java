package Hotel.Management.System;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class SearchRoom extends JFrame implements ActionListener {
    JTable table;
    JButton search, back;
    JCheckBox checkbox;
    Choice choice;
    SearchRoom(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,5,1010,690);
        panel.setBackground(new Color(155,135,66,85));
        add(panel);

        JLabel H = new JLabel("Search For Room");
        H.setBounds(400,10,300,50);
        H.setFont(new Font("GC Omega",Font.BOLD,20));
        panel.add(H);

        JLabel Roombed = new JLabel("Room Bed");
        Roombed.setBounds(50,80, 120,30);
        Roombed.setFont(new Font("GC Omega", Font.BOLD,18));
        panel.add(Roombed);

        checkbox = new JCheckBox("Only Display Available");
        checkbox.setBounds(750,80,200,30);
        checkbox.setFont(new Font("GC Omega", Font.BOLD,16));
        checkbox.setBackground(new Color(155,135,66,85));
        panel.add(checkbox);

        choice = new Choice();
        choice.add("Single");
        choice.add("Double");
        choice.setBounds(170,80,150,30);
        choice.setFont(new Font("GC Omega", Font.BOLD,16));
        panel.add(choice);





        JLabel availability = new JLabel("Availability");
        availability.setBounds(240,150,200,20);
        availability.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(availability);

        JLabel clean = new JLabel("Clean Status");
        clean.setBounds(420,150,200,20);
        clean.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(clean);

        JLabel price = new JLabel("Price");
        price.setBounds(600,150,200,20);
        price.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(price);

        JLabel bed = new JLabel("Bed Type");
        bed.setBounds(770,150,200,20);
        bed.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(bed);

        JLabel roomN = new JLabel("Room No");
        roomN.setBounds(60,150,200,20);
        roomN.setFont(new Font("GC Omega",Font.BOLD,16));
        panel.add(roomN);

        search = new JButton("search");
        search.setBounds(340,500,100,30);
        search.addActionListener(this);
        panel.add(search);

        back = new JButton("Back");
        back.setBounds(510,500,100,30);
        back.addActionListener(this);
        panel.add(back);



        table = new JTable();
        table.setBounds(50,180,900,400);
       // table.setBackground(new Color(155,135,66,85));
        table.setFont(new Font("GC Omega",Font.BOLD,12));
        panel.add(table);

        try{
            Temp c = new Temp();
            String roomInfo = "select * from room";
            ResultSet resultset = c.statement.executeQuery(roomInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultset));

        }catch(Exception e){
            e.printStackTrace();
        }






       //setUndecorated(true);
        setLayout(null);
        setLocation(700,150);
        setSize(1020,700);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == search){
            String q = "select * from room where bed_type = '"+choice.getSelectedItem()+"'";
            String q1 = "select * from room where availability = 'Available' bed_type = '"+choice.getSelectedItem()+"'";

            try{
                Temp c = new Temp();
                ResultSet resultSet = c.statement.executeQuery(q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));

                if(checkbox.isSelected()){
                    ResultSet resultSet1 = c.statement.executeQuery(q1);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet1));
                }

            }catch(Exception E){
                E.printStackTrace();
            }

        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new SearchRoom();
    }
}
