package streetFighter;

import java.awt.Image;
import java.io.IOException;
import javax.swing.*;
public class splashScreen  extends JFrame implements iplayerConstants {


    private JLabel label = new JLabel(); 

    public splashScreen() {

        setResizable(true);
        setTitle(GAMETITLE);
        setSize(600,500);
        setLocationRelativeTo(null);
        setUndecorated(true);

        label.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("splash.jpg")).getImage().getScaledInstance(600, 500, Image.SCALE_SMOOTH)));
        this.add(label);
        loadMusic();

        setVisible(true);

        try {
            Thread.sleep(5000);
            setVisible(false);
            dispose();
            
            new gameFrame();
        }catch(IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void loadMusic() {
        mp3Player.play();
    }

    public static void main(String[] args) {
        new splashScreen();
    }
}
