import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// Own Frame that inherits the JFrame class.
public class MyFrame extends JFrame {
    // Constructor for the window.
    public MyFrame() {
        // Setting the size and visibility.
        setSize(400, 300);
        setVisible(true);

        // Add a MouseListener to MyFrame object that has a behavior of when the mouse is clicked on the app,
        // its location is updated to be centered on the location of the mouse on the screen.
        addMouseListener(new MouseAdapter() {
            // Example of Dynamic Polymorphism
            @Override
            public void mousePressed(MouseEvent e) {
                // Updates the location to be centered on the location of the mouse on the screen
                setLocation(e.getXOnScreen() - getWidth() / 2, e.getYOnScreen() - getHeight() / 2);
            }
        });

    }
}
