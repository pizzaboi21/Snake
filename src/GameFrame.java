import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame(){
        GamePanel Panel = new GamePanel();
        this.add(Panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
