package university;

import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class homepage extends JFrame implements ActionListener
{
    JLabel l1,l2;
    homepage()
    {
        super("Home Page");
        setVisible(true);
        setSize(1600,690);
        
        //Background Image
        
        ImageIcon bg=new ImageIcon(ClassLoader.getSystemResource("university/icons/earth1.jpg"));
        Image bgimg=bg.getImage().getScaledInstance(1600,690,Image.SCALE_DEFAULT);
        ImageIcon bg1=new ImageIcon(bgimg);
        l1=new JLabel(bg1);
        
        JMenuBar mb=new JMenuBar();
        JMenu men1=new JMenu("Master");
        JMenuItem mt1=new JMenuItem("New Faculty");
        JMenuItem mt2=new JMenuItem("New Student Addmission");
        //men1.setForeground(Color.RED);
        
        //new Faculty
        
        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon1.png"));
        Image img1=ii1.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt1.setIcon(new ImageIcon(img1));
        mt1.setMnemonic('M');
        mt1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
//        mt1.setBackground(Color.BLACK);
//        mt1.setForeground(Color.WHITE);
        
        //new student addmission
        
        ImageIcon ii2=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon2.png"));
        Image img2=ii2.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt2.setIcon(new ImageIcon(img2));
        mt2.setMnemonic('S');
        mt2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
//        mt2.setBackground(Color.BLACK);
//        mt2.setForeground(Color.WHITE);
        
        mt1.addActionListener(this);
        mt2.addActionListener(this);
        //....................
        
        JMenu men2=new JMenu("Details");
        JMenuItem mt19=new JMenuItem("Details");
        //men2.setForeground(Color.BLUE);
        
        //Details Information
        
        ImageIcon ii19=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon9.png"));
        Image img18=ii19.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt19.setIcon(new ImageIcon(img18));
        mt19.setMnemonic('H');
        mt19.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.CTRL_MASK));
//        mt19.setBackground(Color.BLACK);
//        mt19.setForeground(Color.WHITE);
        
        mt19.addActionListener(this);
        
        //....................

        JMenu men3=new JMenu("Attendunce");
        JMenuItem mt3=new JMenuItem("Student Attendunce");
        JMenuItem mt4=new JMenuItem("Teacher Attendunce");
        //men3.setForeground(Color.RED);
        
        //Student attendunce
        
        ImageIcon ii3=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon4.jpg"));
        Image img3=ii3.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt3.setIcon(new ImageIcon(img3));
        mt3.setMnemonic('T');
        mt3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
//        mt3.setBackground(Color.BLACK);
//        mt3.setForeground(Color.WHITE);
        
        //Teacher Attendunce
        
        ImageIcon ii4=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon9.png"));
        Image img4=ii4.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt4.setIcon(new ImageIcon(img4));
        mt4.setMnemonic('D');
        mt4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
//        mt4.setBackground(Color.BLACK);
//        mt4.setForeground(Color.WHITE);
        
        mt3.addActionListener(this);
        mt4.addActionListener(this);
        
        //.........................
        
        JMenu men4=new JMenu("Attendunce Details");
        JMenuItem mt5=new JMenuItem("Student all details");
        JMenuItem mt6=new JMenuItem("Teacher all details");
        
        //student all Detail
        
        ImageIcon ii5=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon17.png"));
        Image img5=ii5.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt5.setIcon(new ImageIcon(img4));
        mt5.setMnemonic('A');
        mt5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
//        mt5.setBackground(Color.BLACK);
//        mt5.setForeground(Color.WHITE);
        
        //teacher all detail
        
        ImageIcon ii6=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon15.png"));
        Image img6=ii6.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt6.setIcon(new ImageIcon(img6));
        mt6.setMnemonic('Q');
        mt6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,ActionEvent.CTRL_MASK));
//        mt6.setBackground(Color.BLACK);
//        mt6.setForeground(Color.WHITE);
        
        mt5.addActionListener(this);
        mt6.addActionListener(this);
        
        //.........................
        
        JMenu men5=new JMenu("Examination");
        JMenuItem mt7=new JMenuItem("Examination Details");
        JMenuItem mt8=new JMenuItem("Enter Marks");
        
        //Examination fee_details
        
        ImageIcon ii7=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon11.png"));
        Image img7=ii7.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt7.setMnemonic('E');
        mt7.setIcon(new ImageIcon(img7));
        mt7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
