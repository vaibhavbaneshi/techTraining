package streetFighter;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class commonPlayer implements iplayerConstants {

    protected int x;
    protected int y;
    protected int w;
    protected int h;
    protected int speed;
    protected int height;
    protected int imageIndex = 0;
    protected int currentMove;
    protected int count;
    protected int force;
    protected int health;
    protected BufferedImage playerImg;
    protected BufferedImage playerImg2;
    protected boolean isColloide;
    protected boolean isAttacking;
    private boolean isJump = false;

    public void jump() {
        if(!isJump) {
            isJump = true;
            force = -20;
            y = y + force;
        }
    }
    public void fall() {
        if(y >= (FLOOR-h)) {
            isJump = false;
            return;
        }
        y = y + force;
        force = force + GRAVITY;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth() {
        this.health = (int)(health - 15);
    }

    protected abstract BufferedImage defaultImage();

    public commonPlayer() {
        health = MAX_HEALTH;
    }

    public void drawPlayer(Graphics pen) {
        pen.drawImage(defaultImage(),x,y,w,h,null);
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCurrentMove() {
        return currentMove;
    }

    public void setCurrentMove(int currentMove) {
        this.currentMove = currentMove;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void movePLayer() {
        if(!isColloide) {
            x = x + speed;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isColloide() {
        return isColloide;
    }

    public void setColloide(boolean isCollide) {
        this.isColloide = isCollide;
    }

    public boolean isAttacking() {
        return isAttacking;
    }

    public void setAttacking(boolean isAttacking) {
        this.isAttacking = isAttacking;
    }
}
