package jvacationrental;

import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JVacationRental implements ActionListener {

    JFrame frame = new JFrame("Lambert's Vacation Rentals");
    JPanel panel = new JPanel();

    ButtonGroup group = new ButtonGroup();
    JLabel cost = new JLabel("$0");
    JButton pks = new JButton("Park Side $600");
    JButton pls = new JButton("Pool Side $750");
    JButton ls = new JButton("Lake Side $825");
    
    JLabel bedNum = new JLabel("");
    JButton bedMore = new JButton("▲");
    JButton bedLess = new JButton("▼");

    JButton MealsY = new JButton("Yes");
    JButton MealsN = new JButton("No");

    Font f = new Font("Arial",Font.PLAIN, 15);
    Font fo = new Font("Arial",Font.PLAIN, 25);
    
    public static void main(String[] args) {
        JVacationRental VR = new JVacationRental();
        VR.mainFrame();
    }

    public void mainFrame() {
        frame.setSize(400, 200);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        
        JLabel B = new JLabel("Lambert's Vacation Rentals");
        B.setBounds(1, 120, 20, 20);
        B.setFont(fo);
        panel.add(B);
        
        panel1();
        panel2();
        panel3();
        panel4();
        
    }

    public void panel1() {
        group.add(pks);
        pks.setBounds(1, 1, 20, 20);
        panel.add(pks);
        pks.addActionListener(this);

        group.add(pls);
        pls.setBounds(20, 1, 20, 20);
        panel.add(pls);
        pls.addActionListener(this);

        group.add(ls);
        ls.setBounds(40, 1, 20, 20);
        panel.add(ls);
        ls.addActionListener(this);
        
    }
    
    public void panel2(){
        JLabel B = new JLabel("Bed Number: ");
        B.setBounds(1, 40, 20, 20);
        panel.add(B);
       
        bedNum.setBounds(20, 40, 5, 5);
        panel.add(bedNum);
        
        bedMore.setBounds(25, 40, 5, 5);
        panel.add(bedMore);
        bedMore.addActionListener(this);

        bedLess.setBounds(30, 40, 5, 5);
        panel.add(bedLess);
        bedLess.addActionListener(this);
    }
    
    public void panel3(){
        JLabel M = new JLabel("Do you want meals with that? +$200");
        M.setFont(f);
        M.setBounds(1, 50, 100, 20);
        panel.add(M);
        
        MealsY.setBounds(1, 70, 30, 20);
        panel.add(MealsY);
        MealsY.addActionListener(this);

        MealsN.setBounds(20, 70, 30, 20);
        panel.add(MealsN);
        MealsN.addActionListener(this);
    }

    public void panel4() {
        JLabel total = new JLabel("TOTAL COST: ");
        total.setBounds(1, 100, 20, 20);
        panel.add(total);

        //cost
        cost.setBounds(20, 100, 20, 20);
        panel.add(cost);
    }

    public int cash = 0;
    public int count = 0;
    public boolean food=false;

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == pks) {
            cash = 600;
            pks.setEnabled(false);
            pls.setEnabled(true);
            ls.setEnabled(true);
            bedNum.setText("0");
            count = 0;
        } else if (e.getSource() == pls) {
            cash = 750;
            pls.setEnabled(false);
            pks.setEnabled(true);
            ls.setEnabled(true);
            bedNum.setText("0");
            count =0;
        } else if (e.getSource() == ls) {
            cash = 825;
            ls.setEnabled(false);
            pls.setEnabled(true);
            pks.setEnabled(true);
            bedNum.setText("0");
            count = 0;
        }
        
        
        if (e.getSource() == bedMore) {
            count++;
            cash+=75;
        } else if (e.getSource() == bedLess) {
            count--;
            cash-=75;
        }
        
        if(count==3){
            bedMore.setEnabled(false);
        }else{
            bedMore.setEnabled(true);
        }
        if(count==0){
            bedLess.setEnabled(false);
        }else{
            bedLess.setEnabled(true);
        }
        
        bedNum.setText(Integer.toString(count));
        
        
        if (e.getSource() == MealsY) {
            cash+= 200;
            MealsY.setEnabled(false);
            MealsN.setEnabled(true);
            food=true;
        } else if (e.getSource() == MealsN) {
            if(food==false){
            }else if(food==true){
                cash-= 200;
                MealsN.setEnabled(false);
                MealsY.setEnabled(true);
            }
            
        }
        
        cost.setText("$" + Integer.toString(cash));
    }

}
