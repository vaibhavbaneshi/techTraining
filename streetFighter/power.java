package streetFighter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class power extends commonPlayer {

    Color color;
    String playerName;

    public power(int x,String playerName) {
        this.x = x;
        y = 20;
        w = 500;
        h = 30;
        this.playerName = playerName;
    }

    public void printHealthBar(Graphics pen) {
        pen.setColor(Color.RED);
        pen.fillRect(x,y,w,h);
        if(health > 0) {
            pen.setColor(Color.GREEN);
            pen.fillRect(x,y,health,h);
        }
        pen.setColor(Color.BLACK);
        pen.setFont(new Font("times",Font.BOLD,40));
        pen.drawString(playerName,x,y + h + 40);
    }
    
    protected BufferedImage defaultImage() {
        return null;
    }

}