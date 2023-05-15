import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectangleColor extends JFrame implements ActionListener {
    private JPanel colorPanel;
    private JButton redButton;
    private JButton blueButton;
    private JButton greenButton;

    public RectangleColor() {
        // Set up the user interface
        super("Rectangle Color");
        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(200, 200));
        redButton = new JButton("Red");
        redButton.addActionListener(this);
        blueButton = new JButton("Blue");
        blueButton.addActionListener(this);
        greenButton = new JButton("Green");
        greenButton.addActionListener(this);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(greenButton);
        Container contentPane = getContentPane();
        contentPane.add(colorPanel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Set the background color of the color panel based on the button that was pressed
        if (e.getSource() == redButton) {
            colorPanel.setBackground(Color.RED);
        } else if (e.getSource() == blueButton) {
            colorPanel.setBackground(Color.BLUE);
        } else if (e.getSource() == greenButton) {
            colorPanel.setBackground(Color.GREEN);
        }
        colorPanel.repaint();
    }

    public static void main(String[] args) {
        RectangleColor rectangleColor = new RectangleColor();
    }
}
