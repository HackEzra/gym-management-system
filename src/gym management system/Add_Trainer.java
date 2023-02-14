


package gym_management_system;

import gym_management_system.ConnectionClass;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class Add_Trainer extends JFrame implements  ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10;
    Choice ch1,ch2,ch3;
    JButton bt1,bt2;
    JPanel p1,p2,p3;
    Font f1,f;
    public Add_Trainer() {
        super("Trainer add");
        setSize(750, 700);
        setLocation(10, 10);
        setResizable(false);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("gym_management_system/Icons/trainer5.jpg"));
        Image im = img.getImage().getScaledInstance(270, 620, Image.SCALE_DEFAULT);
        l15 = new JLabel(new ImageIcon(im));
        f1 = new Font("Lucida Fax", Font.BOLD, 25);
        f = new Font("MS UI Gothic", Font.BOLD, 18);

        l1 = new JLabel("Name");
        l2 = new JLabel("Father's name");
        l3 = new JLabel("Email");
        l4 = new JLabel("Address");
        l5 = new JLabel("Contact no.");
        l6 = new JLabel("Emergency no.");
        l7 = new JLabel("Trainer Category");
        l8 = new JLabel("Trainer ID");
        l9 = new JLabel("Min Aggrement");
         l10 = new JLabel("Gender");
        l11 = new JLabel("Height (inch)");
        l12 = new JLabel("weight (kg)");
        l13 = new JLabel("Remarks");
        l14 = new JLabel("Welcome New Trainer");

        l14.setFont(f1);
        l14.setForeground(Color.YELLOW);
        l14.setHorizontalAlignment(JLabel.CENTER);

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        tf8 = new JTextField();
        tf9 = new JTextField();
        tf10 = new JTextField();

        ch1 = new Choice();
        ch2 = new Choice();
        ch3 = new Choice();

        ch1.add("Public");
        ch1.add("Personal");

        ch2.add("3 Months");
        ch2.add("6 Months");
        ch2.add("1 year");
        ch2.add("2 year");
        ch2.add("5 year");

        ch3.add("Male");
        ch3.add("Female");

        bt1 = new JButton("Submit");
        bt2 = new JButton("Cancel");

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
        l6.setFont(f);
        l7.setFont(f);
        l8.setFont(f);
        l9.setFont(f);
        l10.setFont(f);
        l11.setFont(f);
        l12.setFont(f);
        l13.setFont(f);

        tf1.setFont(f);
        tf2.setFont(f);
        tf3.setFont(f);
        tf4.setFont(f);
        tf5.setFont(f);
        tf6.setFont(f);
        tf7.setFont(f);
        tf8.setFont(f);
        tf9.setFont(f);
        tf10.setFont(f);

        ch1.setFont(f);
        ch2.setFont(f);
        ch3.setFont(f);

        bt1.setFont(f);
        bt2.setFont(f);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(14, 2, 10, 10));

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
        p1.add(l6);
        p1.add(tf6);
        p1.add(l7);
        p1.add(ch1);
        p1.add(l8);
        p1.add(tf7);
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

        p1.add(bt1);
        p1.add(bt2);

        p1.setBackground(Color.BLACK);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 1, 10, 10));
        p2.setBackground(Color.BLACK);
        p2.add(l14);

        p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 1, 10, 10));
        p3.setBackground(Color.BLACK);
        p3.add(l15);

        l1.setForeground(Color.white);
        l2.setForeground(Color.white);
        l3.setForeground(Color.white);
        l4.setForeground(Color.white);
        l5.setForeground(Color.white);
        l6.setForeground(Color.white);
        l7.setForeground(Color.white);
        l8.setForeground(Color.white);
        l9.setForeground(Color.white);
        l10.setForeground(Color.white);
        l11.setForeground(Color.white);
        l12.setForeground(Color.white);
        l13.setForeground(Color.white);

        tf6.setForeground(Color.RED);

        setLayout(new BorderLayout(0, 0));

        add(p2, "North");
        add(p3, "West");
        add(p1, "Center");

    }
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==bt1) {
           String name = tf1.getText();
           String fname = tf2.getText();
           String email = tf3.getText();
           String address = tf4.getText();
           String cont = tf5.getText();
           String eno = tf6.getText();
           String tcat = ch1.getSelectedItem();
           int tid = Integer.parseInt(tf7.getText());
           String minag = ch2.getSelectedItem();
           String gender = ch3.getSelectedItem();
           float height = Float.parseFloat(tf8.getText());
           float weight = Float.parseFloat(tf9.getText());
           String remarks = tf10.getText();

           try {
               ConnectionClass obj = new ConnectionClass();
               String q= "insert into add_trainer values('"+tid+"','"+name+"','"+fname+"','"+email+
               "','"+address+"','"+cont+"','"+eno+"','"+tcat+"','"+minag+"','"+gender+"','"+height+"','"+weight+"','"+remarks+"')";
               obj.stm.executeUpdate(q);
               JOptionPane.showMessageDialog(null, "Data insert......");
               setVisible(false);
           } 
           catch (Exception ex) {
               ex.printStackTrace();
           }
           if (e.getSource() == bt2) {
               JOptionPane.showMessageDialog(null, "Are you Sure?");
               setVisible(false);
           }
       }
    }
 
   
    public static void main(String args[]) 
           {
            new Add_Trainer().setVisible(true);
        } 
    }

    
