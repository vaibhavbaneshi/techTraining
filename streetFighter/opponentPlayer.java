package streetFighter;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class opponentPlayer extends commonPlayer {

    public opponentPlayer() throws IOException {
        x=BOARDWIDTH - 400;
        w=170;
        h=300;
        y=FLOOR-h;
        speed = SPEED;
        height = JUMPHEIGHT;
        playerImg = ImageIO.read(player.class.getResource(OPPONENT_PLAYER_IMG));
        loadIdleImages();
        loadCrouchImages();
        loadJumpImages();
        loadWalkForwardImages();
        loadWalkBackwardImages();
        loadPunchImages();
        loadKickImages();
        loadHitImages();
    }

    private BufferedImage idleImages[] = new BufferedImage[9];
    private BufferedImage walkForwardImages[] = new BufferedImage[6];
    private BufferedImage walkBackwardImages[] = new BufferedImage[6];
    private BufferedImage crouchImages[] = new BufferedImage[5];
    private BufferedImage jumpImages[] = new BufferedImage[7];
    private BufferedImage punchImages[] = new BufferedImage[6];
    private BufferedImage kickImages[] = new BufferedImage[3];
    private BufferedImage hitImages[] = new BufferedImage[3];

    public void loadIdleImages() {
        idleImages[0] = playerImg.getSubimage(2033,685,64,94);
        idleImages[1] = playerImg.getSubimage(1963,681,64,98);
        idleImages[2] = playerImg.getSubimage(1899,683,59,96);
        idleImages[3] = playerImg.getSubimage(1828,684,59,96);
        idleImages[4] = playerImg.getSubimage(1759,683,59,96);
        idleImages[5] = playerImg.getSubimage(1693,684,59,96);
    }

    public void loadWalkForwardImages() {
        walkForwardImages[0] = playerImg.getSubimage(2034,870,55,88);
        walkForwardImages[1] = playerImg.getSubimage(1965,866,65,91);
        walkForwardImages[2] = playerImg.getSubimage(1891,864,65,91);
        walkForwardImages[3] = playerImg.getSubimage(1818,863,67,93);
        walkForwardImages[4] = playerImg.getSubimage(1752,865,60,92);
        walkForwardImages[5] = playerImg.getSubimage(1687,865,55,94);
    }

    public void loadWalkBackwardImages() {
        walkBackwardImages[0] = playerImg.getSubimage(1621,866,62,90);
        walkBackwardImages[1] = playerImg.getSubimage(1550,864,62,94);
        walkBackwardImages[2] = playerImg.getSubimage(1479,861,64,97);
        walkBackwardImages[3] = playerImg.getSubimage(1407,862,62,94);
        walkBackwardImages[4] = playerImg.getSubimage(1334,864,62,94);
        walkBackwardImages[5] = playerImg.getSubimage(1263,863,65,94);
    }

    public void loadCrouchImages() {
        crouchImages[0] = playerImg.getSubimage(1961,791,59,75);
        crouchImages[1] = playerImg.getSubimage(1887,799,65,65);
    }

    public void loadKickImages() {
        kickImages[0] = playerImg.getSubimage(1967,1562,69,97);
        kickImages[1] = playerImg.getSubimage(1838,1562,119,97);
    }

    public void loadHitImages() {
        hitImages[0] = playerImg.getSubimage(1629,3276,71,92);
        hitImages[1] = playerImg.getSubimage(1539,3279,75,89);
        hitImages[2] = playerImg.getSubimage(1436,3273,87,94);
    }

    public void loadJumpImages() {
        jumpImages[0] = playerImg.getSubimage(1380,1057,60,91);
        jumpImages[1] = playerImg.getSubimage(1315,1036,60,107);
        jumpImages[2] = playerImg.getSubimage(1250,992,59,94);
        jumpImages[3] = playerImg.getSubimage(1189,963,59,83);
        jumpImages[4] = playerImg.getSubimage(1135,963,53,75);
        jumpImages[5] = playerImg.getSubimage(1073,974,53,93);
        jumpImages[6] = playerImg.getSubimage(1009,1007,59,105);
    }

    public void loadPunchImages() {
        punchImages[0] = playerImg.getSubimage(2029,1149,64,95);
        punchImages[1] = playerImg.getSubimage(1930,1150,98,93);
        punchImages[2] = playerImg.getSubimage(1865,1150,67,93);
        punchImages[3] = playerImg.getSubimage(1786,1146,77,99);
        punchImages[4] = playerImg.getSubimage(1666,1146,112,99);
        punchImages[5] = playerImg.getSubimage(1590,1146,78,99);
    }    

    public BufferedImage printIdle() {
        isAttacking = false;
        if(imageIndex > 5) {
            imageIndex = 0;
        }
        BufferedImage img = idleImages[imageIndex];
        imageIndex++;
        return img;
    }

    public BufferedImage printWalk() {
        if(imageIndex > 5) {
            imageIndex = 0;
            currentMove = IDLE;
        }
        if(currentMove == WALKFORWARD) {
            BufferedImage img = walkForwardImages[imageIndex];
            imageIndex++;
            return img;
        }
        else {
            BufferedImage img = walkBackwardImages[imageIndex];
            imageIndex++;
            return img;
        }
        
    }

    public BufferedImage printCrouch() {
        if(imageIndex > 1) {
            imageIndex = 0;
            currentMove = IDLE;
        }
        BufferedImage img = crouchImages[imageIndex];
        imageIndex++;
        return img;
    }

    public BufferedImage printJump() {
        if(imageIndex > 6) {
            imageIndex = 0;
            currentMove = IDLE;
        }
        BufferedImage img = jumpImages[imageIndex];
        imageIndex++;
        return img;
    }        

    public BufferedImage printPunch() {
        if(imageIndex > 5) {
            imageIndex = 0;
            currentMove = IDLE;
            isAttacking = false;
        }
        BufferedImage img = punchImages[imageIndex];
        imageIndex++;
        return img;
    }

    public BufferedImage printKick() {
        if(imageIndex > 1) {
            imageIndex = 0;
            currentMove = IDLE;
            isAttacking = false;
        }
        BufferedImage img = kickImages[imageIndex];
        imageIndex++;
        return img;
    }

    public BufferedImage printHit() {
        if(imageIndex > 2) {
            imageIndex = 0;
            currentMove = IDLE;
        }
        BufferedImage img = hitImages[imageIndex];
        imageIndex++;
        return img;
    }


    @Override
    public BufferedImage defaultImage() {
        if(currentMove == WALKFORWARD || currentMove == WALKBACKWARD) {
            return printWalk();
        }
        else if(currentMove == CROUCH) {
            return printCrouch();
        }
        else if(currentMove == JUMP) {
            return printJump();
        }
        else if(currentMove == PUNCH) {
            return printPunch();
        }
        else if(currentMove == KICK) {
            return printKick();
        }
        else if(currentMove == HIT) {
            return printHit();
        }
        else 
            return printIdle();
    }
}
