import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GameField extends JPanel implements ActionListener{
    private final int SIZE = 320;
    private final int DOT_SIZE = 16; // how big every body part size
    private final int ALL_DOTS = 400; // how many dots
    private Image dot;
    private Image apple;
    private int appleX; // apple x coordinate
    private int appleY; // apple y coordinate
    private int[] x = new int[ALL_DOTS]; // array of  every x coordinate value
    private int[] y = new int[ALL_DOTS]; // array of every y coordinates value
    private int dots; // how many dots
    private Timer timer;
    /**
     * where should the snake go
     */
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;

    /**
     * just main constructor
     */
    public GameField(){
        setBackground(Color.black);
        loadImages();
        initGame();
        addKeyListener(new FieldKeyListener());
        setFocusable(true);
    } // close GameField

    /**
     * initialise game start
     */
    public void initGame(){
        dots = 3;
        for (int i = 0; i < dots; i++) {
            x[i] = 48 - i*DOT_SIZE;
            y[i] = 48;
        }
        timer = new Timer(250,this);
        timer.start();
        createApple();
    } // close initGame

    /**
     * create an Apple somewhere in window
     */
    public void createApple(){
        appleX = new Random().nextInt(20)*DOT_SIZE;
        appleY = new Random().nextInt(20)*DOT_SIZE;
    }// close createApple

    /**
     * initialise apple and dots icons
     */
    public void loadImages(){
        ImageIcon iia = new ImageIcon("apple.png");
        apple = iia.getImage();
        ImageIcon iid = new ImageIcon("dot.png");
        dot = iid.getImage();
    } // close loadImages


    // Override paint java methods
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(inGame){
            g.drawImage(apple,appleX,appleY,this); // draw apple in window
            for (int i = 0; i < dots; i++) { // draw snake in window
                g.drawImage(dot,x[i],y[i],this);
            }
        } // close inGame condition
        else {
            String str = "Game over";
            /**
             * just print "Game over"
             */
            Font font = new Font("Arial", Font.BOLD, 14);
            g.setColor(Color.white);
            g.setFont(font);
            g.drawString(str, 125, SIZE/2);
        } // close Game over condition
    } // close paintComponent


    /**
     * create snake's movement
     */
    public void move(){
        /**
         * create ordinary movement
         */
        for (int i = dots; i > 0; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        /**
         * changing snake's movement
         */
        if(left){
            x[0] -= DOT_SIZE;
        }
        if(right){
            x[0] += DOT_SIZE;
        } if(up){
            y[0] -= DOT_SIZE;
        } if(down){
            y[0] += DOT_SIZE;
        }
    } // close move

    /**
     * check if snake ate apple
     */
    public void checkApple(){
        if(x[0] == appleX && y[0] == appleY){
            dots++;
            createApple();
        }
    } // close checkApple

    /**
     * check if snake fell into himself or into the wall
     */
    public void checkCollisions(){
        for (int i = dots; i >0 ; i--) {
            if(i>4 && x[0] == x[i] && y[0] == y[i]){
                inGame = false;
            }
        }

        if(x[0]>SIZE){
            inGame = false;
        }
        if(x[0]<0){
            inGame = false;
        }
        if(y[0]>SIZE){
            inGame = false;
        }
        if(y[0]<0){
            inGame = false;
        }
    } // close checkCollisions


    /**
     * repaint every frame
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(inGame){
            checkApple();
            checkCollisions();
            move();

        }
        repaint();
    } // close actionPerformed

    /**
     * make pressing buttons
     */
    class FieldKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);

            int key = e.getKeyCode();

            if (key == KeyEvent.VK_LEFT && !right) {
                left = true;
                up = false;
                down = false;

            }
            if (key == KeyEvent.VK_RIGHT && !left) {
                right = true;
                up = false;
                down = false;
            }

            if (key == KeyEvent.VK_UP && !down) {
                up = true;
                right = false;
                left = false;
            }

            if (key == KeyEvent.VK_DOWN && !up) {
                down = true;
                right = false;
                left = false;

            }
        } // close keyPressed
    } // close FieldKeyListener class
}