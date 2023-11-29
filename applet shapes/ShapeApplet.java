import javax.swing.*;
import java.awt.*;

public class ShapeApplet extends JFrame {

    public ShapeApplet() {
        // Set up the JFrame
        setTitle("Shape Display");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel shapePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawString("Hello",150,30);
                // Draw shapes
                g.setColor(Color.BLUE);
                g.drawRect(50, 50, 50, 50); // Rectangle
                g.setColor(Color.RED);
                g.drawOval(150, 50, 50, 50); // Oval
                g.setColor(Color.GREEN);
                g.drawLine(250, 50, 300, 100); // Line
                g.setColor(Color.MAGENTA);
                g.fillRoundRect(50, 150, 50, 50, 10, 10); // Rounded Rectangle
            }
        };

        // Add the shape panel to the JFrame
        getContentPane().add(shapePanel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ShapeApplet());
    }
}
