package gym_management_system;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class Home_Page extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    Font f,f1,f2;
    JPanel p1;
    Home_Page() {
        super("Home Page");
        setSize(1600, 900);
        setLocation(0, 0);
        f = new Font("Lucida Fax", Font.BOLD, 20);
        f2 = new Font("Gadugi", Font.BOLD, 35);
        f1 = new Font("MS UI Gothic", Font.BOLD, 18);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("gym_management_system/Icons/home.jpg"));
        Image img = ic.getImage().getScaledInstance(1600, 900, Image.SCALE_DEFAULT);
        ImageIcon ic1 = new ImageIcon(img);
        l1 = new JLabel(ic1);

        JMenuBar m1 = new JMenuBar();
        JMenu men1 = new JMenu("Master");
        JMenuItem ment1 = new JMenuItem("Add Trainer");
        JMenuItem ment2 = new JMenuItem("Add Customer");

        ImageIcon ic2 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img2 = ic2.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ImageIcon ic3 = new ImageIcon(img2);
        ment1.setIcon(ic3);
        ment1.setMnemonic('T');
        ment1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));

        ImageIcon ic4 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img3 = ic4.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment2.setIcon(new ImageIcon(img3));
        ment2.setMnemonic('C');
        ment2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));


//        JMenu men2 = new JMenu("Attendance");
//        JMenuItem ment3 = new JMenuItem("Trainer Attendance");
//        JMenuItem ment4 = new JMenuItem("Customer Attendance");
//
//        ImageIcon ic5 = new ImageIcon(ClassLoader.getSystemResource(""));
//        Image img4 = ic5.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
//        ment3.setIcon(new ImageIcon(img4));
//        ment3.setMnemonic('A');
//        ment3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
//
//        ImageIcon ic6 = new ImageIcon(ClassLoader.getSystemResource(""));
//        Image img5 = ic6.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
//        ment4.setIcon(new ImageIcon(img5));
//        ment4.setMnemonic('U');
//        ment4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));


        JMenu men3 = new JMenu("Personal Information");
        JMenuItem ment5 = new JMenuItem("Trainer Information");
        JMenuItem ment6 = new JMenuItem("Customer Information");

        ImageIcon ic7 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img6 = ic7.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment5.setIcon(new ImageIcon(img6));
        ment5.setMnemonic('p');
        ment5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));

        ImageIcon ic8 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img7 = ic8.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment6.setIcon(new ImageIcon(img7));
        ment6.setMnemonic('S');
        ment6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        JMenu men4 = new JMenu("Update Information");
        JMenuItem ment7 = new JMenuItem("Update Trainer");
        JMenuItem ment8 = new JMenuItem("Update Customer");

        ImageIcon ic9 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img8 = ic9.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment7.setIcon(new ImageIcon(img8));
        ment7.setMnemonic('D');
        ment7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));

        ImageIcon ic10 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img9 = ic10.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment8.setIcon(new ImageIcon(img9));
        ment8.setMnemonic('M');
        ment8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));

        JMenu men5 = new JMenu("Fees Information");
        JMenuItem ment9 = new JMenuItem("Trainer Fees");
        JMenuItem ment10 = new JMenuItem("Customer Fees");

        ImageIcon ic11 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img10 = ic11.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment9.setIcon(new ImageIcon(img10));
        ment9.setMnemonic('F');
        ment9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));

        ImageIcon ic12 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img11 = ic12.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment10.setIcon(new ImageIcon(img11));
        ment10.setMnemonic('T');
        ment10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));

//        JMenu men6 = new JMenu("All Details");
//        JMenuItem ment11 = new JMenuItem("Gym Details");
//        JMenuItem ment12 = new JMenuItem("Gym Gadgets");
//
//        ImageIcon ic13 = new ImageIcon(ClassLoader.getSystemResource(""));
//        Image img12 = ic13.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
//        ment11.setIcon(new ImageIcon(img12));
//        ment11.setMnemonic('G');
//        ment11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
//
//        ImageIcon ic14 = new ImageIcon(ClassLoader.getSystemResource(""));
//        Image img13 = ic14.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
//        ment12.setIcon(new ImageIcon(img13));
//        ment12.setMnemonic('y');
//        ment12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));


        JMenu men7 = new JMenu("Exit");
        JMenuItem ment13 = new JMenuItem("Exit");
        ImageIcon ic15 = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img14 = ic15.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        ment13.setIcon(new ImageIcon(img14));
        ment13.setMnemonic('X');
        ment13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

//        JMenu men8 = new JMenu("Exercise Routine");
//        JMenuItem ment14 = new JMenuItem("Exercise Images");
//        JMenuItem ment15 = new JMenuItem("BMR Calculator");

//        ImageIcon ic16 = new ImageIcon(ClassLoader.getSystemResource(""));
//        Image img15 = ic16.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
//        ment14.setIcon(new ImageIcon(img15));
//        ment14.setMnemonic('E');
//        ment14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
//
//        ImageIcon ic17 = new ImageIcon(ClassLoader.getSystemResource(""));
//        Image img16 = ic17.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
//        ment15.setIcon(new ImageIcon(img16));
//        ment15.setMnemonic('B');
//        ment15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));

        men1.add(ment1);
        men1.add(ment2);

