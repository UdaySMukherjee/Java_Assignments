import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEventDemo implements MouseListener {
    private JFrame frame;
    private JButton button;

    public MouseEventDemo() {
        // Create the main frame
        frame = new JFrame("Mouse Event Handling Demo");

        // Create a button
        button = new JButton("Click Me");

        // Register the mouse listener for the button
        button.addMouseListener(this);

        // Set up the layout and add the button to the frame
        frame.setLayout(new FlowLayout());
        frame.add(button);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Implementing mouse events
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked!");
    }

    public void mousePressed(MouseEvent e) {
        // Additional mouse event handling if needed
    }

    public void mouseReleased(MouseEvent e) {
        // Additional mouse event handling if needed
    }

    public void mouseEntered(MouseEvent e) {
        // Additional mouse event handling if needed
    }

    public void mouseExited(MouseEvent e) {
        // Additional mouse event handling if needed
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MouseEventDemo();
            }
        });
    }
}
