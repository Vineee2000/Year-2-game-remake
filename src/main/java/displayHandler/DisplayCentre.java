package displayHandler;

import gameLogicHandler.Entity;
import gameLogicHandler.GameLogicCentre;
import gameLogicHandler.GameLogicInterface;
import lombok.Getter;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DisplayCentre implements Runnable, DisplayInterface{
    static int DISPLAY_WIDTH = 1280;
    static int DISPLAY_HEIGHT = 720;
    private GameLogicInterface logicCentre;
    @Getter
    private List<Entity> entities;

    public DisplayCentre(GameLogicCentre logicCentre) {
        this.logicCentre = logicCentre;
        entities = Collections.unmodifiableList(logicCentre.getEntities());
    }



    @Override
    public void run() {
        GameFrame gameWindow = new GameFrame(entities);
        GamePanel gamePanel = new GamePanel(entities);
        gameWindow.add(gamePanel);

        gameWindow.setVisible(true);

        ScheduledExecutorService grahpicsExecutor = Executors.newSingleThreadScheduledExecutor();
        grahpicsExecutor.scheduleAtFixedRate(gamePanel, 0, 16666, TimeUnit.MICROSECONDS);
    }

}
