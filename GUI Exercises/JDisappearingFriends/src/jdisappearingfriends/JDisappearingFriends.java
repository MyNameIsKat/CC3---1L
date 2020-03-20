package jdisappearingfriends;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class JDisappearingFriends implements ActionListener{
    JButton button = new JButton("Click");
    JFrame firstF = new JFrame("Disappearing Friends");
    Font myf= new Font("Arial", Font.BOLD, 36);
    public int count;
    
    public static void main(String[] args) {
        JDisappearingFriends frame = new JDisappearingFriends();
        frame.frame1();
    }
    public void frame1(){
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        JFrame.setDefaultLookAndFeelDecorated(true);
        firstF.setSize(300, 150);
        firstF.setVisible(true);
        firstF.setAlwaysOnTop(true);
        firstF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstF.setLayout(flow);
        button();  
    }
    public void button(){
        button.setToolTipText("This will change the friend label");
        firstF.add(button);
        button.addActionListener(this);
        button.setFont(myf);
        label();
    }
    
    JLabel one = new JLabel("Friend A");
    JLabel two = new JLabel("Friend B");
    JLabel three = new JLabel("Friend C");
    JLabel four = new JLabel("Friend D");
    JLabel five = new JLabel("Friend K");
    public void label(){
        firstF.add(one);
        one.setFont(myf);
        
        firstF.add(two);
        two.setVisible(false);
        two.setFont(myf);
        
        firstF.add(three);
        three.setVisible(false);
        three.setFont(myf);
        
        firstF.add(four);
        four.setVisible(false);
        four.setFont(myf);
        
        firstF.add(five);
        five.setVisible(false);
        five.setFont(myf);
    }
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source == button){
            count++;
        }
        if(count==6){
            count=1;
        }
        switch(count){
            case 1:one.setVisible(false);
                   two.setVisible(true);
                break;
            case 2:two.setVisible(false);
                   three.setVisible(true);
                break;
            case 3:three.setVisible(false);
                   four.setVisible(true);
                break;
            case 4:four.setVisible(false);
                   five.setVisible(true);
                break;
            case 5:five.setVisible(false);
                   one.setVisible(true);
                break;
        }
    }
}
