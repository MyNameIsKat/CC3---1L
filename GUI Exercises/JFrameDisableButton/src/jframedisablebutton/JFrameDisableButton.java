package jframedisablebutton;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class JFrameDisableButton implements ActionListener{
    JButton button = new JButton("Click");
    JFrame firstF = new JFrame("Button Disabled");
    JLabel warning = new JLabel();
    Font myf= new Font("Arial", Font.BOLD, 36);
    public int count;
    
    public static void main(String[] args) {
        JFrameDisableButton frame = new JFrameDisableButton();
        frame.frame1();
    }
    public void frame1(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        firstF.setSize(300, 250);
        firstF.setResizable(true);
        firstF.setVisible(true);
        firstF.setAlwaysOnTop(true);
        firstF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstF.setLayout(new FlowLayout());
        button();
        label();    
    }
    public void button(){
        button.setToolTipText("This will disable after you click it");
        firstF.add(button);
        button.addActionListener(this);
        button.setFont(myf);
    }
    public void label(){
        firstF.add(warning);
        warning.setText("That's Enough!");
        warning.setVisible(false);
        warning.setFont(myf);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source == button){
            count++;
        }
        if(count==8){
            button.setEnabled(false);
            warning.setVisible(true);
        }
       
    }
    
}
