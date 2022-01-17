package gameLogicHandler;

import java.util.ArrayList;

public class GameLogicCentre implements Runnable, GameLogicInterface{
    EntitiesHandler entitiesHandler;

    public GameLogicCentre () {
        MenuLogic menuLogic = new MenuLogic();
        entitiesHandler = new EntitiesHandler();
    }

    @Override
    public void run() {
            entitiesHandler.runGame();
    }

    @Override
    public ArrayList<Entity> getEntities() {
        return entitiesHandler.getEntities();
    }
}
