package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame  {

    Score( String name ,int score ){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/winner.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,70,400,450);
        add(image);

        JLabel heading =new JLabel("Thank you " +name+"for playing Quiz test");
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
       heading.setBounds(120,80,700,30);
        add(heading);

        JLabel Score=new JLabel("your score is "+score);
        Score.setBounds(380,200,300,30);
        Score.setFont(new Font("tahoma",Font.BOLD,26));
       // Score.addAncestorListener(this);
        add(Score);

        JButton exit =new JButton("exit");
        exit.setFont(new Font("Tahoma",Font.BOLD,24));
        exit.setBounds(400,250,120,30);
        exit.setBackground(new Color(22,99,54));
        exit.setForeground(Color.BLUE);
        add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new login();

            }
        });

      // ImageIcon B1=new ImageIcon(ClassLoader.getSystemResource("icons/ram.jpg"));
        //Image B2=B1.getImage().getScaledInstance(750,550,Image.SCALE_DEFAULT);
        //ImageIcon B3=new ImageIcon(B2);
        //JLabel image2=new JLabel(B3);

        //image.setBounds(0,0,750,550);
        //add(image2);

        setSize(750,550);
        setLocation(400,100);
        setLayout(null);
        setVisible(true);

    }




    public static void main(String[] args) {
        new Score("user",0);
    }
}
