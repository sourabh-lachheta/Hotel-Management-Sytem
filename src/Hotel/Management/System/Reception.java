package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    JButton   room, allEmpInfo, customerInfo,managerInfo, checkOut, updateCheck, updateRoomStatus, pickUpS, searchRoom, logOut, back;

    Reception(){
        JButton newCustomer = new JButton("New customer");
        newCustomer.setBounds(70,40,370,30);
        newCustomer.setFont(new Font("GC Omega",Font.BOLD,15 ));
        add(newCustomer);
        newCustomer.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{

                }catch(Exception E){
                    E.printStackTrace();
                }
            }

        });


        room = new JButton("Room");
        room.setBounds(70,80, 370,30);
        room.setFont(new Font("GC Omega",Font.BOLD,15));
        add(room);
        room.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{

                }catch(Exception E){
                    E.printStackTrace();
                }
            }

        });

        allEmpInfo = new JButton("All employee info");
        allEmpInfo.setBounds(70,120,370,30);
        allEmpInfo.setFont(new Font("GC Omega", Font.BOLD,15));
        add(allEmpInfo);
        allEmpInfo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{

                }catch(Exception E){
                    E.printStackTrace();
                }
            }

        });

        customerInfo = new JButton("Customer info");
        customerInfo.setBounds(70,160,370,30);
        customerInfo.setFont(new Font("GC Omega",Font.BOLD,15));
        add(customerInfo);
        customerInfo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{

                }catch(Exception E){
                    E.printStackTrace();
                }
            }

        });

        managerInfo = new JButton("Manager info");
        managerInfo.setBounds(70, 200,370,30);
        managerInfo.setFont(new Font("GC Omega",Font.BOLD,15));
        add(managerInfo);
        managerInfo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{

                }catch(Exception E){
                    E.printStackTrace();
                }
            }

        });

        checkOut = new JButton("Check out");
        checkOut.setBounds(70,240,370,30);
        checkOut.setFont(new Font("GC Omega",Font.BOLD,15));
        add(checkOut);
        checkOut.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{

                }catch(Exception E){
                    E.printStackTrace();
                }
            }

        });

        updateCheck = new JButton("Update check");
        updateCheck.setBounds(70,280,370,30);
        updateCheck.setFont(new Font("GC Omega",Font.BOLD,15));
        add(updateCheck);
        updateCheck.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{

                }catch(Exception E){
                    E.printStackTrace();
                }
            }

        });

        updateRoomStatus = new JButton("update room status");
        updateRoomStatus.setBounds(70,320,370,30);
        updateRoomStatus.setFont(new Font("GC Oemga",Font.BOLD,15));
        add(updateRoomStatus);
        updateRoomStatus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{

                }catch(Exception E){
                    E.printStackTrace();
                }
            }

        });

        pickUpS = new JButton("Pick up service");
        pickUpS.setBounds(70,360,370,30);
        pickUpS.setFont(new Font("GC Oemga",Font.BOLD,15));
        add(pickUpS);
        pickUpS.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{

                }catch(Exception E){
                    E.printStackTrace();
                }
            }

        });

        searchRoom = new JButton("Search room");
        searchRoom.setBounds(70,400,370,30);
        searchRoom.setFont(new Font("GC Oemga",Font.BOLD,15));
        add(searchRoom);
        searchRoom.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{

                }catch(Exception E){
                    E.printStackTrace();
                }
            }

        });

        logOut = new JButton("Logout");
        logOut.setBounds(83,440,160,30);
        logOut.setFont(new Font("GC Oemga",Font.BOLD,15));
        add(logOut);
        logOut.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    if(e.getSource() == logOut){
                        new Login();
                        setVisible(false);

                    }

                }catch(Exception E){
                    E.printStackTrace();
                }
            }

        });

        back = new JButton("Back");
        back.setBounds(263,440,160,30);
        back.setFont(new Font("GC Oemga",Font.BOLD,15));
        add(back);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    new DashBoard();
                    setVisible(false);

                }catch(Exception E){
                    E.printStackTrace();
                }
            }

        });









        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(10,10,500,843);
        panel.setBackground(new Color(155,135,66,85));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(520,10,1156,843);
        panel1.setBackground(new Color(155,135,66,85));
        add(panel1);




        setLayout(null);
        setLocation(100,80);
        setSize(1700,900);
        //getContentPane().setBackground(new Color(155,135,66,85));
        setVisible(true);


    }


    public static void main(String[] args){
        new Reception();

    }
}