//        men2.add(ment3);
//        men2.add(ment4);

        men3.add(ment5);
        men3.add(ment6);

        men4.add(ment7);
        men4.add(ment8);

        men5.add(ment9);
        men5.add(ment10);

//        men6.add(ment11);
//        men6.add(ment12);

        men7.add(ment13);

//        men8.add(ment14);
//        men8.add(ment15);

        m1.add(men1);
//        m1.add(men2);
        m1.add(men3);
        m1.add(men4);
        m1.add(men5);
//        m1.add(men6);
        m1.add(men7);
//        m1.add(men8);

        men1.setFont(f);
//        men2.setFont(f);
        men3.setFont(f);
        men4.setFont(f);
        men5.setFont(f);
//        men6.setFont(f);
        men7.setFont(f);
//        men8.setFont(f);

        ment1.setFont(f1);
        ment2.setFont(f1);
//        ment3.setFont(f1);
//        ment4.setFont(f1);
        ment5.setFont(f1);
        ment6.setFont(f1);
        ment7.setFont(f1);
        ment8.setFont(f1);
        ment9.setFont(f1);
        ment10.setFont(f1);
//        ment11.setFont(f1);
//        ment12.setFont(f1);
        ment13.setFont(f1);
//        ment14.setFont(f1);
//        ment15.setFont(f1);

        m1.setBackground(Color.black);

        men1.setForeground(Color.GRAY);
//        men2.setForeground(Color.GRAY);
        men3.setForeground(Color.GRAY);
        men4.setForeground(Color.GRAY);
        men5.setForeground(Color.GRAY);
//        men6.setForeground(Color.GRAY);
        men7.setForeground(Color.RED);
//        men8.setForeground(Color.GRAY);

        ment1.setBackground(Color.black);
        ment2.setBackground(Color.black);
//        ment3.setBackground(Color.black);
//        ment4.setBackground(Color.black);
        ment5.setBackground(Color.black);
        ment6.setBackground(Color.black);
        ment7.setBackground(Color.black);
        ment8.setBackground(Color.black);
        ment9.setBackground(Color.black);
        ment10.setBackground(Color.black);
//        ment11.setBackground(Color.black);
//        ment12.setBackground(Color.black);
        ment13.setBackground(Color.black);
//        ment14.setBackground(Color.black);
//        ment15.setBackground(Color.black);

        ment1.setForeground(Color.yellow);
        ment2.setForeground(Color.yellow);
//        ment3.setForeground(Color.yellow);
//        ment4.setForeground(Color.yellow);
        ment5.setForeground(Color.yellow);
        ment6.setForeground(Color.yellow);
        ment7.setForeground(Color.yellow);
        ment8.setForeground(Color.yellow);
        ment9.setForeground(Color.yellow);
        ment10.setForeground(Color.yellow);
//        ment11.setForeground(Color.yellow);
//        ment12.setForeground(Color.yellow);
        ment13.setForeground(Color.RED);
//        ment14.setForeground(Color.yellow);
//        ment15.setForeground(Color.yellow);

        ment1.addActionListener(this);
        ment2.addActionListener(this);
//        ment3.addActionListener(this);
//        ment4.addActionListener(this);
        ment5.addActionListener(this);
        ment6.addActionListener(this);
        ment7.addActionListener(this);
        ment8.addActionListener(this);
        ment9.addActionListener(this);
        ment10.addActionListener(this);
//        ment11.addActionListener(this);
//        ment12.addActionListener(this);
        ment13.addActionListener(this);
//        ment14.addActionListener(this);
//        ment15.addActionListener(this);


        setJMenuBar(m1);
        add(l1);
    }
    public void actionPerformed(ActionEvent e) {
        String comnd = e.getActionCommand();
        if (comnd.equals("Add Trainer")) {
            new Add_Trainer().setVisible(true);
        } 
      else if (comnd.equals("Add Customer")) 
       {
            new Add_Customer().setVisible(true);
        } 
    //else if (comnd.equals("Trainer Attendance")) {
//            new Trainer_Attendance().setVisible(true);
//        } else if (comnd.equals("Customer Attendance")) {
//            new Customer_Attendance().setVisible(true);
//        }
      else if 
              (comnd.equals("Trainer Information")) {
            new Trainer_Information().setVisible(true);
        } 
      else if (comnd.equals("Customer Information")) {
            new Customer_Information().setVisible(true);
        } 
      else if (comnd.equals("Update Trainer")) {
            new Update_Trainer().setVisible(true);
        }
      else if (comnd.equals("Update Customer")) {
            new Update_Customer().setVisible(true);
        }
      else if (comnd.equals("Trainer Fees")) {
            new Trainer_Fees().setVisible(true);
        } 
else if (comnd.equals("Customer Fees")) {
            new Customer_Fees().setVisible(true);
        }
//else if (comnd.equals("Gym Details")) {
//            new Gym_Details().setVisible(true);
//        } else if (comnd.equals("Gym Gadgets")) {
//            new Gym_Gadgets().setVisible(true);
//        } else if (comnd.equals("Exercises Images")) {
//            new Exercises_Split().setVisible(true);
//        } else if (comnd.equals("BMR Calculator")) {
//            new BMR_Calculator().setVisible(true);
//        }
    else if(comnd.equals("Exit")) {
            System.exit(0);
      }
    }


    public static void main(String[] args)
    {
        new Home_Page().setVisible(true);
    }
}
