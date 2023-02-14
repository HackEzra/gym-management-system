package gym_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Update_Customer extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10;
    Choice ch1,ch2,ch3,ch4,ch5,ch6;
    JButton bt1,bt2,bt3,bt4;
    JPanel p1,p2,p3;
    Font f1,f;
    
    Update_Customer()
    {
        super("Customer add");
        setSize(750,700);
        setLocation(10,10);
        setResizable(false);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("gym_management_system/Icons/trainer5.jpg"));
        Image im=img.getImage().getScaledInstance(300,500,Image.SCALE_DEFAULT);
        l15=new JLabel(new ImageIcon(im));
        
        f1=new Font("Lucida Fax",Font.BOLD,25);
        f=new Font("MS UI Gothic",Font.BOLD,18);
        
        l1=new JLabel("Name");
        l2=new JLabel("Father's name");
        l3=new JLabel("Email");
        l4=new JLabel("Addrress");
        l5=new JLabel("Contect no");
        l7=new JLabel("Membership Catogery");
        l8=new JLabel("Recepit No");
        l9=new JLabel("Payments Plane (month)");
        l10=new JLabel("Gender");
        l11=new JLabel("Height (inc)");
        l12=new JLabel("Weight (kg)");
        l13=new JLabel("Remarks");
        l14=new JLabel("Welcome New Future BodyBuilder");
        l17=new JLabel("Trainer Name");
        
        l14.setFont(f1);
        l14.setForeground(Color.YELLOW);
        l14.setHorizontalAlignment(JLabel.CENTER);
        
        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();
        tf4=new JTextField();
        tf5=new JTextField();
        tf8=new JTextField();
        tf9=new JTextField();
        tf10=new JTextField();
        
        ch1=new Choice();
        ch2=new Choice();
        ch3=new Choice();
        ch5=new Choice();
        ch6=new Choice();
        
        try
        {
            ConnectionClass obj3=new ConnectionClass();
            String q3="select id from add_customer";
            ResultSet rest3=obj3.stm.executeQuery(q3);
            while(rest3.next())
            {
                ch6.add(rest3.getString("id"));
            }
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        
        ch1.add("Personal");
        ch1.add("Public");
        
        ch2.add("1");
        ch2.add("3");
        ch2.add("6");
        ch2.add("12");
        
        ch3.add("Male");
        ch3.add("Female");
        
        bt1=new JButton("Update");
        bt2=new JButton("Cancel");
        
        bt1.setBackground(Color.BLACK);
        bt1.setForeground(Color.CYAN);
        bt2.setBackground(Color.BLACK);
        bt2.setForeground(Color.RED);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        l5.setFont(f);
        l7.setFont(f);
        l8.setFont(f);
        l9.setFont(f);
        l10.setFont(f);
        l11.setFont(f);
        l12.setFont(f);
        l13.setFont(f);
        l17.setFont(f);
        
        tf1.setFont(f);
        tf2.setFont(f);
        tf3.setFont(f);
        tf4.setFont(f);
        tf5.setFont(f);
        tf8.setFont(f);
        tf9.setFont(f);
        tf10.setFont(f);
        
        ch1.setFont(f);
        ch2.setFont(f);
        ch3.setFont(f);
        ch5.setFont(f);
        ch6.setFont(f);
        
        bt1.setFont(f);
        bt2.setFont(f);
        
        bt3=new JButton("Public");
        bt4=new JButton("Personal");
        
        bt3.setBackground(Color.BLACK);
        bt3.setForeground(Color.WHITE);
        bt4.setBackground(Color.BLACK);
        bt4.setForeground(Color.WHITE);
        
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(15,2,10,10));
        p1.add(l8);
        p1.add(ch6);
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(l3);
        p1.add(tf3);
        p1.add(l4);
        p1.add(tf4);
        p1.add(l5);
        p1.add(tf5);
        
        
        p1.add(l9);
        p1.add(ch2);
        p1.add(l10);
        p1.add(ch3);
        p1.add(l11);
        p1.add(tf8);
        p1.add(l12);
        p1.add(tf9);
        p1.add(l13);
        p1.add(tf10);
        p1.add(bt3);
        p1.add(bt4);
        p1.add(l7);
        p1.add(ch1);
        p1.add(l17);
        p1.add(ch5);
        
        p1.add(bt1);
        p1.add(bt2);
        
        p1.setBackground(Color.BLACK);
        
        p2=new JPanel();
        p2.setLayout(new GridLayout(1,1,10,10));
        p2.setBackground(Color.BLACK);
        p2.add(l14);
        
        p3=new JPanel();
        p3.setLayout(new GridLayout(1,1,10,10));
        p3.setBackground(Color.BLACK);
        p3.add(l15);
        
        l1.setForeground(Color.WHITE);
        l2.setForeground(Color.WHITE);
        l3.setForeground(Color.WHITE);
        l4.setForeground(Color.WHITE);
        l5.setForeground(Color.WHITE);
        l7.setForeground(Color.WHITE);
        l8.setForeground(Color.WHITE);
        l9.setForeground(Color.WHITE);
        l10.setForeground(Color.WHITE);
        l11.setForeground(Color.WHITE);
        l12.setForeground(Color.WHITE);
        l13.setForeground(Color.WHITE);
        l17.setForeground(Color.WHITE);
        
        setLayout(new BorderLayout(0,0));
        
        add(p2,"North");
        add(p3,"West");
        add(p1,"Center");
        
        ch6.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent arg0)
            {
                try
                {
                    ConnectionClass obj2=new ConnectionClass();
                    int recipt_id=Integer.parseInt(ch6.getSelectedItem());
                    String querry="select * from add_customer where id='"+recipt_id+"'";
                    ResultSet rest1=obj2.stm.executeQuery(querry);
                    while(rest1.next())
                    {
                        tf1.setText(rest1.getString("name"));
                        tf2.setText(rest1.getString("fname"));
                        tf3.setText(rest1.getString("email"));
                        tf4.setText(rest1.getString("address"));
                        tf5.setText(rest1.getString("contactNo"));
                        tf8.setText(rest1.getString("height"));
                        tf9.setText(rest1.getString("weight"));
                        tf10.setText(rest1.getString("remarks"));
                    }
                }
                catch(Exception exx)
                {
                    exx.printStackTrace();
                }
            }
        });
    }
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            if(e.getSource()==bt3)
            {
                ConnectionClass obj1=new ConnectionClass();
                String q1="select * from add_trainer where category='Public'";
                ResultSet rest1=obj1.stm.executeQuery(q1);
                while(rest1.next())
                {
                    ch5.add(rest1.getString("name"));
                }
            }
            if(e.getSource()==bt4)
            {
                ConnectionClass obj1=new ConnectionClass();
                String q1="select * from add_trainer where category='Personal'";
                ResultSet rest1=obj1.stm.executeQuery(q1);
                while(rest1.next())
                {
                    ch5.add(rest1.getString("name"));
                }
            }
        String name=tf1.getText();
        String fname=tf2.getText();
        String email=tf3.getText();
        String address=tf4.getText();
        String cont=tf5.getText();
        String tcat=ch1.getSelectedItem();
        int tid=Integer.parseInt(ch6.getSelectedItem());
        String minag=ch2.getSelectedItem();
        String gender=ch3.getSelectedItem();
        float height=Float.parseFloat(tf8.getText());
        float weight=Float.parseFloat(tf9.getText());
        String remarks=tf10.getText();
        String tname=ch5.getSelectedItem();
        
        
            if(e.getSource()==bt1)
            {
                ConnectionClass obj=new ConnectionClass();
                String q="update add_customer set name='"+name+"',fname='"+fname+"',email='"+email+"',address='"+address+"',contactNo='"+cont+"',payments_plan='"+minag+"',gender='"+gender+"',height='"+height+"',weight='"+weight+"',remarks='"+remarks+"',trainer_name='"+tname+"',category='"+tcat+"' where id='"+tid+"' ";
                obj.stm.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Data Insert.....");
                setVisible(false);            
            }
            if(e.getSource()==bt2)
            {
                JOptionPane.showMessageDialog(null,"Are you Sure?");
                setVisible(false);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        new Update_Customer().setVisible(true);
    }
}
