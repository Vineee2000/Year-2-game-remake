import displayHandler.DisplayCentre;
import gameLogicHandler.GameLogicCentre;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        GameLogicCentre gameLogic = new GameLogicCentre();
        DisplayCentre displayLogic = new DisplayCentre(gameLogic);

        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(2);

        threadPool.scheduleAtFixedRate(gameLogic, 0, 3740, TimeUnit.MICROSECONDS);
        threadPool.execute(displayLogic);
    }
}
