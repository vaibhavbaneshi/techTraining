package streetFighter;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class player extends commonPlayer {
    
    public player() throws IOException {
        x=200;
        w=170;
        h=300;
        y=FLOOR-h;
        speed = SPEED;
        height = JUMPHEIGHT;
        playerImg = ImageIO.read(player.class.getResource(PLAYER_IMG));
        loadIdleImages();
        loadCrouchImages();
        loadJumpImages();
        loadWalkForwardImages();
        loadWalkBackwardImages();
        loadPunchImages();
        loadKickImages();
        loadHitImages();
    }

    private BufferedImage idleImages[] = new BufferedImage[15];
    private BufferedImage walkForwardImages[] = new BufferedImage[6];
    private BufferedImage walkBackwardImages[] = new BufferedImage[6];
    private BufferedImage crouchImages[] = new BufferedImage[2];
    private BufferedImage jumpImages[] = new BufferedImage[7];
    private BufferedImage punchImages[] = new BufferedImage[6];
    private BufferedImage kickImages[] = new BufferedImage[3];
    private BufferedImage hitImages[] = new BufferedImage[2];

    public void loadIdleImages() {
        idleImages[0] = playerImg.getSubimage(110, 126,72,96);
        idleImages[1] = playerImg.getSubimage(188, 126,70,96);
        idleImages[2] = playerImg.getSubimage(269, 126,70,96);
        idleImages[3] = playerImg.getSubimage(349, 126,67,96);
        idleImages[4] = playerImg.getSubimage(427, 123,67,99);
        idleImages[5] = playerImg.getSubimage(504, 122,68,100);
    }

    public void loadWalkForwardImages() {
        walkForwardImages[0] = playerImg.getSubimage(63,236,73,97);
        walkForwardImages[1] = playerImg.getSubimage(143,237,73,97);
        walkForwardImages[2] = playerImg.getSubimage(227,235,63,99);
        walkForwardImages[3] = playerImg.getSubimage(303,234,60,99);
        walkForwardImages[4] = playerImg.getSubimage(377,233,60,99);
        walkForwardImages[5] = playerImg.getSubimage(454,239,66,96);
    }

    public void loadWalkBackwardImages() {
        walkBackwardImages[0] = playerImg.getSubimage(63,344,66,96);
        walkBackwardImages[1] = playerImg.getSubimage(139,344,62,98);
        walkBackwardImages[2] = playerImg.getSubimage(217,343,62,100);
        walkBackwardImages[3] = playerImg.getSubimage(291,344,65,101);
        walkBackwardImages[4] = playerImg.getSubimage(368,344,67,101);
        walkBackwardImages[5] = playerImg.getSubimage(452,347,70,96);
    }

    public void loadCrouchImages() {
        crouchImages[0] = playerImg.getSubimage(5,594,70,76);
        crouchImages[1] = playerImg.getSubimage(87,600,68,72);
    }

    public void loadKickImages() {
        kickImages[0] = playerImg.getSubimage(119,1043,70,99);
        kickImages[1] = playerImg.getSubimage(198,1043,122,99);
    }

    public void loadHitImages() {
        hitImages[0] = playerImg.getSubimage(244,2531,79,96);
        hitImages[1] = playerImg.getSubimage(330,2530,79,96);
    }

    public void loadJumpImages() {
        jumpImages[0] = playerImg.getSubimage(34,458,66,92);
        jumpImages[1] = playerImg.getSubimage(112,459,68,113);
        jumpImages[2] = playerImg.getSubimage(192,459,68,92);
        jumpImages[3] = playerImg.getSubimage(269,462,68,74);
        jumpImages[4] = playerImg.getSubimage(343,466,68,70);
        jumpImages[5] = playerImg.getSubimage(423,460,68,96);
        jumpImages[6] = playerImg.getSubimage(502,452,68,120);
    }

    public void loadPunchImages() {
        punchImages[0] = playerImg.getSubimage(26,821,68,99);
        punchImages[1] = playerImg.getSubimage(107,820,73,99);
        punchImages[2] = playerImg.getSubimage(188,820,114,99);
        punchImages[3] = playerImg.getSubimage(307,821,85,97);
        punchImages[4] = playerImg.getSubimage(401,820,108,98);
        punchImages[5] = playerImg.getSubimage(516,820,79,98);
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
        if(imageIndex > 1) {
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