//        mt7.setBackground(Color.BLACK);
//        mt7.setForeground(Color.WHITE);
        
        //Enter Marks
        
        ImageIcon ii8=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon16.png"));
        Image img8=ii8.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt8.setIcon(new ImageIcon(img8));
        mt8.setMnemonic('R');
        mt8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R ,ActionEvent.CTRL_MASK));
//        mt8.setBackground(Color.BLACK);
//        mt8.setForeground(Color.WHITE);
        
        mt7.addActionListener(this);
        mt8.addActionListener(this);
        
        //.........................
        
        JMenu men9=new JMenu("Update Details");
        JMenuItem mt10=new JMenuItem("Update Student");
        JMenuItem mt11=new JMenuItem("Update teacher");
        
        //update student fee_details
        
        ImageIcon ii10=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon3.png"));
        Image img9=ii10.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt10.setMnemonic('T');
        mt10.setIcon(new ImageIcon(img9));
        mt10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
//        mt10.setBackground(Color.BLACK);
//        mt10.setForeground(Color.WHITE);
        
        //update teacher fee_details
        
        ImageIcon ii11=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon13.jpg"));
        Image img10=ii11.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt11.setIcon(new ImageIcon(img10));
        mt11.setMnemonic('Y');
        mt11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,ActionEvent.CTRL_MASK));
//        mt11.setBackground(Color.BLACK);
//        mt11.setForeground(Color.WHITE);
        
        mt10.addActionListener(this);
        mt11.addActionListener(this);
        //.........................
        
        JMenu men10=new JMenu("Fee Details");
        JMenuItem mt12=new JMenuItem("See Structure");
        JMenuItem mt13=new JMenuItem("Student fee form");
        
        //update student fee_details
        
        ImageIcon ii12=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon11.png"));
        Image img11=ii12.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt12.setMnemonic('U');
        mt12.setIcon(new ImageIcon(img11));
        mt12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,ActionEvent.CTRL_MASK));
//        mt12.setBackground(Color.BLACK);
//        mt12.setForeground(Color.WHITE);
        
        //update teacher fee_details
        
        ImageIcon ii13=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon7.png"));
        Image img12=ii13.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt13.setIcon(new ImageIcon(img12));
        mt13.setMnemonic('I');
        mt13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,ActionEvent.CTRL_MASK));
//        mt13.setBackground(Color.BLACK);
//        mt13.setForeground(Color.WHITE);
        
        mt12.addActionListener(this);
        mt13.addActionListener(this);
        
        //.........................
        
        JMenu men11=new JMenu("Utility");
        JMenuItem mt14=new JMenuItem("Notepad");
        JMenuItem mt15=new JMenuItem("Chrome");
        JMenuItem mt16=new JMenuItem("Calculator");
        //men11.setForeground(Color.GREEN);
        
        //update Notepad fee_details
        
        ImageIcon ii14=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon12.png"));
        Image img13=ii14.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt14.setMnemonic('V');
        mt14.setIcon(new ImageIcon(img13));
        mt14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
//        mt14.setBackground(Color.BLACK);
//        mt14.setForeground(Color.WHITE);
        
        //update Chrome fee_details
        
        ImageIcon ii15=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon6.png"));
        Image img14=ii15.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt15.setIcon(new ImageIcon(img14));
        mt15.setMnemonic('O');
        mt15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
//        mt15.setBackground(Color.BLACK);
//        mt15.setForeground(Color.WHITE);
        
        //update Calculator fee_details
        
        ImageIcon ii16=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon10.png"));
        Image img15=ii16.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt16.setMnemonic('V');
        mt16.setIcon(new ImageIcon(img15));
        mt16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
