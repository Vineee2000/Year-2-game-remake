package displayHandler;

import gameLogicHandler.EntitiesHandler;
import gameLogicHandler.Entity;

import java.awt.*;

public class EntitiesDrawer {

    // Suppress default constructor for noninstantiability
    private EntitiesDrawer() {
        throw new AssertionError();
    }

    /**
     * Draws the entity as a grey square
     * This is intended as a fallback render, and not supposed to come up during normal operation
     * @param g
     * @param entity
     */
    public static void drawEntity(Graphics g, Entity entity) {
        g.setColor(Color.gray);
       g.fillRect(gameToDrawingPosX(entity.getXPosition()),
                gameToDrawingPosY(entity.getYPosition()),
                entity.getSize(),
                entity.getSize());
    }

    public static int gameToDrawingPosX(int gamePosX) {
        return (int) Math.round(((double) DisplayCentre.DISPLAY_WIDTH / EntitiesHandler.FIELD_WIDTH) * gamePosX);
    }
    public static int gameToDrawingPosY(int gamePosY) {
        return (int) Math.round(((double) DisplayCentre.DISPLAY_HEIGHT / EntitiesHandler.FIELD_HEIGHT) * gamePosY);
    }
}
