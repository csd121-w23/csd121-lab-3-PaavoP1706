package practice_exercise_3_20_and_3_21;

import javax.swing.*;

public class Viewer {
    
    public static void main(String[] args) {
        // TODO: Create a frame with one MainComponent in it
    JFrame frame = new JFrame();
    frame.setSize(150,150);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    MainComponent house1 = new MainComponent();
    frame.add(house1);
    frame.setVisible(true);

    MainComponent house2 = new MainComponent();
    frame.add(house2);
    frame.setVisible(true);

    MainComponent house3 = new MainComponent();
    frame.add(house3);
    frame.setVisible(true);

    }
    
}
