package university;

import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class student_fee_form extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JButton bt1,bt2;
    JTextField t1,t2,t3,t4;
    Choice ch1,ch2,ch3,ch4;
    Font f;
    JPanel p;
    student_fee_form()
    {
       super("Student Fee Form");
       setSize(600,300);
       setLocation(100,100);
       
       f=new Font("Arial",Font.BOLD,16);
       l1=new JLabel("Select Roll no");
       l2=new JLabel("Name");
       l3=new JLabel("Father's Name");
       l4=new JLabel("Branch");
       l5=new JLabel("Cource");
       //l6=new JLabel("Semester");
       l7=new JLabel("Total Paybill/Year");
       
       t1=new JTextField(15);
       t2=new JTextField(15);
       t3=new JTextField(15);
       //t4=new JTextField(15);
       
       ch1=new Choice();
       ch2=new Choice();
       ch3=new Choice();
       //ch4=new Choice();
       
       bt1=new JButton("Pay");
       bt2=new JButton("Back");
       
       bt1.addActionListener(this);
       bt2.addActionListener(this);
       
       bt1.setBackground(Color.BLACK);
       bt1.setForeground(Color.WHITE);
       
       bt2.setBackground(Color.BLACK);
       bt2.setForeground(Color.WHITE);
       
       l1.setFont(f);
       l2.setFont(f);
       l3.setFont(f);
       l4.setFont(f);
       l5.setFont(f);
       l7.setFont(f);
       t1.setFont(f);
       t2.setFont(f);
       t3.setFont(f);
       ch1.setFont(f);
       ch2.setFont(f);
       ch3.setFont(f);
       bt1.setFont(f);
       bt2.setFont(f);
       
       
       try
       {
           connection obj=new connection();
           String q="select * from new_student_add";
           ResultSet rest=obj.stm.executeQuery(q);
           while(rest.next())
           {
               ch1.add(rest.getString(1));
           }
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
       
       //String rollno=ch1.getSelectedItem();
       ch1.addMouseListener(new MouseAdapter()
        {
           @Override
           public void mouseClicked(MouseEvent arg0)
           {
               String rollno=ch1.getSelectedItem();
               //t1.setText(tb.getModel().getValueAt(row,0).toString());
               try
               {
                   connection obj1=new connection();
                   String qq="select * from new_student_add where roll_no='"+rollno+"'";
                   ResultSet rest1=obj1.stm.executeQuery(qq);
                   while(rest1.next())
                   {
                       t1.setText(rest1.getString(2));
                       t2.setText(rest1.getString(3));
                       ch2.add(rest1.getString(11));
                       ch3.add(rest1.getString(12));
                   }
               }
               catch(Exception exx)
               {
                   exx.printStackTrace();
               }
           }
        });
        
        
        p=new JPanel();
        p.setLayout(new GridLayout(7,2,10,10));
        
        p.add(l1);
        p.add(ch1);
        p.add(l2);
        p.add(t1);
        p.add(l3);
        p.add(t2);
        p.add(l4);
        p.add(ch2);
        p.add(l5);
        p.add(ch3);
       // p.add(l6);
        //p.add(t3);
        p.add(l7);
        p.add(t3);
        //p.add(t4);
        p.add(bt1);
        p.add(bt2);
        
        setLayout(new BorderLayout(30,30));
        add(p,"Center");
    }
    public void actionPerformed(ActionEvent ev)
    {
        String roll_no=ch1.getSelectedItem();
        String name=t1.getText();
        String father_name=t2.getText();
        String branch=ch2.getSelectedItem();
        String cource=ch3.getSelectedItem();
        String total=t3.getText();
        if(ev.getSource()==bt1)
        {
            try
            {
                connection obj2=new connection();
                String qqq="insert into student_fee_paybill values('"+roll_no+"','"+name+"','"+father_name+"','"+branch+"','"+cource+"','"+total+"')";
                obj2.stm.executeUpdate(qqq); 
                JOptionPane.showMessageDialog(null,"Fee Submited Successfull");
                setVisible(false);
            }
            catch(Exception exx)
            {
                exx.printStackTrace();
            }
        }
        if(ev.getSource()==bt2)
        {
            JOptionPane.showMessageDialog(null,"are you sure to cancel");
            this.setVisible(false);
        }
    }
    public static void main(String args[])
    {
        new student_fee_form().setVisible(true);
    }
    
}
