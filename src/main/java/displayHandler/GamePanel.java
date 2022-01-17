package displayHandler;

import gameLogicHandler.Entity;

import javax.swing.JPanel;
import java.awt.*;
import java.util.List;

public class GamePanel extends JPanel implements Runnable{
    private List<Entity> entities;

    GamePanel(List<Entity> entities) {
        this.entities = entities;

        this.setLayout(null);
        this.setBackground(new Color(0, 9, 70));
        this.setSize(DisplayCentre.DISPLAY_WIDTH, DisplayCentre.DISPLAY_HEIGHT);
    }

    @Override
    public void run() {
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Entity entity :
                entities) {
            EntitiesDrawer.drawEntity(g, entity);
        }
    }
}
