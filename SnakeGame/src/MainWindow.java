import javax.swing.*;

/**
 * create a game winodw
 */
public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Snake game"); // window title
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // close button
        setSize(320,345); // how bid the window
        setLocation(400,400); // where it located
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}