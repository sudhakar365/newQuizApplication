package  quiz.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.*;

public class  login extends JFrame  implements ActionListener {





    JTextField textField;
    JButton next;
    JButton back;


    login() {
        try

        {
            Class.forName(" oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@oracleLocalhost:1521:xe", "system", "root");
            System.out.println("connection created successfully");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select*from Quizuser");
            while (rs.next())
            System.out.println(rs.getInt("1 " + rs.getString(2) + " "+rs.getString(3)));
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        // constracter  which  same as class name
        getContentPane().setBackground(Color.white); // iski help se hm frame ka colr change krte hai
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i = i1.getImage().getScaledInstance(550, 500, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(450, 0, 550, 500); // image frame me kha hogi ye set krne ke liye hm SetBound ka use krte hai
        add(image);

/** again try  on this if we are adding a new page

 ImageIcon i3=new ImageIcon(ClassLoader.getSystemResource( "icons/user.jpg"));
 Image p=i3.getImage().getScaledInstance(200,200 ,Image.SCALE_DEFAULT);
 ImageIcon i4=new ImageIcon(p);
 JLabel Image1 =new JLabel(i4);
 image.setBounds(100,10,100,100);
 add(image);**/

        JLabel heading = new JLabel("QUIJ TEST ");
        heading.setBounds(140, 60, 300, 45);
        heading.setFont(new Font("vinner ITC", Font.BOLD, 40));
        heading.setForeground((new Color(22, 199, 54)));
        add(heading);

        JLabel name = new JLabel("Enter your name ");
        name.setBounds(180, 150, 300, 20);
        name.setFont(new Font("monogolian baiti", Font.BOLD, 15));
        name.setForeground(new Color(22, 58, 150));
        add(name);

        textField = new JTextField();
        textField.setBounds(160, 180, 220, 20);
        textField.setFont(new Font("times new roman", Font.BOLD, 18));
        add(textField);

        // in this place we are adding a button

        next = new JButton("next");
        next.setBounds(100, 270, 150, 25);
        next.setBackground(new Color(0, 225, 0));
        next.addActionListener(this); // ye pta lgane ke liye ki kis button pr click kiya ja rha h iske liye every button pr action listner ko add krte hai
        add(next);

        back = new JButton("back");
        back.setBounds(280, 270, 150, 25); // x ka use left bounds ko set krne ke liye kiya jata hi
        back.setBackground(new Color(255, 50, 34)); // y ka use  bottom se button niche  rhega ye set krne ke liye kiya jata
        back.addActionListener(this);
        add(back);
        setSize(1000, 500);
        setLocation(200, 100);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e1)
        {
        if (e1.getSource() == next) {
            String name = textField.getText();
            setVisible(false);
            new rools(name);
            // jo deta e ke andr save h agr neaxt button se match ho jata to  if condition true ho jayegi oor  hmara neaxt action  performed ho jatyega
        } else if (e1.getSource() == back) {
            System.exit(50);
        }
    }

    public static void main(String[] args) {

        new login();
    }


        public static class Quiz {
        }
    }


