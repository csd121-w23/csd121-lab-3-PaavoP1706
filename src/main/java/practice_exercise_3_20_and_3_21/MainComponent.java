package practice_exercise_3_20_and_3_21;

import java.awt.*;
import javax.swing.*;

public class MainComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;

        // Add at least three houses of different positions and sizes
        House house1 = new House(10,10,20,20);
        house1.Draw(g2);

        House house2 = new House(55,30, 30,30);
        house2.Draw(g2);

        House house3 = new House(15,70,25,30);
        house3.Draw(g2);
    }
}