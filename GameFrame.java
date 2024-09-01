import javax.swing.*;

public class GameFrame extends JFrame {

    public void level1() {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("snake.jpg");
        this.setIconImage(icon.getImage());
        this.setVisible(true);
    }

    public void level2() {
        this.add(new Level2());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("snake.jpg");
        this.setIconImage(icon.getImage());
        this.setVisible(true);
    }

    public void level3() {
        this.add(new Level3());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("snake.jpg");
        this.setIconImage(icon.getImage());
        this.setVisible(true);
    }

}
