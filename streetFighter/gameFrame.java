package streetFighter;

import java.io.IOException;

import javax.swing.JFrame;
public class gameFrame extends JFrame implements iplayerConstants {
    
    public gameFrame() throws IOException {
        setResizable(true);
        setTitle(GAMETITLE);
        setLocationRelativeTo(null);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        board b = new board();
        add(b);
        setVisible(true);
    }

}
