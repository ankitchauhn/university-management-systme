package university;

import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class student_all_details extends JFrame implements ActionListener
{
    JTable t;
    JButton bt1;
    String x[]={"roll no","Firsr Half","Second Half","date"};
    String y[][]=new String [20][4];
    int i=0,j=0;
    student_all_details()
    {
        setSize(900,400);
        setLocation(100,100);
        
        try
        {
            connection obj=new connection();
            String q="select * from attendence";
            ResultSet rest=obj.stm.executeQuery(q);
            while(rest.next())
            {
                y[i][j++]=rest.getString("rol_no");
                y[i][j++]=rest.getString("first_half_attendence");
                y[i][j++]=rest.getString("second_half_attendence");
                y[i][j++]=rest.getString("date");
                i++;
                j=0;
            }
            t=new JTable(y,x);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        JScrollPane sp=new JScrollPane(t);
        bt1=new JButton("print");
        add(bt1,"South");
        //ad(p);
        JScrollPane js=new JScrollPane(t);
        add(js);
        bt1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ev)
    {
        if(ev.getSource()==bt1)
        {
            try
            {
                t.print();
            }
            catch(Exception evx)
            {
                evx.printStackTrace();
            }
            
        }
    }
    public static void main(String args[])
    {
        new student_all_details().setVisible(true);
    }
}
