package swingcomboboxandothers;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class SwingComboBoxAndOthers {
    JFrame frame = new JFrame("I AM A FORM");
    Font f = new Font("Arial", Font.PLAIN,20);
    
    public static void main(String[] args) {
        SwingComboBoxAndOthers yes = new SwingComboBoxAndOthers();
        yes.mainFrame();
    }
    
    public void mainFrame() {
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        
        RadioButton();
        CheckBox();
        ComboBox();
        
        frame.setResizable(true);
    }
    
    public void RadioButton(){
        JLabel gender = new JLabel("GENDER: ");
        gender.setBounds(1, 1, 100, 30);
        gender.setFont(f);
        frame.add(gender);
        
        JRadioButton rb = new JRadioButton("Female", true);
        JRadioButton rb2 = new JRadioButton("Male", false);
        
        rb.setBounds(200, 1, 100, 30);
        rb2.setBounds(300, 1, 100, 30);
        
        rb.setFont(f);
        rb2.setFont(f);
        
        frame.add(rb);
        frame.add(rb2);
    }
    
    public void CheckBox(){
        JLabel status = new JLabel("STATUS: ");
        status.setBounds(1, 30, 100, 30);
        status.setFont(f);
        frame.add(status);
        
        JCheckBox cb = new JCheckBox("Single", true);
        JCheckBox cb2 = new JCheckBox("Married", false);
        
        cb.setFont(f);
        cb2.setFont(f);
        cb.setBounds(200, 30, 100, 30);
        cb2.setBounds(300, 30, 100, 30);
        
        frame.add(cb);
        frame.add(cb2);
    }
    
    public void ComboBox(){
        JLabel song = new JLabel("ALBUMS TO BUY: ");
        song.setBounds(1, 60, 100, 30);
        song.setFont(f);
        frame.add(song);
        
        String[] music = {"Nico and The Niners","Panicing at the Cisco","Falling in Joys","La Vien Gumamela","Bugs and Boys","The Queens","Owl Country",
        "Counting Planets","Infering from Alexandria","Complicated Plan","One Ok Stone","Rolling Rock","Late Summer Rain"};
        
        JComboBox songChoice = new JComboBox(music);
        songChoice.setFont(f);
        songChoice.setBounds(200, 60, 220, 30);
        frame.add(songChoice);
        
    }
    
}
