package Game;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    //screen settings
    final int originalTileSize = 16;
    final int scale = 3;
    final int tileSize = originalTileSize * scale; // 48 pixels x 48 pixels
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    final int screenHeight = tileSize * maxScreenRow;// 576 pixels

    //FPS
    int fps = 60;

    KeyHandler keyHandler = new KeyHandler();
    Thread gameThread;

    //Set player's default position
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyHandler);
        this.setFocusable(true);
    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        while(gameThread != null){


            //UPDATE : character position etc
            update();
            // DRAW : draw the screen with updated info
            repaint();

        }
    }

    public void update(){
        if(keyHandler.upPressed = true){
            playerY -= playerSpeed;
        }
        else if(keyHandler.downPressed == true){
            playerY += playerSpeed;
        }
        else if(keyHandler.leftPressed == true){
            playerX -= playerSpeed;repaint();
        }
        else if(keyHandler.rightPressed == true){
            playerX += playerSpeed;
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.white);
        g2.fillRect(playerX, playerY, tileSize, tileSize);
        g2.dispose();

    }

    // Successfully created project 'Game' on GitHub, but initial commit failed:
    //Author identity unknown *** Please tell me who you are. Run git config --global user.email "you@example.com" git config --global user.name "Your Name" to set your account's default identity. Omit --global to set the identity only in this repository. unable to auto-detect email address (got 'student@DESKTOP-3JSB8T1.(none)')
}
