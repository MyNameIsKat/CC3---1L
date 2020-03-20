package swingproject;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class MyFirstSwing {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(false);
        JFrame firstFrame=new JFrame("I am a container");
        firstFrame.setTitle("Container");
        firstFrame.setSize(200, 200);
        firstFrame.setVisible(true);
        firstFrame.setResizable(true);
        firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //firstFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));    
        GridLayout gl = new GridLayout();
        firstFrame.setLayout(gl);
        
        JButton a = new JButton("1");
        firstFrame.add(a, BorderLayout.NORTH);
        
        JButton b = new JButton("2");
        firstFrame.add(b, BorderLayout.CENTER);
        
        JButton c = new JButton("3");
        firstFrame.add(c, BorderLayout.EAST);
        
        JButton d = new JButton("4");
        firstFrame.add(d, BorderLayout.WEST);
        
        JButton e = new JButton("5");
        firstFrame.add(e, BorderLayout.SOUTH);
        
        JButton f = new JButton("6");
        firstFrame.add(f, BorderLayout.AFTER_LINE_ENDS);
        
        JButton g = new JButton("7");
        firstFrame.add(g, BorderLayout.AFTER_LINE_ENDS);
        
        JButton h = new JButton("8");
        firstFrame.add(h, BorderLayout.AFTER_LINE_ENDS);
        
        JButton i = new JButton("9");
        firstFrame.add(i, BorderLayout.AFTER_LINE_ENDS);
        
        JButton j = new JButton("10");
        firstFrame.add(j, BorderLayout.AFTER_LINE_ENDS);
        
        JButton k = new JButton("11");
        firstFrame.add(k, BorderLayout.AFTER_LAST_LINE);
        
        JButton l = new JButton("12");
        firstFrame.add(l, BorderLayout.PAGE_END);
        
    }
    
}
