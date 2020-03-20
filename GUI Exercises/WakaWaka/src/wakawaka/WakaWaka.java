package wakawaka;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

/**
 *
 * @author myNameIsKat
 */
public class WakaWaka extends Panel implements KeyListener {

    /*
    Coordinates for the moving of the graphics
    */
    int x = 60, y = 60, sa = 40, mouth = 280;//pacman's character
    int score = 0;//drawstring score incremented in collision
    int a = 80, b = 80, x1 = 200, y1 = 200, a1 = 30, b1 = 30;//coordinates for the food
    Color color; //color that changes accordingly to the each graphic component

    /*
    Constructor that holds the keyListner and the set Background which will apply to all parts of the class
    */
    public WakaWaka() {
        this.setBackground(Color.DARK_GRAY);
        this.addKeyListener(this);
    }

    /*
    paint(graphics)holds the graphics 
    */
    @Override
    public void paint(Graphics g) {
    /*
        if the score(increments when collsion is made with the food) is not 10, shows score and pacman and the new food placement
        else show Game Over and only Game Over on the screen 
    */
        if (score!=10) {
            //score
            g.setFont(new Font("Courier New", Font.BOLD, 30));
            g.setColor(Color.WHITE);
            g.drawString("score: " + score, 80, 440);
            
            //pacman
            g.setColor(new Color(255, 255, 0));
            g.fillArc(0 + x, 0 + y, 80, 80, sa, mouth);
            
            //pacman eyes
            g.setColor(Color.BLACK);
            g.fillOval(30 + x, 20 + y, 10, 10);
            
            //food
            g.setColor(Color.red);
            g.fillOval(x1, y1, a1, b1);
            
            //blocks
            g.setColor(Color.BLUE);
            g.drawRect(0, 0, 300, 50);
        } else {
            //Game Over
            g.setFont(new Font("Courier New", Font.BOLD, 40));
            g.setColor(Color.white);
            g.drawString("Game over!!", 60, 350);
        }

    }

    /*
        builds the frames with its specific modification
        adds graohics through the constructor
    */
    public static void main(String args[]) {
        WakaWaka panel = new WakaWaka();
        JFrame frame = new JFrame("Pacman the Great");
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    /*
        movement when key is pressed
    */
    @Override
    public void keyPressed(KeyEvent e) {
        /*
        movement when up key is pressed
        if it reaches the coordinates of the block, zero will be added so the character can't get out of the screen else decrement
        and
        the starting angle will be place in 135 degrees which on top
        and
        if it y coordinate is even the mouth will close and if not it will open by 270degrees
        */
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (y <= 50 && x<=300) {
                y +=0;
                
            }else if(y<=0){//for the little corner that isnt blocked by the block
                y=0;
            } else {
                y -= 15;
            }
            sa = 135;
            if (y % 2 == 0) {
                mouth = 360;
            } else {
                mouth = 270;
            }
        }
        /*
        movement when down is pressed
        if it reaches the bottom part, y will be set to the height of the screen so the character can't get out of the screen
        else increment
        and
        the starting angle will be place in 315 degrees which on the bottom
        and
        if it y coordinate is even the mouth will close and if not it will open by 270degrees
        */
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (y + 100 >= getHeight()) {
                y = getHeight();
            } else {
                y += 15;
            }
            sa = 315;
            if (y % 2 == 0) {
                mouth = 360;
            } else {
                mouth = 270;
            }
        }
        /*
        movement when left key is pressed
        if it reaches leftmost part- when x is zero,  x will be set to 0 of so the character can't get out of the screen
        else decrement
        and
        the starting angle will be place in 360 degrees which on the left side
        and
        if the y coordinate is even the mouth will close and if not it will open by 270degrees
        */       
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (x <= 0) {
                x = 0;
            }else if(x<=300&&y<=50){//so the character can't go the side of the block
                x+=0; 
            } else {
                x -= 15;
            }
            sa = 225;
            if (x % 2 == 0) {
                mouth = 360;
            } else {
                mouth = 270;
            }
        }
        
         /*
        movement when right key is pressed
        if it reaches x + 100 is greater than or equal to the width size (aka if its close to the rightmost part),  
        x will be set the width size - 100 so that theres space between the rightside and the character
        else increment
        and
        the starting angle will be place in 45 degrees which on the right side
        and
        if the y coordinate is even the mouth will close and if not it will open by 270degrees
        */     
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (x + 100 >= getWidth()) {
                x = getWidth() - 100;
            } else {
                x += 15;
            }
            sa = 45;
            if (x % 2 == 0) {
                mouth = 360;
            } else {
                mouth = 270;
            }
        }
        /*
        random placing of the food
        if the x and y coordinate of the character is 50pixels close to the coordinates of the randomly placed food then 
        create new placement of food and increment score
        */   
        if ((x - x1) >= -50 && (x - x1) <= 20 && (y - y1) >= -50 && (y - y1) <= 20) {
            x1 = (int) Math.round((Math.random() * 350));
            y1 = (int) Math.round((Math.random() * 350));
            /*
            random placing of the food
            if the x and y coordinate of the new randomly place food is within in or near the block then 
            randomly place the food somewhere else
            */  
            if(x1<=300 && y1<=50){
                x1 = (int) Math.round((Math.random() * 350));
                y1 = (int) Math.round((Math.random() * 350));
            }
            
            score++;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