//        mt16.setBackground(Color.BLACK);
//        mt16.setForeground(Color.WHITE);
        
        mt14.addActionListener(this);
        mt15.addActionListener(this);
        mt16.addActionListener(this);
        
        //.........................
        
        JMenu men12=new JMenu("About");
        JMenuItem mt17=new JMenuItem("About Page");
        
        //About fee_details
        
        ImageIcon ii17=new ImageIcon(ClassLoader.getSystemResource("university/icons/icon5.png"));
        Image img16=ii17.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt17.setIcon(new ImageIcon(img16));
        mt17.setMnemonic('L');
        mt17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
//        mt17.setBackground(Color.BLACK);
//        mt17.setForeground(Color.WHITE);
        
        mt17.addActionListener(this);
        //.........................
        
        JMenu men13=new JMenu("Exit");
        JMenuItem mt18=new JMenuItem("Exit page");
        men13.setForeground(Color.RED);
        //Exit fee_details
        
        ImageIcon ii18=new ImageIcon(ClassLoader.getSystemResource("university/icons/cancle.png"));
        Image img17=ii18.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        mt18.setIcon(new ImageIcon(img17));
        mt18.setMnemonic('K');
        mt18.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,ActionEvent.CTRL_MASK));
//        mt18.setBackground(Color.BLACK);
//        mt18.setForeground(Color.WHITE);
        
        mt18.addActionListener(this);
        
        men1.add(mt1);
        men1.add(mt2);
        men2.add(mt19);
        men3.add(mt3);
        men3.add(mt4);
        men4.add(mt5);
        men4.add(mt6);
        men5.add(mt7);
        men5.add(mt8);
        men9.add(mt10);
        men9.add(mt11);
        men10.add(mt12);
        men10.add(mt13);
        men11.add(mt14);
        men11.add(mt15);
        men11.add(mt16);
        men12.add(mt17);
        men13.add(mt18);
        
        mb.add(men1);
        mb.add(men2);
        mb.add(men3);
        mb.add(men4);
        mb.add(men5);
        mb.add(men9);
        mb.add(men10);
        mb.add(men11);
        mb.add(men12);
        mb.add(men13);
        
        setJMenuBar(mb);
        
        add(l1);
    }
    public void actionPerformed(ActionEvent ev)
    {
        String comnd=ev.getActionCommand();
        if(comnd.equals("New Faculty"))
        {
            new new_faculty().setVisible(true);
        }
        else if(comnd.equals("New Student Addmission"))
        {
            new new_student_addmission().setVisible(true);
        }
        else if(comnd.equals("Details"))
        {
            new fee_details().setVisible(true);
        }
        else if(comnd.equals("Student Attendunce"))
        {
            new student_attendunce().setVisible(true);
        }
        else if(comnd.equals("Teacher Attendunce"))
        {
            new teacher_attendunce().setVisible(true);
        }
        else if(comnd.equals("Student all details"))
        {
            new student_all_details().setVisible(true);
        }
        else if (comnd.equals("Teacher all details"))
        {
            new teacher_all_student().setVisible(true);
        }
        else if(comnd.equals("Examination Details"))
        {
            new examination_details().setVisible(true);
        }
        else if(comnd.equals("Enter Marks"))
        {
            new enter_marks().setVisible(true);
        }
        else if(comnd.equals("Update Student"))
        {
            new update_student().setVisible(true);
        }
        else if(comnd.equals("Update teacher"))
        {
            new update_teacher().setVisible(true);
        }
        else if(comnd.equals("See Structure"))
        {
            new see_structure().setVisible(true);
        }
        else if(comnd.equals("Student fee form"))
        {
            new student_fee_form().setVisible(true);
        }
        else if(comnd.equals("Notepad"))
        {
            System.out.println("notepad");
        }
        else if(comnd.equals("Chrome"))
        {
            System.out.println("chrome");
        }
        else if(comnd.equals("Calculator"))
        {
            System.out.println("calculator");
        }
        else if(comnd.equals("About Page"))
        {
            new about_page().setVisible(true);
        }
        else if(comnd.equals("Exit page"))
        {
            System.exit(0);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"sorry you press wrong button");
            setVisible(false);
        }        
    }
    public static void main(String args[])
    {
       new homepage().setVisible(true);
    }
}