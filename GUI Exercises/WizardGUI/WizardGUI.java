package myprofile;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class WizardGUI extends Canvas implements ActionListener, KeyListener {

    //use to set the speed of a continuous action without a user defined event trigger
    Timer time = new Timer(100, this); 
    
    //J Components used for in Event methods
    public String name = "Hello";
    JButton submit = new JButton("Submit");
    JTextField nameText = new JTextField("Type Name");
    JFrame f = new JFrame("Wizard");
    JFrame cf = new JFrame("Control Frame");
    JButton blue = new JButton("Blue");
    JButton red = new JButton("Red");
    Color cloth = new Color(0,0,250);
    Color shade = new Color(0, 0, 200);
    Color shadow = new Color(0, 0, 150);
    
    //colors with color mixing
    Color brown = new Color(200, 100, 50);
    Color darkBrown = new Color(150, 75, 35);
    
    //non-GUI variables used in EVENT methods 
    Boolean facingLeft = true; //changes where the character is facing
    int i = 0; //used to add for the continuous movement

//CONSTRUCTOR
/*
    applies KeyListner to the class as well as the timer
    */    
    WizardGUI() {
        super.addKeyListener(this);
        time.start(); //starts the movement
    }

    @Override
    public void paint(Graphics g) {

//STARS: POLYGON
/*
Polygons were made by declaring the x points and y points in two different arrays to form a coordinate for each point
There is two stars and are positioned differently 
there exist a +i to move it continuously with the help of the timer
*/
        g.setColor(Color.YELLOW);
        int[] sX = {42 + i, 52 + i, 72 + i, 52 + i, 60 + i, 40 + i, 15 + i, 28 + i, 9 + i, 32 + i, 42 + i};
        int[] sY = {38 + i, 62 + i, 68 + i, 80 + i, 105 + i, 85 + i, 102 + i, 75 + i, 58 + i, 60 + i, 38 + i};
        g.fillPolygon(sX, sY, 11);

        int[] s1X = {20-5 + i, 10-5 + i, 0-5 + i, 10-5 + i, 0-5 + i, 20-5 + i, 40-5 + i, 30-5 + i, 40-5 + i, 30-5 + i, 20-5 + i};
        int[] s1Y = {0-5 + i, 10-5 + i, 10-5 + i, 20-5 + i, 40-5 + i, 30-5 + i, 40-5 + i, 20-5 + i, 10-5 + i, 10-5 + i, 0-5 + i};
        g.fillPolygon(s1X, s1Y, 11);

        
//WIZARD: RECTANGLE
/*
Wizard was made by stacking different sizes of rectangles accordingly 
there exist a +x to move it along with the arrow keys
x is a global variable incrementing when a user presses the arrow key

The if else here is used to identify when the user clicks left after being in the right or right after being in the left
inorder for the character to flip horizontally or to face a side accordingly

the flipped side is done by completely reassembling the rectangles 
*/
        if (facingLeft) {
            g.setColor(cloth);
            g.fillRect(110 + x, 10, 10, 10);
            g.fillRect(110 + x, 20, 10, 10);
            g.fillRect(100 + x, 20, 10, 10);
            g.fillRect(110 + x, 30, 10, 10);
            g.fillRect(100 + x, 30, 10, 10);
            g.fillRect(90 + x, 30, 10, 10);
            g.fillRect(110 + x, 40, 10, 10);
            g.fillRect(100 + x, 40, 10, 10);
            g.fillRect(90 + x, 40, 10, 10);
            g.fillRect(80 + x, 40, 10, 10);
            g.fillRect(110 + x, 50, 10, 10);
            g.fillRect(100 + x, 50, 10, 10);
            g.fillRect(90 + x, 50, 10, 10);
            g.fillRect(80 + x, 50, 10, 10);
            g.fillRect(70 + x, 50, 10, 10);
            g.fillRect(110 + x, 60, 10, 10);
            g.fillRect(100 + x, 60, 10, 10);
            g.fillRect(90 + x, 60, 10, 10);
            g.fillRect(80 + x, 60, 10, 10);
            g.fillRect(70 + x, 60, 10, 10);
            g.fillRect(60 + x, 60, 10, 10);
            g.fillRect(110 + x, 70, 10, 10);
            g.fillRect(100 + x, 70, 10, 10);
            g.fillRect(90 + x, 70, 10, 10);
            g.fillRect(80 + x, 70, 10, 10);
            g.fillRect(70 + x, 70, 10, 10);
            g.fillRect(60 + x, 70, 10, 10);
            g.fillRect(50 + x, 70, 10, 10);
            g.fillRect(110 + x, 80, 10, 10);
            g.fillRect(100 + x, 80, 10, 10);
            g.fillRect(90 + x, 80, 10, 10);
            g.fillRect(80 + x, 80, 10, 10);
            g.fillRect(70 + x, 80, 10, 10);
            g.fillRect(60 + x, 80, 10, 10);
            g.fillRect(50 + x, 80, 10, 10);
            g.fillRect(40 + x, 80, 10, 10);
            g.fillRect(110 + x, 90, 10, 10);
            g.fillRect(100 + x, 90, 10, 10);
            g.fillRect(90 + x, 90, 10, 10);
            g.fillRect(80 + x, 90, 10, 10);
            g.fillRect(70 + x, 90, 10, 10);
            g.fillRect(60 + x, 90, 10, 10);
            g.fillRect(50 + x, 90, 10, 10);
            g.fillRect(40 + x, 90, 10, 10);
            g.fillRect(30 + x, 90, 10, 10);
            g.fillRect(110 + x, 100, 10, 10);
            g.fillRect(100 + x, 100, 10, 10);
            g.fillRect(90 + x, 100, 10, 10);
            g.fillRect(80 + x, 100, 10, 10);
            g.fillRect(70 + x, 100, 10, 10);
            g.fillRect(60 + x, 100, 10, 10);
            g.fillRect(50 + x, 100, 10, 10);
            g.fillRect(40 + x, 100, 10, 10);
            g.fillRect(30 + x, 100, 10, 10);
            g.fillRect(40 + x, 110, 10, 10);
            g.fillRect(40 + x, 120, 10, 10);
            g.fillRect(10 + x, 380, 200, 10);
            g.fillRect(10 + x, 370, 190, 10);
            g.fillRect(10 + x, 360, 160, 10);
            g.fillRect(10 + x, 350, 150, 10);
            g.fillRect(20 + x, 340, 120, 10);
            g.fillRect(20 + x, 330, 110, 10);
            g.fillRect(20 + x, 320, 100, 10);
            g.fillRect(30 + x, 310, 80, 10);
            g.fillRect(30 + x, 300, 70, 10);
            g.fillRect(30 + x, 290, 60, 10);
            g.fillRect(40 + x, 280, 40, 10);
            g.fillRect(40 + x, 270, 30, 10);
            g.fillRect(40 + x, 260, 20, 10);
            g.fillRect(40 + x, 250, 10, 10);

            g.fillRect(140 + x, 200, 30, 10);
            g.fillRect(50 + x, 210, 130, 10);
            g.fillRect(50 + x, 220, 130, 10);
            g.fillRect(60 + x, 230, 130, 10);
            g.fillRect(70 + x, 240, 120, 10);
            g.fillRect(80 + x, 250, 110, 10);
            g.fillRect(90 + x, 260, 100, 10);
            g.fillRect(100 + x, 270, 90, 10);
            g.fillRect(110 + x, 280, 80, 10);
            g.fillRect(120 + x, 290, 70, 10);
            g.fillRect(130 + x, 300, 70, 10);
            g.fillRect(140 + x, 310, 60, 10);
            g.fillRect(150 + x, 320, 50, 10);
            g.fillRect(150 + x, 330, 50, 10);

            g.setColor(shade);
            g.fillRect(120 + x, 30, 10, 10);
            g.fillRect(120 + x, 40, 10, 10);
            g.fillRect(120 + x, 50, 20, 10);
            g.fillRect(120 + x, 60, 30, 10);
            g.fillRect(120 + x, 70, 40, 10);
            g.fillRect(120 + x, 80, 50, 10);
            g.fillRect(120 + x, 90, 60, 10);
            g.fillRect(120 + x, 100, 60, 10);
            g.fillRect(130 + x, 110, 40, 10);
            g.fillRect(150 + x, 120, 10, 10);
            g.fillRect(200 + x, 330, 10, 10);
            g.fillRect(200 + x, 340, 20, 10);
            g.fillRect(190 + x, 350, 30, 10);
            g.fillRect(190 + x, 360, 40, 10);
            g.fillRect(200 + x, 370, 40, 10);
            g.fillRect(210 + x, 380, 40, 10);

            g.setColor(shadow);
            g.fillRect(120 + x, 10, 10, 10);
            g.fillRect(120 + x, 20, 20, 10);
            g.fillRect(130 + x, 30, 20, 10);
            g.fillRect(130 + x, 40, 30, 10);
            g.fillRect(140 + x, 50, 30, 10);
            g.fillRect(150 + x, 60, 30, 10);
            g.fillRect(140 + x, 250, 10, 10);
            g.fillRect(140 + x, 260, 10, 10);
            g.fillRect(140 + x, 270, 10, 10);
            g.fillRect(140 + x, 280, 10, 10);
            g.fillRect(140 + x, 290, 10, 10);
            g.fillRect(150 + x, 300, 10, 10);
            g.fillRect(150 + x, 310, 10, 10);
            g.fillRect(150 + x, 320, 10, 10);
            g.fillRect(150 + x, 330, 10, 10);
            g.fillRect(150 + x, 340, 50, 10);

            g.setColor(brown);
            g.fillRect(40 + x, 210, 10, 10);
            g.fillRect(30 + x, 220, 20, 10);
            g.fillRect(30 + x, 230, 30, 10);
            g.fillRect(40 + x, 240, 30, 10);
            g.fillRect(50 + x, 250, 30, 10);
            g.fillRect(60 + x, 260, 30, 10);
            g.fillRect(70 + x, 270, 30, 10);
            g.fillRect(80 + x, 280, 30, 10);
            g.fillRect(90 + x, 290, 30, 10);
            g.fillRect(100 + x, 300, 30, 10);
            g.fillRect(110 + x, 310, 30, 10);
            g.fillRect(120 + x, 320, 30, 10);
            g.fillRect(130 + x, 330, 20, 10);
            g.fillRect(140 + x, 340, 10, 10);
            g.fillRect(200 + x, 150, 20, 10);
            g.fillRect(210 + x, 160, 10, 10);
            g.fillRect(190 + x, 170, 30, 10);
            g.fillRect(180 + x, 180, 20, 10);
            g.fillRect(170 + x, 190, 20, 10);
            g.fillRect(170 + x, 200, 10, 10);

            g.setColor(darkBrown);
            g.fillRect(160 + x, 190, 10, 10);
            g.fillRect(170 + x, 180, 10, 10);
            g.fillRect(180 + x, 170, 10, 10);
            g.fillRect(190 + x, 160, 20, 10);
            g.fillRect(190 + x, 150, 10, 10);
            g.fillRect(200 + x, 140, 20, 10);

            g.fillRect(220 + x, 150, 10, 30);

            g.fillRect(180 + x, 200, 10, 10);
            g.fillRect(190 + x, 190, 10, 10);
            g.fillRect(200 + x, 180, 20, 10);

            g.setColor(Color.orange);
            g.fillRect(50 + x, 110, 10, 10);
            g.fillRect(60 + x, 110, 10, 10);
            g.fillRect(70 + x, 110, 10, 10);
            g.fillRect(80 + x, 110, 10, 10);
            g.fillRect(90 + x, 110, 10, 10);
            g.fillRect(100 + x, 110, 10, 10);
            g.fillRect(110 + x, 110, 10, 10);
            g.fillRect(50 + x, 130, 10, 10);
            g.fillRect(60 + x, 130, 10, 10);
            g.fillRect(70 + x, 130, 10, 10);
            g.fillRect(50 + x, 140, 10, 10);
            g.fillRect(60 + x, 140, 10, 10);
            g.fillRect(70 + x, 140, 10, 10);
            g.fillRect(50 + x, 150, 10, 10);
            g.fillRect(60 + x, 150, 10, 10);
            g.fillRect(70 + x, 150, 10, 10);
            g.fillRect(60 + x, 160, 10, 10);
            g.fillRect(90 + x, 130, 10, 10);
            g.fillRect(100 + x, 130, 10, 10);
            g.fillRect(110 + x, 130, 10, 10);
            g.fillRect(130 + x, 130, 10, 10);
            g.fillRect(90 + x, 140, 10, 10);
            g.fillRect(100 + x, 140, 10, 10);
            g.fillRect(110 + x, 140, 10, 10);
            g.fillRect(120 + x, 140, 10, 10);
            g.fillRect(130 + x, 140, 10, 10);
            g.fillRect(90 + x, 150, 10, 10);
            g.fillRect(100 + x, 150, 10, 10);
            g.fillRect(110 + x, 150, 10, 10);
            g.fillRect(120 + x, 150, 10, 10);
            g.fillRect(130 + x, 150, 10, 10);
            g.fillRect(100 + x, 160, 10, 10);
            g.fillRect(160 + x, 350, 10, 10);
            g.fillRect(170 + x, 350, 10, 10);
            g.fillRect(180 + x, 350, 10, 10);
            g.fillRect(170 + x, 360, 10, 10);
            g.fillRect(180 + x, 360, 10, 10);

            g.setColor(Color.yellow);
            g.fillRect(80 + x, 120, 10, 10);
            g.fillRect(80 + x, 130, 10, 10);
            g.fillRect(80 + x, 140, 10, 10);
            g.fillRect(80 + x, 150, 10, 10);
            g.fillRect(70 + x, 160, 10, 10);
            g.fillRect(80 + x, 160, 10, 10);
            g.fillRect(90 + x, 160, 10, 10);
            g.fillRect(70 + x, 170, 10, 10);
            g.fillRect(80 + x, 170, 10, 10);

            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(50 + x, 120, 10, 10);
            g.fillRect(60 + x, 120, 10, 10);
            g.fillRect(70 + x, 120, 10, 10);
            g.fillRect(90 + x, 120, 10, 10);
            g.fillRect(100 + x, 120, 10, 10);
            g.fillRect(110 + x, 120, 10, 10);
            g.fillRect(120 + x, 120, 10, 10);
            g.fillRect(120 + x, 130, 10, 10);
            g.fillRect(50 + x, 160, 10, 10);
            g.fillRect(110 + x, 160, 10, 10);
            g.fillRect(120 + x, 160, 10, 10);
            g.fillRect(50 + x, 170, 10, 10);
            g.fillRect(60 + x, 170, 10, 10);
            g.fillRect(90 + x, 170, 10, 10);
            g.fillRect(100 + x, 170, 10, 10);
            g.fillRect(110 + x, 170, 10, 10);
            g.fillRect(50 + x, 180, 10, 10);
            g.fillRect(60 + x, 180, 10, 10);
            g.fillRect(70 + x, 180, 10, 10);
            g.fillRect(80 + x, 180, 10, 10);
            g.fillRect(90 + x, 180, 10, 10);
            g.fillRect(100 + x, 180, 10, 10);
            g.fillRect(110 + x, 180, 10, 10);
            g.fillRect(50 + x, 190, 10, 10);
            g.fillRect(60 + x, 190, 10, 10);
            g.fillRect(70 + x, 190, 10, 10);
            g.fillRect(80 + x, 190, 10, 10);
            g.fillRect(90 + x, 190, 10, 10);
            g.fillRect(100 + x, 190, 10, 10);
            g.fillRect(60 + x, 200, 10, 10);
            g.fillRect(70 + x, 200, 10, 10);
            g.fillRect(80 + x, 200, 10, 10);
            g.fillRect(90 + x, 200, 10, 10);
            g.fillRect(100 + x, 200, 10, 10);
            g.fillRect(70 + x, 210, 10, 10);
            g.fillRect(80 + x, 210, 10, 10);
            g.fillRect(90 + x, 210, 10, 10);
            g.fillRect(70 + x, 220, 10, 10);
            g.fillRect(80 + x, 220, 10, 10);
            g.fillRect(90 + x, 220, 10, 10);
            g.fillRect(80 + x, 230, 10, 10);

            g.setColor(Color.DARK_GRAY);
            g.fillRect(120 + x, 110, 10, 10);
            g.fillRect(130 + x, 120, 10, 10);
            g.fillRect(140 + x, 120, 10, 10);
            g.fillRect(140 + x, 130, 10, 10);
            g.fillRect(150 + x, 130, 10, 10);
            g.fillRect(140 + x, 140, 10, 10);
            g.fillRect(150 + x, 140, 10, 10);
            g.fillRect(140 + x, 150, 10, 10);
            g.fillRect(150 + x, 150, 10, 10);
            g.fillRect(130 + x, 160, 10, 10);
            g.fillRect(140 + x, 160, 10, 10);
            g.fillRect(150 + x, 160, 10, 10);
            g.fillRect(120 + x, 170, 10, 10);
            g.fillRect(130 + x, 170, 10, 10);
            g.fillRect(140 + x, 170, 10, 10);
            g.fillRect(150 + x, 170, 10, 10);
            g.fillRect(120 + x, 180, 10, 10);
            g.fillRect(130 + x, 180, 10, 10);
            g.fillRect(140 + x, 180, 10, 10);
            g.fillRect(150 + x, 180, 10, 10);
            g.fillRect(110 + x, 190, 10, 10);
            g.fillRect(120 + x, 190, 10, 10);
            g.fillRect(130 + x, 190, 10, 10);
            g.fillRect(140 + x, 190, 10, 10);
            g.fillRect(110 + x, 200, 10, 10);
            g.fillRect(120 + x, 200, 10, 10);
            g.fillRect(130 + x, 200, 10, 10);
            g.fillRect(100 + x, 210, 10, 10);
            g.fillRect(110 + x, 210, 10, 10);
            g.fillRect(120 + x, 210, 10, 10);
            g.fillRect(100 + x, 220, 10, 10);
            g.fillRect(110 + x, 220, 10, 10);
            g.fillRect(90 + x, 230, 10, 10);
            g.fillRect(100 + x, 230, 10, 10);
            g.fillRect(90 + x, 240, 10, 10);

//EYES: OVAL
            g.setColor(Color.BLACK);
            g.fillOval(60 + x, 140, 10, 10);
            g.fillOval(100 + x, 140, 10, 10);
            
//FANS: ARC
/*
Uses timer for the clockwise motion which only modifies the angles
ALso uses variable x to follow the movement of the character
*/
            g.setColor(Color.CYAN);
            g.fillArc(80+x, 50, 30, 30, 180 + i, -180 + i);

        } else {//so that it flips
            g.setColor(cloth);
            g.fillRect(140 + x, 10, 10, 10);
            g.fillRect(140 + x, 20, 20, 10);
            g.fillRect(140 + x, 30, 30, 10);
            g.fillRect(140 + x, 40, 40, 10);
            g.fillRect(140 + x, 50, 50, 10);
            g.fillRect(140 + x, 60, 60, 10);
            g.fillRect(140 + x, 70, 70, 10);
            g.fillRect(140 + x, 80, 80, 10);
            g.fillRect(140 + x, 90, 90, 10);
            g.fillRect(140 + x, 100, 90, 10);
            g.fillRect(210 + x, 110, 10, 10);
            g.fillRect(210 + x, 120, 10, 10);

            g.fillRect(90 + x, 190, 20, 10);
            g.fillRect(80 + x, 200, 40, 10);
            g.fillRect(80 + x, 210, 50, 10);

            g.fillRect(190 + x, 200, 10, 10);

            g.fillRect(190 + x, 210, 20, 20);

            g.fillRect(70 + x, 220, 140, 60);
            g.fillRect(60 + x, 280, 160, 80);
            g.fillRect(60 + x, 320, 170, 30);
            g.fillRect(50 + x, 350, 190, 40);

            g.setColor(shade);
            g.fillRect(130 + x, 30, 10, 10);
            g.fillRect(130 + x, 40, 10, 10);
            g.fillRect(120 + x, 50, 20, 10);
            g.fillRect(110 + x, 60, 30, 10);
            g.fillRect(100 + x, 70, 40, 10);
            g.fillRect(90 + x, 80, 50, 10);
            g.fillRect(80 + x, 90, 60, 10);
            g.fillRect(80 + x, 100, 60, 10);
            g.fillRect(90 + x, 110, 40, 10);
            g.fillRect(100 + x, 120, 10, 10);

            g.fillRect(50 + x, 330, 10, 10);
            g.fillRect(40 + x, 340, 20, 10);
            g.fillRect(40 + x, 350, 30, 10);
            g.fillRect(30 + x, 360, 40, 10);
            g.fillRect(20 + x, 370, 40, 10);
            g.fillRect(10 + x, 380, 40, 10);

            g.setColor(shadow);
            g.fillRect(130 + x, 10, 10, 10);
            g.fillRect(120 + x, 20, 20, 10);
            g.fillRect(110 + x, 30, 20, 10);
            g.fillRect(100 + x, 40, 30, 10);
            g.fillRect(90 + x, 50, 30, 10);
            g.fillRect(80 + x, 60, 30, 10);

            g.fillRect(110 + x, 250, 10, 50);
            g.fillRect(100 + x, 300, 10, 50);
            g.fillRect(60 + x, 340, 50, 10);

            g.setColor(brown);
            g.fillRect(210 + x, 210, 10, 10);
            g.fillRect(210 + x, 220, 20, 10);
            g.fillRect(200 + x, 230, 30, 10);
            g.fillRect(190 + x, 240, 30, 10);
            g.fillRect(180 + x, 250, 30, 10);
            g.fillRect(170 + x, 260, 30, 10);
            g.fillRect(160 + x, 270, 30, 10);
            g.fillRect(150 + x, 280, 30, 10);
            g.fillRect(140 + x, 290, 30, 10);
            g.fillRect(130 + x, 300, 30, 10);
            g.fillRect(120 + x, 310, 30, 10);
            g.fillRect(110 + x, 320, 30, 10);
            g.fillRect(110 + x, 330, 20, 10);
            g.fillRect(110 + x, 340, 10, 10);

            g.fillRect(40 + x, 150, 20, 10);
            g.fillRect(40 + x, 160, 10, 10);
            g.fillRect(40 + x, 170, 30, 10);
            g.fillRect(60 + x, 180, 20, 10);
            g.fillRect(70 + x, 190, 20, 10);
            g.fillRect(80 + x, 200, 10, 10);

            g.setColor(darkBrown);
            g.fillRect(40 + x, 140, 20, 10);
            g.fillRect(30 + x, 150, 10, 30);
            g.fillRect(50 + x, 160, 20, 10);
            g.fillRect(70 + x, 170, 10, 10);
            g.fillRect(80 + x, 180, 10, 10);
            g.fillRect(90 + x, 190, 10, 10);
            g.fillRect(40 + x, 180, 20, 10);
            g.fillRect(60 + x, 190, 10, 10);
            g.fillRect(70 + x, 200, 10, 10);

            g.setColor(Color.orange);
            g.fillRect(140 + x, 110, 70, 10);
            g.fillRect(120 + x, 130, 10, 10);
            g.fillRect(140 + x, 130, 70, 10);
            g.fillRect(120 + x, 140, 90, 10);
            g.fillRect(120 + x, 150, 90, 10);
            g.fillRect(150 + x, 160, 50, 10);

            g.fillRect(70 + x, 350, 30, 10);
            g.fillRect(70 + x, 360, 20, 10);

            g.setColor(Color.yellow);
            g.fillRect(170 + x, 120, 10, 60);
            g.fillRect(160 + x, 160, 30, 10);
            g.fillRect(170 + x, 170, 20, 10);

            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(130 + x, 120, 10, 10);
            g.fillRect(140 + x, 120, 10, 10);
            g.fillRect(150 + x, 120, 10, 10);
            g.fillRect(160 + x, 120, 10, 10);
            g.fillRect(180 + x, 120, 10, 10);
            g.fillRect(190 + x, 120, 10, 10);
            g.fillRect(200 + x, 120, 10, 10);
            g.fillRect(130 + x, 130, 10, 10);
            g.fillRect(130 + x, 160, 10, 10);
            g.fillRect(140 + x, 160, 10, 10);
            g.fillRect(200 + x, 160, 10, 10);
            g.fillRect(200 + x, 170, 10, 10);
            g.fillRect(140 + x, 170, 10, 10);
            g.fillRect(150 + x, 170, 10, 10);
            g.fillRect(160 + x, 170, 10, 10);
            g.fillRect(190 + x, 170, 10, 10);
            g.fillRect(140 + x, 170, 10, 10);
            g.fillRect(140 + x, 180, 70, 10);
            g.fillRect(150 + x, 190, 60, 10);
            g.fillRect(150 + x, 200, 50, 10);
            g.fillRect(160 + x, 210, 30, 10);
            g.fillRect(160 + x, 220, 30, 10);
            g.fillRect(170 + x, 230, 10, 10);

            g.setColor(Color.DARK_GRAY);
            g.fillRect(130 + x, 110, 10, 10);
            g.fillRect(120 + x, 120, 10, 10);
            g.fillRect(110 + x, 120, 10, 80);
            g.fillRect(100 + x, 130, 10, 60);
            g.fillRect(120 + x, 160, 10, 50);
            g.fillRect(130 + x, 170, 10, 50);
            g.fillRect(140 + x, 190, 10, 40);
            g.fillRect(150 + x, 210, 10, 30);
            g.fillRect(160 + x, 230, 10, 20);
//EYES: OVAL
            g.setColor(Color.BLACK);
            g.fillOval(150 + x, 140, 10, 10);
            g.fillOval(190 + x, 140, 10, 10);
            
//FANS: ARC
/*
Uses timer for the clockwise motion which only modifies the angles
ALso uses variable x to follow the movement of the character
*/
            g.setColor(Color.CYAN);
            g.fillArc(150+x, 50, 30, 30, 180 + i, -180 + i);

        }
        
//SEPARATOR: LINE
        g.setColor(Color.BLACK);
        g.drawLine(0, 400, 500, 400);

//NAME TAG: DRAWSTRING
/*
Using drawString the GUI name is printed out using the global variable name which is modified by the user
The drawString is modified with a different Font
uses the black color same with the latest setColor declared
*/
        Font miFont = new Font("Arial", Font.BOLD, 30);
        g.setFont(miFont);
        g.drawString("Name: " + name, 1, 500);

    }

//main method instatiate this class to be able to use non static methods
    public static void main(String[] args) {
        WizardGUI m = new WizardGUI();
        m.graphicsFrame(m);

    }

    /*
    graphicsFrame method adds paint method to a frame named f
    also adds another frame called cf which will hold the textfield and buttons that will change the graphics in f frame
    also includes the lables,sizes, declaration of setVisible and DefaultClose OERATIOn
    */
    public void graphicsFrame(WizardGUI w) {

        f.add(w);
        f.setSize(500, 800);
        cf.setLayout(null);
        cf.setSize(500, 200);

        JLabel nameLabel = new JLabel("NAME: ");
        nameLabel.setBounds(1, 1, 100, 20);
        nameText.addActionListener(this);
        nameText.setBounds(200, 1, 100, 20);
        submit.addActionListener(this);
        submit.setBounds(300, 1, 100, 20);

        JLabel color = new JLabel("COLOR: ");
        color.setBounds(1, 30, 100, 20);
        blue.addActionListener(this);
        blue.setBounds(200, 30, 100, 20);
        red.addActionListener(this);
        red.setBounds(300, 30, 100, 20);

        cf.add(nameLabel);
        cf.add(nameText);
        cf.add(color);
        cf.add(red);
        cf.add(blue);
        cf.add(submit);

        cf.setVisible(true);
        cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
     /*
    actionPerformed method where i a variable added to star/arc coordinate that increments until it reaches the line
    and when it does, it will reset back to zero
    */

    @Override
    public void actionPerformed(ActionEvent e) {
        if (i <= 300) {
            i += 1;
        } else {
            i = 1;
        }

    /*
        if the blue button is clicked the character's clothes' changes colors 
        so the cloth, its shade and shadow will change into either blue tones or red tones uisng the global variables
        that sets the color of each corresponding graphic
        
        it also disables the button that just got clicked and encables the button that isn't clicked
        */
        if (e.getSource() == blue) {
            blue.setEnabled(false); 
            red.setEnabled(true);
            cloth = Color.BLUE;
            shade = new Color(0, 0, 200);
            shadow = new Color(0, 0, 150);
        } else if (e.getSource() == red) {
            red.setEnabled(false);
            blue.setEnabled(true);
            cloth = Color.RED;
            shade = new Color(200, 0, 0);
            shadow = new Color(150, 0, 0);
        }
    /*
        changes the global variable name which is shown as a drawstring in the paint method
        once user presses the submit button the name will change into what the user specified in the textfield
        */
        if (e.getSource() == submit) {
            name = nameText.getText();

        }
        
    /*
        repaint(); method so that the graphics will repaint to the new settings made
        */    
        repaint();
    }

    
    /*
        global variable x will be added into the x-coordinates of the character's shapes
        */
    int x = 0;

    @Override
    public void keyTyped(KeyEvent e) { 
    //must be here because keyEvent is an abstract so all of its methods must be implemented but not necessatily used
    }

    /*
        key event when left and arrow keys are pressed, x increments or decrements by 10
        which will change the position of to character because x is added and repaint is done
        */
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            x -= 10;
            facingLeft = true;
        }
        if (key == KeyEvent.VK_RIGHT) {
            x += 10;
            facingLeft = false; 
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    //must be here because keyEvent is an abstract so all of its methods must be implemented but not necessatily used
    }

}
