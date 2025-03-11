package Game;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Game");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack(); //allows us to see the gamepanel

        window.setLocationRelativeTo(null); // sets to centre of screen
        window.setVisible(true);

        gamePanel.startGameThread();


    }
}
