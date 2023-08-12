package streetFighter;

import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.Timer;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class board extends JPanel implements iplayerConstants {

    BufferedImage imageBg;
    private player player;
    private opponentPlayer oppPlayer;
    private Timer timer;
    private power playerPower;
    private power opponentPlayerPower;
    private boolean gameOver;
    
    private void gameLoop() {
        timer = new Timer(150, new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                repaint();
                isColloision();
                isGameOver();
                if(gameOver) {
                    mp3Player.stop();
                    mp3Player1.play();
                    timer.stop();
                }
                player.fall();
                oppPlayer.fall();
            }
        });timer.start();
    }

    private void loadPower() {
        playerPower = new power(30,"RYU");
        opponentPlayerPower = new power(BOARDWIDTH - 550,"KEN");
    }

    private void printPower(Graphics pen) {
        playerPower.printHealthBar(pen);
        opponentPlayerPower.printHealthBar(pen);
    }

    private boolean isColloide() {
        int xDistance = Math.abs(player.getX() - oppPlayer.getX()); 
        int yDistance = Math.abs(player.getY() - oppPlayer.getY());
        int maxH = Math.max(player.getH(),oppPlayer.getH());
        int maxW = Math.max(player.getW(),oppPlayer.getW());
        return xDistance + 93 <= maxH && yDistance <= maxW;
    }

    private void isColloision() {
        if(isColloide()) {
            if(player.isAttacking() && oppPlayer.isAttacking()) {

            }
            else if(player.isAttacking) {
                oppPlayer.setCurrentMove(HIT);
                opponentPlayerPower.setHealth();
            }
            else if(oppPlayer.isAttacking) {
                player.setCurrentMove(HIT);
                playerPower.setHealth();
            }
            player.setColloide(true);
            player.setSpeed(-SPEED);
            oppPlayer.setColloide(true);
            oppPlayer.setSpeed(SPEED);
        }
        else {
            player.setColloide(false);
            player.setSpeed(SPEED);
            oppPlayer.setColloide(false);
            oppPlayer.setSpeed(SPEED);
        }
    }

    public board() throws IOException {
        player = new player();
        oppPlayer = new opponentPlayer();
        loadBackground();
        setFocusable(true);
        bindEvents();
        gameLoop();
        loadPower();
    }

    private void isGameOver() {
        if(playerPower.getHealth() <= 0 || opponentPlayerPower.getHealth() <= 0) {
            gameOver = true;
        }
    }
    
    private void printGameOver(Graphics pen) {
        if(gameOver){
            pen.setColor(Color.RED);
            pen.setFont(new Font("times",Font.BOLD,100));
            pen.drawString("GAME OVER", BOARDWIDTH/2 -300, BOARDHEIGHT/2 - 50);
        }
    }

    @Override
    public void paintComponent(Graphics pen) {
        showBackground(pen);
        player.drawPlayer(pen);
        oppPlayer.drawPlayer(pen);
        printPower(pen);
        printGameOver(pen);
    }

    private void bindEvents() {
        KeyListener listener = new KeyListener() {
            
            @Override
            public void keyTyped(KeyEvent e) {

                if(e.getKeyCode() == KeyEvent.VK_D) {
                    player.setSpeed(SPEED);
                    player.movePLayer();
                    player.setCurrentMove(WALKFORWARD);
                }

                else if(e.getKeyCode() == KeyEvent.VK_A) {
                    player.setColloide(false);
                    player.setSpeed(-SPEED);
                    player.movePLayer();
                    player.setCurrentMove(WALKBACKWARD);
                }

                else if(e.getKeyCode() == KeyEvent.VK_C) {
                    player.setCurrentMove(CROUCH);
                }

                else if(e.getKeyCode() == KeyEvent.VK_F) {
                    player.setCurrentMove(PUNCH);
                    player.setAttacking(true);
                }

                else if(e.getKeyCode() == KeyEvent.VK_V) {
                    player.setCurrentMove(KICK);
                    player.setAttacking(true);
                }

                else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
                    player.jump();
                    player.setCurrentMove(JUMP);
                }

                if(e.getKeyCode() == RIGHTKEY) {
                    oppPlayer.setColloide(false);
                    oppPlayer.setSpeed(SPEED);
                    oppPlayer.movePLayer();
                    oppPlayer.setCurrentMove(WALKBACKWARD);
                }

                else if(e.getKeyCode() == LEFTKEY) {
                    oppPlayer.setSpeed(-SPEED);
                    oppPlayer.movePLayer();
                    oppPlayer.setCurrentMove(WALKFORWARD);
                }
                else if(e.getKeyCode() == KeyEvent.VK_P) {
                    oppPlayer.setCurrentMove(PUNCH);
                    oppPlayer.setAttacking(true);
                }
                else if(e.getKeyCode() == KeyEvent.VK_J) {
                    oppPlayer.setCurrentMove(JUMP);
                }
                else if(e.getKeyCode() == KeyEvent.VK_M) {
                    oppPlayer.setCurrentMove(CROUCH);
                }
                else if(e.getKeyCode() == KeyEvent.VK_K) {
                    oppPlayer.setCurrentMove(KICK);
                    oppPlayer.setAttacking(true);
                }
                
            }

            @Override
            public void keyPressed(KeyEvent e) {

                if(e.getKeyCode() == KeyEvent.VK_D) {
                    player.setSpeed(SPEED);
                    player.movePLayer();
                    player.setCurrentMove(WALKFORWARD);
                }

                else if(e.getKeyCode() == KeyEvent.VK_A) {
                    player.setColloide(false);
                    player.setSpeed(-SPEED);
                    player.movePLayer();
                    player.setCurrentMove(WALKBACKWARD);
                }

                else if(e.getKeyCode() == KeyEvent.VK_C) {
                    player.setCurrentMove(CROUCH);
                }

                else if(e.getKeyCode() == KeyEvent.VK_F) {
                    player.setCurrentMove(PUNCH);
                    player.setAttacking(true);
                }

                else if(e.getKeyCode() == KeyEvent.VK_V) {
                    player.setCurrentMove(KICK);
                    player.setAttacking(true);
                }

                else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
                    player.setCurrentMove(JUMP);
                }

                if(e.getKeyCode() == RIGHTKEY) {
                    oppPlayer.setColloide(false);
                    oppPlayer.setSpeed(SPEED);
                    oppPlayer.movePLayer();
                    oppPlayer.setCurrentMove(WALKBACKWARD);
                }

                else if(e.getKeyCode() == LEFTKEY) {
                    oppPlayer.setSpeed(-SPEED);
                    oppPlayer.movePLayer();
                    oppPlayer.setCurrentMove(WALKFORWARD);
                }
                else if(e.getKeyCode() == KeyEvent.VK_P) {
                    oppPlayer.setCurrentMove(PUNCH);
                    oppPlayer.setAttacking(true);
                }
                else if(e.getKeyCode() == KeyEvent.VK_J) {
                    oppPlayer.setCurrentMove(JUMP);
                }
                else if(e.getKeyCode() == KeyEvent.VK_M) {
                    oppPlayer.setCurrentMove(CROUCH);
                }
                else if(e.getKeyCode() == KeyEvent.VK_K) {
                    oppPlayer.setCurrentMove(KICK);
                    oppPlayer.setAttacking(true);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

                if(e.getKeyCode() == KeyEvent.VK_D) {
                    player.setSpeed(SPEED);
                    player.movePLayer();
                    player.setCurrentMove(WALKFORWARD);
                }

                else if(e.getKeyCode() == KeyEvent.VK_A) {
                    player.setColloide(false);
                    player.setSpeed(-SPEED);
                    player.movePLayer();
                    player.setCurrentMove(WALKBACKWARD);
                }

                else if(e.getKeyCode() == KeyEvent.VK_C) {
                    player.setCurrentMove(CROUCH);
                }

                else if(e.getKeyCode() == KeyEvent.VK_F) {
                    player.setCurrentMove(PUNCH);
                    player.setAttacking(true);
                }

                else if(e.getKeyCode() == KeyEvent.VK_V) {
                    player.setCurrentMove(KICK);
                    player.setAttacking(true);
                }

                else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
                    player.setCurrentMove(JUMP);
                }

                if(e.getKeyCode() == RIGHTKEY) {
                    oppPlayer.setColloide(false);
                    oppPlayer.setSpeed(SPEED);
                    oppPlayer.movePLayer();
                    oppPlayer.setCurrentMove(WALKBACKWARD);
                }

                else if(e.getKeyCode() == LEFTKEY) {
                    oppPlayer.setSpeed(-SPEED);
                    oppPlayer.movePLayer();
                    oppPlayer.setCurrentMove(WALKFORWARD);
                }
                else if(e.getKeyCode() == KeyEvent.VK_P) {
                    oppPlayer.setCurrentMove(PUNCH);
                    oppPlayer.setAttacking(true);
                }
                else if(e.getKeyCode() == KeyEvent.VK_J) {
                    oppPlayer.setCurrentMove(JUMP);
                }
                else if(e.getKeyCode() == KeyEvent.VK_M) {
                    oppPlayer.setCurrentMove(CROUCH);
                }
                else if(e.getKeyCode() == KeyEvent.VK_K) {
                    oppPlayer.setCurrentMove(KICK);
                    oppPlayer.setAttacking(true);
                }
                
            }

        };this.addKeyListener(listener);
    }

    private void showBackground(Graphics pen) {
        pen.drawImage(imageBg,0,0,1535,800,null);
    }

    private void loadBackground() {

        try {
            imageBg = ImageIO.read(board.class.getResource(BG_IMG));
        }catch(Exception e) {
            System.out.println("BackGround Image failed to load!!!");
            System.exit(0);
        }

    }
}
