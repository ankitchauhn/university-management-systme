package university;

import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class updateTeacher_record extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JButton bt1,bt2;
    JComboBox cm1,cm2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JPanel p1,p2,p3;
    String a[]={"Computer Science","Math","Chemistry","Physics","Electrical","Comors"};
    String b[]={"B.Tech","MCA","B.Sc","B.Sc Honors","B.A"};
    Font f,f1;
    
    updateTeacher_record()
    {
        
    }      
    updateTeacher_record(String sm)
    {
        super("Add Teacher");
        setSize(850,570);
        setResizable(false);
        setLocation(250,80);
        
        f=new Font("senserif",Font.BOLD,25);
        f1=new Font("Arial",Font.BOLD,16);
        
        l1=new JLabel("Name");
        l2=new JLabel("Father's Name");
        l3=new JLabel("Age");
        l4=new JLabel("DOB(yyyy/mm)");
        l5=new JLabel("Address");
        l6=new JLabel("Phone");
        l7=new JLabel("Email");
        l8=new JLabel("Class X(%)");
        l9=new JLabel("Class XII(%)");
        //l10=new JLabel("Aadhar No");
        l11=new JLabel("Employ ID");
        l12=new JLabel("Department");
        l13=new JLabel("Cource");
        l14=new JLabel("New Teacher Details");
        l14.setFont(f);
        l14.setHorizontalAlignment(JLabel.CENTER);
        
        l1.setFont(f1);
        l2.setFont(f1);
        l3.setFont(f1);
        l4.setFont(f1);
        l5.setFont(f1);
        l6.setFont(f1);
        l7.setFont(f1);
        l8.setFont(f1);
        l9.setFont(f1);
       // l10.setFont(f1);
        l11.setFont(f1);
        l12.setFont(f1);
        l13.setFont(f1);
        
        t1=new JTextField(10);
        t2=new JTextField(15);
        t3=new JTextField(15);
        t4=new JTextField(15);
        t5=new JTextField(15);
        t6=new JTextField(15);
        t7=new JTextField(15);
        t8=new JTextField(15);
        t9=new JTextField(15);
        //t10=new JTextField(15);
        t11=new JTextField(15);
        
        t1.setFont(f1);
        t2.setFont(f1);
        t3.setFont(f1);
        t4.setFont(f1);
        t5.setFont(f1);
        t6.setFont(f1);
        t7.setFont(f1);
        t8.setFont(f1);
        t9.setFont(f1);
        //t10.setFont(f);
        t11.setFont(f1);
        
        cm1=new JComboBox(a);
        cm2=new JComboBox(b);
        
        cm1.setFont(f1);
        cm2.setFont(f1);
        
        bt1=new JButton("Submit");
        bt2=new JButton("Cancle");
        
        bt1.setFont(f1);
        bt2.setFont(f1);
        bt1.setBackground(Color.BLACK);
        bt1.setForeground(Color.WHITE);
        bt2.setBackground(Color.BLACK);
        bt2.setForeground(Color.WHITE);
        
        //Background Image.............
        
        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("university/icons/teacher 4.png"));
        Image img=ii1.getImage().getScaledInstance(150,400,Image.SCALE_DEFAULT);
        ImageIcon ii2=new ImageIcon(img);
        
        l15=new JLabel(ii2);
        
        
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p1.setLayout(new GridLayout(13,2,10,10));
        p2.setLayout(new GridLayout(1,1));
        //p3.setLayout(new GridLayout(1,2,10,10));
        //p2.setSize(60,60);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        p1.add(l5);
        p1.add(t5);
        p1.add(l6);
        p1.add(t6);
        p1.add(l7);
        p1.add(t7);
        p1.add(l8);
        p1.add(t8);
        p1.add(l9);
        p1.add(t9);
//        p1.add(l10);
//        p1.add(t10);
        p1.add(l11);
        p1.add(t11);
        p1.add(l12);
        p1.add(cm1);
        p1.add(l13);
        p1.add(cm2);
        
        p1.add(bt1);
        p1.add(bt2);
        
        p2.add(l15);
        
        setLayout(new BorderLayout(30,30));
        add(p1,"Center");
        add(l14,"North");
        add(p2,"West");
        //add(p3,"South");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        trial(sm);
    }
    void trial(String sm)
    {
        try
        {
            connection obj=new connection();
            String qq="select * from new_teacher_add where employ_ID='"+sm+"'";
            ResultSet rset=obj.stm.executeQuery(qq);
            while(rset.next())
            {
                t11.setText(rset.getString(1));
                t1.setText(rset.getString(2));
                t2.setText(rset.getString(3));
                t3.setText(rset.getString(4));
                t4.setText(rset.getString(5));
                t5.setText(rset.getString(6));
                t6.setText(rset.getString(7));
                t7.setText(rset.getString(8));
                t8.setText(rset.getString(9));
                t9.setText(rset.getString(10));
            }
        }
        catch(Exception exx)
        {
            exx.printStackTrace();
        }
    }
    public void actionPerformed(ActionEvent ev)
    {
        if(ev.getSource()==bt1)
        {
            String name=t1.getText();
            String father_name=t2.getText();
            int age=Integer.parseInt(t3.getText());
            String dob=t4.getText();
            String address=t5.getText();
            String phone=t6.getText();
            String email=t7.getText();
            int classX=Integer.parseInt(t8.getText());
            int classXII=Integer.parseInt(t9.getText());
            String employ_id=t11.getText();
            String department_name=(String)cm1.getSelectedItem();
            String cource=(String)cm2.getSelectedItem();
            try
            {
                connection obj=new connection();
                String q="update new_teacher_add set name='"+name+"',father_name='"+father_name+"',age='"+age+"',dob='"+dob+"',address='"+address+"',phone='"+phone+"',email='"+email+"',class_X='"+classX+"',class_XII='"+classXII+"',department='"+department_name+"',cource='"+cource+"' where employ_ID='"+employ_id+"'";
                obj.stm.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Data insert succesfully....");
                setVisible(false);
                new update_teacher().setVisible(true);
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String args[])
    {
        new updateTeacher_record().setVisible(true);
    }
}
