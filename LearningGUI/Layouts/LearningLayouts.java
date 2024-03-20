package LearningGUI.Layouts;

import javax.swing.*;
import java.awt.*;

public class LearningLayouts {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example Border Layout");
        JPanel container = new JPanel();

        JButton bNorth = new JButton("North");
        JButton bSouth = new JButton("South");
        JButton bEast = new JButton("East");
        JButton bWest = new JButton("West");
        JButton bCenter = new JButton("Center");

        container.setLayout(new BorderLayout());

        container.add(bNorth, BorderLayout.NORTH);
        container.add(bSouth, BorderLayout.SOUTH);
        container.add(bEast, BorderLayout.EAST);
        container.add(bWest, BorderLayout.WEST);
        container.add(bCenter, BorderLayout.CENTER);

        frame.getContentPane().add(container);

        frame.setVisible(true);
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
