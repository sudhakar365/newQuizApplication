package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rools extends JFrame implements ActionListener {
    JButton Start ,back;
    String name;
    rools(String name) {
        this.name=name;
        // constructor    which
        JLabel heading =new JLabel("welcome "+name+" to quiz test ");
        heading.setBounds( 150,100,600,50);
        heading.setFont(new Font("viner hand itc",Font.PLAIN ,28));
        heading.setForeground(new Color(29,43,250));
        add(heading);
        JLabel rools= new JLabel("");
        rools.setBounds(70,100,600,350);
        rools.setFont (new Font("tahoma hand itc ",Font.PLAIN,16));
        rools.setForeground( new Color(220,99,55));
        rools.setText(
                "<html>"+
                        "1.participation in the quiz  is free and open to all persons above 18 yeaars old." +
                        "<br><br>"+
                        "2.there are a total 10 question."+"<br><br>"+
                        "3. you only hve  15 seconds to answer the question ."+"<br><br>"+
                        "4. no cell  phones or other secondary devices in the room o test area ."+"<br><br>"+

                        "<html>"
        );

        add(rools);

        back=new JButton("back");
        back.setBounds(300,400,100,40);
        back.setBackground(new Color(22,99,55));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        Start=new JButton("Start");
        Start.setBounds(430,400,100,40);
        Start.setBackground(new Color(22,99,55));

        Start.setForeground(Color.white);
        Start.addActionListener(this );
        add(Start);


        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/roolspage.jpg"));
    Image i=i1.getImage().getScaledInstance(800,650,Image.SCALE_DEFAULT);
    ImageIcon i2=new ImageIcon(i);
    JLabel image= new JLabel(i2);
    image.setBounds(0,0,800,640);
    add(image);

        setSize(800,650);
        setLocation(350,100);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Start){ // here when we click on start we land on the quizpage
            setVisible(false);
            new Quizpage(name);

        }else{
            setVisible(false);
            new login();
        }
    }

    public static void main(String[] args) {

        new rools("user");
        }

    }


