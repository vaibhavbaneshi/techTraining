package streetFighter;

import jaco.mp3.player.MP3Player;

public interface iplayerConstants {
    int BOARDWIDTH = 1550;
    int BOARDHEIGHT = 900;
    String  GAMETITLE = "STREETFIGHTER";
    int FLOOR = BOARDHEIGHT - 200;
    int LEFTKEY = 37;
    int RIGHTKEY = 39;
    int UPKEY = 38;
    int DOWNKEY = 40;
    int KEY_D = 68;
    int KEY_A = 65;
    int KEY_C = 67;
    int KEY_SPACE = 32;
    int KEY_F = 70;
    int SPEED = 20;
    int IDLE = 1;
    int WALKFORWARD = 2;
    int WALKBACKWARD = 3;
    int CROUCH = 4;
    int JUMP = 5;
    int PUNCH = 6;
    int KICK = 7;
    int POWER = 8;
    int HIT = 9;
    int GRAVITY = 1;
    int JUMPHEIGHT = 80;
    int MAX_HEALTH = 500;
    float gravity = 9.8f;
    String BG_IMG = "backGround.jpg";
    String PLAYER_IMG = "player.png";
    String OPPONENT_PLAYER_IMG = "oppPlayer.png";
    MP3Player mp3Player = new MP3Player(splashScreen.class.getResource("music.mp3"));
    MP3Player mp3Player1 = new MP3Player(splashScreen.class.getResource("gameOver.mp3"));
}
