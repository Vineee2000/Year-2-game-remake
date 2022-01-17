package displayHandler;

import gameLogicHandler.Entity;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.util.List;

public class GameFrame extends JFrame {

    GameFrame(List<Entity> entities) {
        setSize(DisplayCentre.DISPLAY_WIDTH, DisplayCentre.DISPLAY_HEIGHT);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);


    }
}
