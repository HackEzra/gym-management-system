package gym_management_system;

import gym_management_system.ConnectionClass;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class Customer_Information extends JFrame implements ActionListener {
    String x[] ={"Customer Id","Name","Father's name","Email","Address","Contact no","Payment Plan","Gender","Height","Weight","Remarks","Trainer name","catg."};
    JButton bt;
    JPanel p1,p2,p3;
    JLabel l1,l2;
    JTextField tf1;
    Font f1,f;
    String y[][]= new String[50][14];
    int i=0,j=0;
    JTable t;
    

    Customer_Information()
    {
        super("Customer Information");
        setSize(1500,400);
        setLocation(1,1);
        f= new Font("MS UI GOTHIC",Font.BOLD,15);
        try
        {
            ConnectionClass obj = new ConnectionClass();
            String q= "select * from add_customer";
            ResultSet rest = obj.stm.executeQuery(q);
            while (rest.next())
            {
                y[i][j++]=rest.getString("id");
                y[i][j++]=rest.getString("name");
                y[i][j++]=rest.getString("fname");
                y[i][j++]=rest.getString("email");
                y[i][j++]=rest.getString("address");
                y[i][j++]=rest.getString("contactNo");
                y[i][j++]=rest.getString("payments_plan");
                y[i][j++]=rest.getString("gender");
                 y[i][j++]=rest.getString("height");
                y[i][j++]=rest.getString("weight");
                y[i][j++]=rest.getString("remarks");
                y[i][j++]=rest.getString("trainer_name");
                y[i][j++]=rest.getString("category");
                i++;
                j=0;
            }
            t= new JTable(y,x);
            t.setFont(f);
            t.setBackground(Color.BLACK);
            t.setForeground(Color.WHITE);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        JScrollPane sp= new JScrollPane(t);

        f1= new Font("Lucida Fax",Font.BOLD,25);

        l1= new JLabel("Delete any Customer ?");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setFont(f1);
        l1.setForeground(Color.yellow);
        
         l2= new JLabel("Customer ID");
        l2.setFont(f1);
        l2.setForeground(Color.GRAY);

        p1= new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);

        tf1= new JTextField();
        bt=new JButton("Delete Customer");
        tf1.setFont(f);
        bt.setFont(f);

        bt.addActionListener(this);
        bt.setBackground(Color.BLACK);
        bt.setForeground(Color.RED);
        
       

        p2= new JPanel();
        p2.setLayout(new GridLayout(1,3,10,10));
        p2.add(l2);
        p2.add(tf1);
        p2.add(bt);

        p3=new JPanel();
        p3.setLayout(new GridLayout(2,1,10,10));
        p3.add(p1);
        p3.add(p2);

        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLACK);
        p3.setBackground(Color.BLACK);

        add(p3,"South");
        add(sp);

    }
  public void actionPerformed(ActionEvent e)
  {
      int id=Integer.parseInt(tf1.getText());
      if(e.getSource()==bt)
      {
          try
          {
            ConnectionClass obj1= new ConnectionClass();
            String q=" delete from add_customer where id='"+id+"' ";
            obj1.stm.executeUpdate(q);
            setVisible(false); 
            new Customer_Information().setVisible(true);
          }
          catch (Exception evx)
          {
              evx.printStackTrace();
          }
      }
  }
  public static void main(String args[])
  {
      new Customer_Information().setVisible(true);
  }
}










