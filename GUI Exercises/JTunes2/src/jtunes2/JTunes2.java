package jtunes2;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JTunes2 implements ActionListener {
    public String[] music = {"Nico and The Niners","Panicing at Cisco","Falling in Joys","La Vien Gumamela","Bugs and Boys","The Queens","Owl Country",
        "Counting Planets","Infering from Alexandria","Complicated Plan","One Ok Stone","Rolling Rock","Late Summer Rain"};
    JFrame f = new JFrame("TUNES AND STUFF");
    JComboBox songChoice = new JComboBox(music);
    JLabel amount = new JLabel("$9.00");

    public static void main(String[] args) {
        JTunes2 frame = new JTunes2();
        frame.mainFrame();
    }

    public void mainFrame() {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        Font fon = new Font("Arial", Font.BOLD, 24);
        
        f.setLayout(flow);
        f.setSize(500, 300);
        f.setVisible(true);
        f.setResizable(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        combo(fon);
        label(fon);
    }

    public void combo(Font fon) {
        songChoice.setFont(fon);
        songChoice.setSize(100, 30);
        AutoCompletion.enable(songChoice);
        f.add(songChoice);
        songChoice.addActionListener(this);
    }

    public void label(Font fon) {
        JLabel price = new JLabel("Price");
        price.setFont(fon);
        amount.setSize(30, 30);
        amount.setFont(fon);
        f.add(price);
        f.add(amount);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == songChoice) {
            JComboBox cb = (JComboBox) e.getSource();
            
            int index = cb.getSelectedIndex();
            switch(index){
                case 1: amount.setText("$9.10"); break;
                case 2: amount.setText("$1.15"); break;
                case 3: amount.setText("$5.50"); break;
                case 4: amount.setText("$6.40"); break;
                case 5: amount.setText("$7.30"); break;
                case 6: amount.setText("$8.20"); break;
                case 7: amount.setText("$5.16"); break;
                case 8: amount.setText("$6.23"); break;
                case 9: amount.setText("$7.34"); break;
                case 10: amount.setText("$8.56"); break;
                case 11: amount.setText("$9.67"); break;
                case 12: amount.setText("$1.89"); break;
                case 0: amount.setText("$9.00"); break;
            }

        }
    }
}
